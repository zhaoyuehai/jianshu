package com.yuehai.jianshu

import com.yuehai.jianshu.mapper.RecommendMapper
import com.yuehai.jianshu.mapper.TopicMapper
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JianshuApplicationTests {
    private val logger = LoggerFactory.getLogger(JianshuApplicationTests::class.java)

    @Autowired
    private lateinit var topicMapper: TopicMapper

    @Autowired
    private lateinit var recommendMapper: RecommendMapper

    @Test
    fun contextLoads() {
        recommendMapper.selectRecommend()
        topicMapper.selectTopic()
    }

}
