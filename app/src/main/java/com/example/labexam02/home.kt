package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class home : AppCompatActivity() {

    lateinit var btnSubmit: Button
    lateinit var btnDelete: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnSubmit = findViewById(R.id.btnSubmit)
        btnDelete = findViewById(R.id.btnDelete)


        btnSubmit.setOnClickListener {
            ButtonClick(it)
        }

        btnDelete.setOnClickListener{
            delete()
        }
    }

    fun ButtonClick(view: View) {
        val intent = Intent(this, submit::class.java)

        startActivity(intent)
        finish()
    }

    fun delete(){
        Toast.makeText(this, "Delete Your Profile", Toast.LENGTH_LONG).show()
    }
}