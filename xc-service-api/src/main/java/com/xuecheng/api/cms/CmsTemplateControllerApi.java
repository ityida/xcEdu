package com.xuecheng.api.cms;

import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/6
 */
@Api(value = " cms模板名称接口",description = "cms模板名称接口")
public interface CmsTemplateControllerApi {
    /**
     * 查询所有模板
     * @return
     */
    @ApiOperation(value = "查询所有模板")
    QueryResponseResult findAllCmsTemplate();
}
