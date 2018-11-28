package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CoursePic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/27
 */
public interface CoursePicRepository extends JpaRepository<CoursePic,String> {
    /**
     * 当返回值大于0，表示删除成功的记录数
     * @param courseId
     */
    long deleteByCourseid(String courseId);
}
