package com.yuehai.jianshu.controller

import com.yuehai.jianshu.bean.ResultBean
import com.yuehai.jianshu.unit.ResultUtil
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class HelloController : BaseController() {

    @ApiOperation(value = "hello jianshu!", notes = "api测试")
    @RequestMapping("hello")
    fun hello(): ResultBean {
        return ResultUtil.success("hello jianshu!")
    }
}