package com.example.hiltexampleapplication.di

import android.content.Context
import androidx.room.Room
import com.example.hiltexampleapplication.data.room.MyRoomDb
import com.example.hiltexampleapplication.data.room.dao.PostDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by bhupendrapatel on 14/06/22.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getDbName(): String = "RoomDb"

    @Singleton
    @Provides
    fun getRoomDb(@ApplicationContext context: Context, name: String): MyRoomDb =
        Room.databaseBuilder(context, MyRoomDb::class.java, name).build()

    @Singleton
    @Provides
    fun getPostDao(db: MyRoomDb): PostDao = db.getPostDao()
}