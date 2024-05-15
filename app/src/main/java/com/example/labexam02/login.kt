package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class login : AppCompatActivity() {

    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            ButtonClick(it)
        }
    }

    fun ButtonClick(view: View) {
        val intent = Intent(this, home::class.java)

        startActivity(intent)
        finish()
    }
}