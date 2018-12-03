package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CourseMarket;
import com.xuecheng.framework.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/1
 */
@Data
@NoArgsConstructor
@ToString
public class CourseView implements java.io.Serializable{
    /**
     * 基础信息
     */
    private CourseBase courseBase;
    /**
     * 课程营销
     */
    private CourseMarket courseMarket;
    /**
     *课程图片
     */
    private CoursePic coursePic;
    /**
     *教学计划
     */
    private TeachplanNode TeachplanNode;
}
