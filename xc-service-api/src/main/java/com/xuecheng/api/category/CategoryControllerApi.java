package com.xuecheng.api.category;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/20
 */
@Api(value="cms目录管理接口",description = "cms目录管理接口，提供数据模型的管理、查询接口")
public interface CategoryControllerApi {
    /**
     * 查询分类
     * @return
     */
    @ApiOperation("查询分类")
    CategoryNode findList();
}
