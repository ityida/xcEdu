package com.xuecheng.learning.dao;

import com.xuecheng.framework.domain.learning.XcLearningCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/1/8
 */
public interface XcLearningCourseRepository extends JpaRepository<XcLearningCourse, String> {

    /**
     * 根据用户id和课程id查询
     *
     * @param userId
     * @param courseId
     * @return
     */
    XcLearningCourse findByUserIdAndCourseId(String userId, String courseId);
}
