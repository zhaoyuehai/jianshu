package com.yuehai.jianshu.service

import com.yuehai.jianshu.bean.ResultBean

interface ArticleService {
    fun selectAllArticles(): ResultBean
}