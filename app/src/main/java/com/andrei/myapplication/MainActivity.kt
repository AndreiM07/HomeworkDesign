package com.andrei.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonOne: Button = findViewById(R.id.button_one)
        val intent=Intent (this, SecondActivity::class.java)

        buttonOne.setOnClickListener {
            startActivity(intent)
        }
    }
}