package com.xuecheng.manage_course.dao;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDao {
    @Autowired
    CourseBaseRepository courseBaseRepository;
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    TeachplanMapper teachplanMapper;

    @Test
    public void testCourseBaseRepository(){
        Optional<CourseBase> optional = courseBaseRepository.findById("402885816240d276016240f7e5000002");
        if(optional.isPresent()){
            CourseBase courseBase = optional.get();
            System.out.println(courseBase);
        }

    }

    @Test
    public void testCourseMapper(){
        CourseBase courseBase = courseMapper.findCourseBaseById("402885816240d276016240f7e5000002");
        System.out.println(courseBase);

    }
    @Test
    public void testTeachPlanMapper(){
        TeachplanNode teachplanNode = teachplanMapper.selectList("4028e58161bcf7f40161bcf8b77c0000");
        System.out.println(teachplanNode);
    }

    //测试分页
    @Test
    public void testPageHelper(){
        PageHelper.startPage(1,5);
        Page<CourseBase> courseList = courseMapper.findCourseList();
        // PageInfo<CourseBase> info = new PageInfo<>(courseList);
        List<CourseBase> result = courseList.getResult();
        System.out.println("======"+courseList);
    }


}
