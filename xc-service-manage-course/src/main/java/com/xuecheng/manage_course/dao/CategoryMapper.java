package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/20
 */
@Mapper
public interface CategoryMapper {
    /**
     * 查询分类
     * @return
     */
    CategoryNode selectList();
}
