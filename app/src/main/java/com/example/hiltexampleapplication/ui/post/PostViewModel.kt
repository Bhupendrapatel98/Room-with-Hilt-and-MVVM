package com.example.hiltexampleapplication.ui.post

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltexampleapplication.data.repo.PostRepository
import com.example.hiltexampleapplication.model.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by bhupendrapatel on 14/06/22.
 */

@HiltViewModel
class PostViewModel @Inject constructor(val postRepository: PostRepository): ViewModel() {

    val postLiveData = postRepository.loadAll()

    fun insertAll(vararg  post: Post) = viewModelScope.launch {
        postRepository.insertAll(*post)
    }
}