package com.yuehai.jianshu

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@MapperScan("com.yuehai.jianshu.mapper")
@EnableSwagger2
@SpringBootApplication
class JianshuApplication

fun main(args: Array<String>) {
    runApplication<JianshuApplication>(*args)
}

