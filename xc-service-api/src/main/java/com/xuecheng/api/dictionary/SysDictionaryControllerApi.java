package com.xuecheng.api.dictionary;

import com.xuecheng.framework.domain.system.SysDictionary;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/21
 */
@Api(value = "数据字典接口",description = "提供数据字典的接口查询")
public interface SysDictionaryControllerApi {
    /**
     * 数据字典
     * @param type
     * @return
     */
    @ApiOperation(value="数据字典查询接口")
    SysDictionary getByType(String type);
}
