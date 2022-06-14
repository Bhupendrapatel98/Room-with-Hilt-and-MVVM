package com.example.hiltexampleapplication.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hiltexampleapplication.data.room.dao.PostDao
import com.example.hiltexampleapplication.model.Post

/**
 * Created by bhupendrapatel on 14/06/22.
 */

@Database(entities = [Post::class], version = 1, exportSchema = false)
abstract class MyRoomDb :RoomDatabase(){
    abstract fun getPostDao():PostDao
}