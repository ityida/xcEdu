package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/19
 */
public interface TeachplanMediaPubRepository extends JpaRepository<TeachplanMediaPub,String> {
    /**
     * 根据课程id删除记录
     * @param courseId
     * @return
     */
    long deleteByCourseId(String courseId);
}
