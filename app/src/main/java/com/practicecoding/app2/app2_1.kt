package com.practicecoding.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class app2_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app21)

        val btn: Button = findViewById(R.id.button3)
        val btn2: Button = findViewById(R.id.button5)
        val txt: TextView = findViewById(R.id.textView2)
        btn.setOnClickListener()
        {
            val i =Intent(this,app2_2::class.java)
            startActivity(i)
        }


    }
}