package com.xuecheng.framework.model.response;

import com.xuecheng.framework.model.request.RequestData;

/**
 * @author zhangke
 * @data 10:46
 **/
public class QueryPageRequest extends RequestData {
    //站点id
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    // 别名
    private String pageAliase;
    // 模版id
    private String templateId;
}
