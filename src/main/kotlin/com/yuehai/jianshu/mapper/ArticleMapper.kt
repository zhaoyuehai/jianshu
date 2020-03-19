package com.yuehai.jianshu.mapper

import com.yuehai.jianshu.entity.ArticleEntity

interface ArticleMapper {
    fun selectArticle(): List<ArticleEntity>
}