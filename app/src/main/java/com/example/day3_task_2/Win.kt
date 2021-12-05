package com.example.day3_task_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Win : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        val n=intent.getIntExtra("RandomNumber" , 0)
        findViewById<TextView>(R.id.acceptedNumberView).text="$n"
    }
}