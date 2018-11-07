package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/4
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {

}
