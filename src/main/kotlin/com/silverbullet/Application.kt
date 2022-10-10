package com.silverbullet

import io.ktor.server.application.*
import com.silverbullet.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSockets()
    configureMonitoring()
    configureSecurity()
    configureSerialization()
    configureRouting()
}
