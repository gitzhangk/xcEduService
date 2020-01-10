package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 17:24
 **/
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    PageService pageService;

    /**
     *  分页查询页面信息
     * @author zhangke
     * @date 2020/1/10 13:09
     * @param page 页数
     * @param size 页数大小
     * @param queryPageRequest 查询条件
     * @return QueryResponseResult
     */
    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size")int size, QueryPageRequest queryPageRequest) {
        return pageService.findList(page,size,queryPageRequest);
    }

    /**
     * 新增页面
     * @author zhangke
     * @date 2020/1/10 13:13
     * @param cmsPage 页面参数
     * @return CmsPageResult
     */
    @Override
    @PostMapping("/add")
    public CmsPageResult add(@RequestBody CmsPage cmsPage) {
        return pageService.add(cmsPage);
    }

    /**
     *  根据id获取页面信息
     * @author zhangke
     * @date 2020/1/10 15:20 
     * @param id
     * @return 
     */
    @Override
    @GetMapping("/find/{id}")
    public CmsPage findById(@PathVariable("id") String id) {
        return pageService.getById(id);
    }

    /**
     * 更新页面信息
     * @author zhangke
     * @date 2020/1/10 15:20
     * @param id 项目id
     * @param cmsPage 页面更新信息
     * @return 
     */
    @Override
    @PutMapping("/update/{id}")
    public CmsPageResult update(@PathVariable("id") String id, CmsPage cmsPage) {
        return pageService.update(id,cmsPage);
    }
}
