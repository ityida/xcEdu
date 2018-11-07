package com.xuecheng.api.cms;

import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/1
 */

@Api(value="cms站点管理接口",description = "cms站点管理接口")
public interface CmsSiteControllerApi {
    /**
     * 站点查询接口
     * @return
     */
    @ApiOperation("站点查询列表")
    QueryResponseResult findSiteList();
}
