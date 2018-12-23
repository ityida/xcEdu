package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.TeachplanMedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/19
 */
public interface TeachplanMediaRepository extends JpaRepository<TeachplanMedia,String> {
    /**
     * 根据课程id查询列表
     * @param courseId
     * @return
     */
    List<TeachplanMedia> findByCourseId(String courseId);


}
