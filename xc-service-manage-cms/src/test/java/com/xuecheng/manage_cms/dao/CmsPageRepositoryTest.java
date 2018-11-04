package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
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
     * 分页条件查询
     */
    @Test
    public void findByExampleTest(){
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page,size);

        CmsPage cmsPage = new CmsPage();
        cmsPage.setSiteId("6a751fab6abb5044e0d19ea1");
        cmsPage.setPageAliase("播");

//        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());

        Example<CmsPage> example = Example.of(cmsPage,exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        List<CmsPage> content = all.getContent();
        System.out.println(content);
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
