package com.example.hiltexampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Constructor Injection
    //@Inject gives Hilt access to Mobile's constructor. This means that now Hilt can generate instances of Mobile.
    //ye wala injection ye btata h ki object kese create krna h

    // Field
    //ye inject ye btayega ki is filed me object pass krna h means jis-jis field me @Inject lga rhega dagger ko pta chal jayega ki in in field ko object provide krna h
    //ye inject btata hai ki is field pr hme injection chahiye
    // It identifies the injectable field.Injectable means that Hilt can supply the instantiated dependencies to it.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
