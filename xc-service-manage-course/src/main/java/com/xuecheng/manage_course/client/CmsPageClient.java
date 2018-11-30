package com.xuecheng.manage_course.client;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/29
 * 指定远程调用的服务名
 */
@FeignClient(value = "XC-SERVICE-MANAGE-CMS")
public interface CmsPageClient {
    /**
     * 根据页面id查询页面信息，远程调用cms请求数据
     * 用GetMapping标识远程调用的http的方法类型
     * @param id
     * @return
     */
    @GetMapping("/cms/page/get/{id}")
    CmsPage findCmsPageById(@PathVariable("id") String id);
}
