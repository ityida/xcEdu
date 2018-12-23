package com.xuecheng.search.controller;

import com.xuecheng.api.search.EsCourseControllerApi;
import com.xuecheng.framework.domain.course.CoursePub;
import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import com.xuecheng.framework.domain.search.CourseSearchParam;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.search.service.EsCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/10
 */
@RestController
@RequestMapping("/search/course")
public class EsCourseController implements EsCourseControllerApi {
    @Autowired
    EsCourseService esCourseService;

    /**
     * 课程搜索
     *
     * @param page
     * @param size
     * @param courseSearchParam
     * @return
     */
    @Override
    @GetMapping(value = "/list/{page}/{size}")
    public QueryResponseResult<CoursePub> list(@PathVariable("page") int page, @PathVariable("size") int size, CourseSearchParam courseSearchParam) {
        return esCourseService.list(page, size, courseSearchParam);
    }

    /**
     * 根据课程id查询课程所有信息
     *
     * @param id
     * @return
     */
    @Override
    @GetMapping("/getall/{id}")
    public Map<String, CoursePub> getall(@PathVariable("id") String id) {
        return esCourseService.getall(id);
    }

    /**
     * @param teachplanId
     * @return
     */
    @Override
    @GetMapping(value = "/getmedia/{teachplanId}")
    public TeachplanMediaPub getmedia(@PathVariable("teachplanId") String teachplanId) {
        //将一个id加入数组，传给service方法  这样做扩展性好
        String[] teachplanIds = new String[]{teachplanId};
        QueryResponseResult<TeachplanMediaPub> queryResponseResult = esCourseService.getmedia(teachplanIds);
        QueryResult<TeachplanMediaPub> queryResult = queryResponseResult.getQueryResult();
        if (queryResult != null) {
            List<TeachplanMediaPub> list = queryResult.getList();
            if (list != null && list.size() > 0) {
                return list.get(0);
            }
        }
        return new TeachplanMediaPub();
    }
}
