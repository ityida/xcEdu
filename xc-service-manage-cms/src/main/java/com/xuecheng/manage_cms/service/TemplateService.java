package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.domain.cms.CmsTemplate;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/4
 */
@Service
public class TemplateService {
    @Autowired
    private CmsTemplateRepository cmsTemplateRepository;

    /**
     * 查询所有站点的方法
     * @return
     */
    public QueryResponseResult findTemplateList(){
        List<CmsTemplate> all = cmsTemplateRepository.findAll();

        QueryResult queryResult = new QueryResult();
        //数据列表
        queryResult.setList(all);
        //数据总记录数
        queryResult.setTotal(all.size());

        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return queryResponseResult;
    }
}
