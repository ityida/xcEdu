package com.xuecheng.api.search;

import com.xuecheng.framework.domain.course.CoursePub;
import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import com.xuecheng.framework.domain.search.CourseSearchParam;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

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

    /**
     * 根据课程id查询课程信息
     * @param id
     * @return
     */
    @ApiOperation("根据课程id查询课程信息")
    Map<String,CoursePub> getall(String id);

    /**
     * 根据课程计划id查询课程媒资信息
     * @param id
     * @return
     */
    @ApiOperation("根据课程计划id查询课程媒资信息")
    TeachplanMediaPub getmedia(String id);
}
