package com.xuecheng.manage_cms.dao;


import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    /**
     * 根据页面名称查询
     * @author zhangke
     * @date 2020/1/9 15:12
     * @param pageName 页面名称
     * @return CmsPage
     */
    CmsPage findByPageName(String pageName);

    /**
     * 根据页面名称和类型查询
     * @author zhangke
     * @date 2020/1/9 15:13 
     * @param pageName 页面名称
     * @param PageType 页面类型
     * @return CmsPage
     */
    CmsPage findByPageNameAndPageType(String pageName, String PageType);

    /**
     * 根据站点和页面类型查询记录数
     * @author zhangke
     * @date 2020/1/9 15:16
     * @param siteId
     * @param pageType
     * @return
     */
    int countBySiteIdAndPageType(String siteId,String pageType);

    /**
     * //根据站点和页面类型分页查询
     * @author zhangke
     * @date 2020/1/9 15:17
     * @param siteId
    * @param pageType
    * @param pageable
     * @return
     */
    Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);

    CmsPage findByPageNameAndSiteIdAndPageWebPath(String pageName, String siteId, String pageWegPath);
}
