package com.xuecheng.manage_media;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/15
 */
public class TestFile {
    //测试文件分块
    @Test
    public void testChunk() throws IOException {
        //源文件
        File sourceFile = new File("D:\\##myFile&&\\##learning\\CMS\\ffmpeg_test\\lucene.avi");
        //块文件目录
        String chunkFileFolder = "D:\\##myFile&&\\##learning\\CMS\\ffmpeg_test\\chunks\\";

        //先定义块文件大小
        long chunkFileSize = 1 * 1024 * 1024;

        //块数
        long chunkFileNum = (long) Math.ceil(sourceFile.length() * 1.0 / chunkFileSize);

        //创建读文件的对象
        RandomAccessFile raf_read = new RandomAccessFile(sourceFile, "r");

        //缓冲区
        byte[] b = new byte[1024];
        for (int i = 0; i < chunkFileNum; i++) {
            //块文件
            File chunkFile = new File(chunkFileFolder + i);
            //创建向块文件的写对象
            RandomAccessFile raf_write = new RandomAccessFile(chunkFile, "rw");
            int len;

            while ((len = raf_read.read(b)) != -1) {

                raf_write.write(b, 0, len);
                //如果块文件的大小达到 1M开始写下一块儿
                if (chunkFile.length() >= chunkFileSize) {
                    break;
                }
            }
            raf_write.close();


        }
        raf_read.close();
    }

    //测试文件合并
    @Test
    public void testMergeFile() throws IOException {
        //块文件目录
        String chunkFileFolderPath = "D:\\##myFile&&\\##learning\\CMS\\ffmpeg_test\\chunks\\";
        //块文件目录对象
        File chunkFileFolder = new File(chunkFileFolderPath);
        //块文件列表
        File[] files = chunkFileFolder.listFiles();
        //将块文件排序，按名称升序
        List<File> fileList = Arrays.asList(files);
        Collections.sort(fileList, (o1, o2) -> {
            if (Integer.parseInt(o1.getName()) > Integer.parseInt(o2.getName())) {
                return 1;
            }
            return -1;

        });

        //合并文件
        File mergeFile = new File("D:\\##myFile&&\\##learning\\CMS\\ffmpeg_test\\lucene_merge.avi");

        //创建写对象
        RandomAccessFile raf_write = new RandomAccessFile(mergeFile, "rw");

        byte[] b = new byte[1024];
        for (File chunkFile : fileList) {
            //创建一个读块文件的对象
            RandomAccessFile raf_read = new RandomAccessFile(chunkFile, "r");
            int len;
            while ((len = raf_read.read(b)) != -1) {
                raf_write.write(b, 0, len);
            }
            raf_read.close();
            System.out.println("");
        }
        raf_write.close();
    }
}
