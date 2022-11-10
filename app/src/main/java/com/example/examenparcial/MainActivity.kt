package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_1=findViewById<Button>(R.id.bt1)
        bt_1.setOnClickListener{
            val saltar: Intent = Intent(this, imccanino::class.java)
            startActivity(saltar)
        }

    }
}