package com.example.hiltexampleapplication.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.hiltexampleapplication.model.Post

/**
 * Created by bhupendrapatel on 14/06/22.
 */

@Dao
interface PostDao {

    @Insert
    suspend fun insert(post: Post)

    @Update
    suspend fun update(post: Post)

    @Delete
    suspend fun delete(post: Post)

    @Query("Select * from post")
    fun loadAllPost(): LiveData<List<Post>>

    @Insert
    suspend fun insertAllPost(vararg post: Post)
}