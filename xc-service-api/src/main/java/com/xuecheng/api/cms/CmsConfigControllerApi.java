package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/11
 */
@Api(value="cms配置管理接口",description = "cms配置管理接口，提供数据模型的管理、查询接口")
public interface CmsConfigControllerApi {
    /**
     * 根据id查询CMS配置信息
     * @param id
     * @return
     */
    @ApiOperation("根据id查询CMS配置信息")
    CmsConfig getmodel(String id);
}
