package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import org.w3c.dom.Text

class submit : AppCompatActivity() {

    lateinit var success_im : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        success_im = findViewById(R.id.success_im)

        success_im.setOnClickListener {
            TextViewClick(it)
        }
    }
    fun TextViewClick(view: View) {
        val intent = Intent(this, viewpage::class.java)

        startActivity(intent)
        finish()
    }
}
