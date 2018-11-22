package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.dao.SysDictionaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/21
 */
@Service
public class SysDictionaryService {
    @Autowired
    SysDictionaryDao sysDictionaryDao;

    /**
     * 根据字典分类查询字典信息
     * @param type
     * @return
     */
    public SysDictionary findDictionaryByType(String type){
        return sysDictionaryDao.findBydType(type);
    }
}
