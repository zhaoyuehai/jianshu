package com.yuehai.jianshu.mapper

import com.yuehai.jianshu.entity.RecommendEntity

interface RecommendMapper {
    fun selectRecommend(): List<RecommendEntity>
}