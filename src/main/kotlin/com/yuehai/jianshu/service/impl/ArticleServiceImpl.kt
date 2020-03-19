package com.yuehai.jianshu.service.impl

import com.yuehai.jianshu.bean.ArticleBean
import com.yuehai.jianshu.bean.ResultBean
import com.yuehai.jianshu.mapper.ArticleMapper
import com.yuehai.jianshu.service.ArticleService
import com.yuehai.jianshu.unit.ResultUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ArticleServiceImpl : ArticleService {

    @Autowired
    private lateinit var articleMapper: ArticleMapper

    override fun selectAllArticles(): ResultBean {
        val articles = articleMapper.selectArticle()
        val list = mutableListOf<ArticleBean>()
        articles.forEach { article ->
            list.add(ArticleBean(article.id, article.content))
        }
        return ResultUtil.success(list)
    }
}