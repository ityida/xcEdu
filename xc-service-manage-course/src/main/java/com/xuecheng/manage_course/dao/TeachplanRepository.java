package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/19
 */
public interface TeachplanRepository extends JpaRepository<Teachplan,String> {

    /**
     * 根据课程id和parentid查询teachplan，
     * SELECT * FROM teachplan a WHERE a.courseid ='4028e581617f945f01617f9dabc40000'
     * AND a.parentid='0'
     * @param courseId
     * @param parentId
     * @return
     */
    List<Teachplan> findByCourseidAndParentid(String courseId, String parentId);
}
