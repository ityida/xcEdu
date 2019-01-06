package com.xuecheng.learning.controller;

import com.xuecheng.api.learning.CourseLearningControllerApi;
import com.xuecheng.framework.domain.learning.respones.GetMediaResult;
import com.xuecheng.learning.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/23
 */
@RestController
@RequestMapping("/learning/course")
public class CourseLearningController implements CourseLearningControllerApi {
    @Autowired
    LearningService learningService;

    /**
     * 获取课程学习地址
     * @param courseId
     * @param teachplanId
     * @return
     */
    @Override
    @GetMapping("/getmedia/{courseId}/{teachplanId}")
    public GetMediaResult getmedia(@PathVariable("courseId") String courseId,
                                   @PathVariable("teachplanId")String teachplanId) {
        return learningService.getmedia(courseId,teachplanId);
    }
}