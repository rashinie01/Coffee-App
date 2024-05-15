package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnRegister: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            ButtonClick(it)
        }
    }

    fun ButtonClick(view: View) {
        val intent = Intent(this, register::class.java)

        startActivity(intent)
        finish()
    }

}