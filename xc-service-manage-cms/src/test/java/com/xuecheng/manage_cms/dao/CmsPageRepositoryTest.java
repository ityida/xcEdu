package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/2
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {
    @Autowired
    private CmsPageRepository cmsPageRepository;


    @Test
    public void findAllTest(){
        List<CmsPage> list = cmsPageRepository.findAll();
        System.out.println(list);
    }

    /**
     * 分页查询
     */
    @Test
    public void findPageTest(){
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page,size);

        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println(all);
    }

    /**
     * 更新
     */
    @Test
    public void updateTest(){
        //1.根据id查询
        Optional<CmsPage> optional = cmsPageRepository.findById("5af942190e661827d8e2f5e3");
        if(optional.isPresent()){
            CmsPage cmsPage = optional.get();
            //2.修改
            cmsPage.setPageAliase("test00");
            //3.提交
            CmsPage save = cmsPageRepository.save(cmsPage);
            System.out.println(save);
        }
    }


    /**
     * 根据页面名称查询
     */
    @Test
    public void testfindByPageName(){
        CmsPage cmsPage = cmsPageRepository.findByPageName("测试页面");
        System.out.println(cmsPage);
    }
}
