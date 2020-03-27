package com.yuehai.jianshu.controller

import com.yuehai.jianshu.bean.ResultBean
import com.yuehai.jianshu.service.ArticleService
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class HomeController : BaseController() {

    @Autowired
    private lateinit var articleService: ArticleService

    @CrossOrigin
    @ApiOperation(value = "home", notes = "获取首页数据")
    @GetMapping("home")
    fun homeData(): ResultBean {
        return articleService.selectAllArticles()
    }
}