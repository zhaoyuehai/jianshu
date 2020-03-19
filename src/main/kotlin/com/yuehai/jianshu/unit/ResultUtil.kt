package com.yuehai.jianshu.unit

import com.yuehai.jianshu.bean.ResultBean
import com.yuehai.jianshu.bean.ResultState

object ResultUtil {
    private const val VERSION = "1.0"

    fun success(data: Any? = null, message: String? = null): ResultBean {
        return ResultBean(ResultState.SUCCESS.code, message ?: ResultState.SUCCESS.message, VERSION, data)
    }
}