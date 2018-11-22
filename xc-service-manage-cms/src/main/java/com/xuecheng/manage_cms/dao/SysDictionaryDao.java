package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.system.SysDictionary;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/21
 */
public interface SysDictionaryDao extends MongoRepository<SysDictionary,String> {

    /**
     * 根据字典分类查询字典信息
     * @param type
     * @return
     */
    SysDictionary findBydType(String type);
}
