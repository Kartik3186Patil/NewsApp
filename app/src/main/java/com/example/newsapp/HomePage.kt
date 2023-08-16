package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
         val goButton=findViewById<Button>(R.id.start_button)
        goButton.setOnClickListener{
            val intent= Intent(this,OptionPage::class.java)
            startActivity(intent)
        }
    }
}