package com.example.hiltexampleapplication.data.repo

import com.example.hiltexampleapplication.data.room.dao.PostDao
import com.example.hiltexampleapplication.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by bhupendrapatel on 14/06/22.
 */
class PostRepository @Inject constructor(val postDao: PostDao) {

    suspend fun insertAll(vararg post: Post) = withContext(Dispatchers.IO){
        postDao.insertAllPost(*post)
    }

    fun  loadAll() = postDao.loadAllPost()
}