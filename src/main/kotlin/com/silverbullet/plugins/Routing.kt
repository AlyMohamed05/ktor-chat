package com.silverbullet.plugins

import com.silverbullet.room.RoomController
import com.silverbullet.routes.chatSocket
import com.silverbullet.routes.getAllMessages
import io.ktor.server.routing.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
