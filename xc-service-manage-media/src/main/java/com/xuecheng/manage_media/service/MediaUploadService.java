package com.xuecheng.manage_media.service;

import com.xuecheng.framework.domain.media.MediaFile;
import com.xuecheng.framework.domain.media.response.MediaCode;
import com.xuecheng.framework.exception.ExceptionCast;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.manage_media.dao.MediaFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Optional;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/17
 */
@Service
public class MediaUploadService {
    @Autowired
    MediaFileRepository mediaFileRepository;

    @Value("${xc-service-manage-media.upload-location}")
    String upload_location;


    /**
     * 得到文件所属目录路径
     * @param fileMd5
     * @return
     */
    private String getFileFolderPath(String fileMd5){
        return  upload_location + fileMd5.substring(0,1) + "/" + fileMd5.substring(1,2) + "/" + fileMd5 + "/";
    }

    /**
     * 得到文件的路径
     * @param fileMd5
     * @param fileExt
     * @return
     */
    private String getFilePath(String fileMd5,String fileExt){
        return upload_location + fileMd5.substring(0,1) + "/" + fileMd5.substring(1,2) + "/" + fileMd5 + "/" + fileMd5 + "." +fileExt;
    }

    /**
     * 文件上传前的注册，检查文件是否存在
     * 根据文件md5得到文件路径
     * 规则：
     * 一级目录：md5的第一个字符
     * 二级目录：md5的第二个字符
     * 三级目录：md5
     * 文件名：md5+文件扩展名
     * @param fileMd5 文件md5值
     * @param fileExt 文件扩展名
     * @return 文件路径
     */
    public ResponseResult register(String fileMd5, String fileName, Long fileSize, String mimetype, String fileExt) {
        //1  检查文件在磁盘上是否存在
        //文件所属目录的路径
        String fileFolderPath = this.getFileFolderPath(fileMd5);
        //文件的路径
        String filePath =this.getFilePath(fileMd5,fileExt);
        File file = new File(filePath);
        //文件是否存在
        boolean exists = file.exists();

        //2 检查文件信息在mongodb中是否存在
        Optional<MediaFile> optional = mediaFileRepository.findById(fileMd5);
        if(exists && optional.isPresent()){
            //文件存在
            ExceptionCast.cast(MediaCode.UPLOAD_FILE_REGISTER_EXIST);
        }
        //文件不存在时作一些准备工作，检查文件所在目录是否存在，如果不存在则创建
        File fileFolder = new File(fileFolderPath);
        if(!fileFolder.exists()){
            fileFolder.mkdirs();
        }

        return new ResponseResult(CommonCode.SUCCESS);
    }
}
