package com.xuecheng.api.course;

import com.xuecheng.framework.domain.course.*;
import com.xuecheng.framework.domain.course.ext.CourseView;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.domain.course.response.AddCourseResult;
import com.xuecheng.framework.domain.course.response.CoursePublishResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/18
 */
@Api(value = "课程管理接口", description = "课程管理接口，提供课程的增、删、改、查")
public interface CourseControllerApi {
    /**
     * 课程计划查询
     *
     * @param courseId
     * @return
     */
    @ApiOperation("课程计划查询")
    TeachplanNode findTeachplanList(String courseId);

    /**
     * 添加课程计划
     *
     * @param teachplan
     * @return
     */
    @ApiOperation("添加课程计划")
    ResponseResult addTeachplan(Teachplan teachplan);

    /**
     * 查询我的课程列表
     *
     * @param page
     * @param size
     * @param courseListRequest
     * @return
     */
    @ApiOperation("查询我的课程列表")
    QueryResponseResult findCourseList(
            int page,
            int size,
            CourseListRequest courseListRequest
    );


    /**
     * 新增我的课程列表
     *
     * @param courseBase
     * @return
     */
    @ApiOperation("新增我的课程列表")
    AddCourseResult addCourseBase(CourseBase courseBase);

    /**
     * 获取课程基础信息
     *
     * @param courseId
     * @return
     */
    @ApiOperation("获取课程基础信息")
    CourseBase getCourseBaseById(String courseId) throws RuntimeException;

    /**
     * 更新课程基础信息
     *
     * @param id
     * @param courseBase
     * @return
     */
    @ApiOperation("更新课程基础信息")
    ResponseResult updateCourseBase(String id, CourseBase courseBase);

    /**
     * 获取课程营销信息
     *
     * @param courseId
     * @return
     */
    @ApiOperation("获取课程营销信息")
    CourseMarket getCourseMarketById(String courseId);

    /**
     * 更新课程营销信息
     *
     * @param id
     * @param courseMarket
     * @return
     */
    @ApiOperation("更新课程营销信息")
    ResponseResult updateCourseMarket(String id, CourseMarket courseMarket);

    /**
     * 查询课程图片
     *
     * @param courseId
     * @param pic
     * @return
     */
    @ApiOperation("添加课程图片")
    ResponseResult addCoursePic(String courseId, String pic);

    /**
     * 查询课程图片
     *
     * @param courseId
     * @return
     */
    @ApiOperation("查询课程图片")
    CoursePic findCoursePic(String courseId);

    /**
     * 删除课程图片
     *
     * @param courseId
     * @return
     */
    @ApiOperation("删除课程图片")
    ResponseResult deleteCoursePic(String courseId);

    /**
     * 课程视图查询
     *
     * @param id
     * @return
     */
    @ApiOperation("课程视图查询")
    CourseView courseview(String id);

    /**
     * 课程预览
     *
     * @param id
     * @return
     */
    @ApiOperation("课程预览")
    CoursePublishResult preview(String id);

    /**
     * 课程发布
     *
     * @param id
     * @return
     */
    @ApiOperation("课程发布")
    CoursePublishResult publish(String id);

    /**
     * 保存课程计划与媒资文件关联
     * @param teachplanMedia
     * @return
     */
    @ApiOperation("保存课程计划与媒资文件关联")
    ResponseResult savemedia(TeachplanMedia teachplanMedia);
}
