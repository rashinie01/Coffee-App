package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class register : AppCompatActivity() {

    lateinit var btnRegister1: Button
    lateinit var registerlogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister1 = findViewById(R.id.butRegister1)

        btnRegister1.setOnClickListener {
            ButtonClick(it)
        }

        registerlogin = findViewById(R.id.registerlogin)

        registerlogin.setOnClickListener {
                TextViewClick(it)
            }

    }

    fun ButtonClick(view: View) {
        val intent = Intent(this, login::class.java)

        startActivity(intent)
        finish()
    }
        fun TextViewClick(view: View) {
            val intent = Intent(this, login::class.java)

            startActivity(intent)
            finish()
        }
}