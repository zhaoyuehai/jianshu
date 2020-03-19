package com.yuehai.jianshu.bean

data class ResultBean(
        var code: String,
        val message: String,
        val serviceVersion: String,
        val data: Any? = null
)