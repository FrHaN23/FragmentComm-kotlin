package com.example.fragmentcomm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            add(R.id.fragment_1_holder, FirstFragment())
            add(R.id.fragment_2_holder, SecondFragment())
            add(R.id.fragment_3_holder, thirdFragment())
            commit()
        }
    }
}