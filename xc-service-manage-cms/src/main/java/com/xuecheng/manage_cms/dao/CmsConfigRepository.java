package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/11
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
