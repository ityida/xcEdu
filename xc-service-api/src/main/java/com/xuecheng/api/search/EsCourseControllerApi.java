package com.xuecheng.api.search;

import com.xuecheng.framework.domain.course.CoursePub;
import com.xuecheng.framework.domain.search.CourseSearchParam;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/10
 */
@Api(value = "课程搜索",description = "课程搜索",tags = {"课程搜索"})
public interface EsCourseControllerApi {
    /**
     * 搜索课程信息
     * @param page
     * @param size
     * @param courseSearchParam
     * @return
     */
    @ApiOperation("课程综合搜索")
    QueryResponseResult<CoursePub> list(int page, int size, CourseSearchParam courseSearchParam);
}
