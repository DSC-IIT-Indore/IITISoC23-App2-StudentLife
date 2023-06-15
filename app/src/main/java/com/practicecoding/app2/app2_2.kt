package com.practicecoding.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class app2_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app22)
        val edtxt :EditText=findViewById(R.id.editTextText)
        val edtxt1 :EditText = findViewById(R.id.editTextText2)
        val edtxt2 :EditText =findViewById(R.id.editTextText3)
        val btn4: Button = findViewById(R.id.button4)
        val img : ImageView = findViewById(R.id.imageView)
        val etxt:String =edtxt.text.toString()
        val etxt1:String =edtxt1.text.toString()
        val etxt2:String =edtxt2.text.toString()
    }
}