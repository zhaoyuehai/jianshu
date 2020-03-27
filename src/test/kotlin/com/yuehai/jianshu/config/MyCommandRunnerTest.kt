package com.yuehai.jianshu.config

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MyCommandRunnerTest {

    @Test
    fun run() {
        val cmd = "cmd /c start http://localhost"
        try {
            Runtime.getRuntime().exec(cmd)
        } catch (e: Exception) {
            print(e.toString())
        }
    }
}