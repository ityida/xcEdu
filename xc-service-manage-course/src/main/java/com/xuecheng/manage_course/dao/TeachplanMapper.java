package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/18
 */
@Mapper
public interface TeachplanMapper {
    /***
     * 课程计划查询
     * @param courseId
     * @return
     */
    TeachplanNode selectList(String courseId);
}
