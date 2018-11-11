package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsConfigControllerApi;
import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/11
 */
@RestController
@RequestMapping("/cms/config")
public class CmsConfigController implements CmsConfigControllerApi {
    @Autowired
    private PageService pageService;

    /**
     * 通过id查询Config信息
     * @param id
     * @return
     */
    @GetMapping("/getmodel/{id}")
    @Override
    public CmsConfig getmodel(@PathVariable("id") String id) {
        return pageService.getConfigById(id);
    }
}
