package com.yuehai.jianshu.mapper

import com.yuehai.jianshu.entity.TopicEntity

interface TopicMapper {
    fun selectTopic(): List<TopicEntity>
}