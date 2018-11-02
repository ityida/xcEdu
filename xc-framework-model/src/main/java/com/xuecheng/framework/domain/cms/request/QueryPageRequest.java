package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/1
 */
@Data
public class QueryPageRequest {
    //接收页面查询的查询条件
    //站点id
    //站点id
    /**
     * 接收页面查询的查询条件
     *站点id
     */
    @ApiModelProperty("站点id")
    private String siteId;
    /**
     *页面ID
     */
    private String pageId;
    /**
     *页面名称
     */
    private String pageName;
    /**
     *别名
     */
    private String pageAliase;
    /**
     *模版id
     */
    private String templateId;
    /**
     *....
     */
}