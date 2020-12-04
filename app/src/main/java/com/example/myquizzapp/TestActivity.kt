package com.example.myquizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val qlist=Constant.getQuestion()
        Log.i("Question Size","${qlist.size}")
    }
}