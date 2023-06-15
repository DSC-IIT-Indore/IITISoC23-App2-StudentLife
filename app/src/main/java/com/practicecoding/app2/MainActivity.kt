package com.practicecoding.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button =findViewById<Button>(R.id.button)
        btn.setOnClickListener()
        {
            val Intent = Intent(this,app2_1::class.java)
            startActivity(Intent)
        }
    }
}