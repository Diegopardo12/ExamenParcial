package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_imcfinal.*

class imcfinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcfinal)






        btn_home.setOnClickListener(){
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}