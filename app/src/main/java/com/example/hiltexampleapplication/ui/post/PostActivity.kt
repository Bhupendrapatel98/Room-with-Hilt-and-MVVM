package com.example.hiltexampleapplication.ui.post

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.hiltexampleapplication.R
import com.example.hiltexampleapplication.model.Post
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostActivity : AppCompatActivity() {

    private val mViewModel:PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        mViewModel.insertAll(
            Post(0,"title","Des"),
            Post(0,"title","Des"),
            Post(0,"title","Des"),
            Post(0,"title","Des")
        )

        mViewModel.postLiveData.observe(this){
            Log.d("TAG", "onCreate: $it")
        }

    }
}