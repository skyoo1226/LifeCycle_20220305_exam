package com.skyoo.lifecycle_20220305_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

        btnMove.setOnClickListener {


        }

    }

    fun setValues() {

        Log.d("메인화면", "onCreate 실행됨")
    }

}