package com.silverbullet.di

import com.silverbullet.data.MessageDataSource
import com.silverbullet.data.MessageDataSourceImpl
import com.silverbullet.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mainModule = module {

    single {
        KMongo
            .createClient()
            .coroutine
            .getDatabase("messages_db")
    }

    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }

    single {
        RoomController(get())
    }

}