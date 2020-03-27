package com.yuehai.jianshu.config

import com.yuehai.jianshu.unit.SystemUtil
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class MyCommandRunner : CommandLineRunner {

    @Value("\${config.auto.open-browser}")
    private var openBrowser = true

    @Value("\${config.auto.print-host-url}")
    private var printHostUrl = true

    override fun run(vararg args: String?) {
        if (printHostUrl || openBrowser) {
            val hostAddress = SystemUtil.getIP()?.hostAddress ?: return
            if (printHostUrl) {
                printString(hostAddress)
            }
            if (openBrowser) {
                val cmd = "cmd /c start http://$hostAddress"
                try {
                    Runtime.getRuntime().exec(cmd)
                } catch (e: Exception) {
                }
            }
        }
    }


    fun printString(hostAddress: String) {
        val sb = StringBuffer("[")
        for (i in 0 until hostAddress.length + 10) {
            sb.append("-")
        }
        val sbStr = sb.append("]").toString()
        println(sbStr)
        println(sbStr)
        println("[---- $hostAddress ----]")
        println(sbStr)
        println(sbStr)
    }
}