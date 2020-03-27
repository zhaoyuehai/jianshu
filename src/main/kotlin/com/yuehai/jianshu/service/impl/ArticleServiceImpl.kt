package com.yuehai.jianshu.service.impl

import com.yuehai.jianshu.bean.*
import com.yuehai.jianshu.mapper.ArticleMapper
import com.yuehai.jianshu.mapper.RecommendMapper
import com.yuehai.jianshu.mapper.TopicMapper
import com.yuehai.jianshu.service.ArticleService
import com.yuehai.jianshu.unit.ResultUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ArticleServiceImpl : ArticleService {

    @Autowired
    private lateinit var articleMapper: ArticleMapper

    @Autowired
    private lateinit var topicMapper: TopicMapper

    @Autowired
    private lateinit var recommendMapper: RecommendMapper

    override fun selectAllArticles(): ResultBean {
        val topicBeans = mutableListOf<TopicBean>()
        val topics = topicMapper.selectTopic()
        topics.forEach {
            topicBeans.add(TopicBean(it.id, it.desc, it.imgUrl))
        }
        val articles = articleMapper.selectArticle()
        val articleBeans = mutableListOf<ArticleBean>()
        articles.forEach {
            articleBeans.add(ArticleBean(it.id, it.title, it.imgUrl, it.content))
        }
        val recommendBeans = mutableListOf<RecommendBean>()
        val recommend = recommendMapper.selectRecommend()
        recommend.forEach {
            recommendBeans.add(RecommendBean(it.id, it.imgUrl))
        }
        return ResultUtil.success(HomeDataBean(topicBeans, articleBeans, recommendBeans))
    }
}