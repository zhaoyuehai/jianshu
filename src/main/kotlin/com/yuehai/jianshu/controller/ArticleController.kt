package com.yuehai.jianshu.controller

import com.yuehai.jianshu.bean.ResultBean
import com.yuehai.jianshu.service.ArticleService
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class ArticleController : BaseController() {

    @Autowired
    private lateinit var articleService: ArticleService

    @ApiOperation(value = "articles", notes = "获取文章列表")
    @RequestMapping("articles")
    fun articles(): ResultBean {
        return articleService.selectAllArticles()
    }
}