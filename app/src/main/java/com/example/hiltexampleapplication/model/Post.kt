package com.example.hiltexampleapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by bhupendrapatel on 14/06/22.
 */
@Entity
data class Post(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var title: String,
    var description: String
)