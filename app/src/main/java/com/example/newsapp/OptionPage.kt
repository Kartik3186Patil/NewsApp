package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class OptionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_page)
        val kp:String;

        val Business=findViewById<Button>(R.id.business)
        val Technology=findViewById<Button>(R.id.technology)
        val Science=findViewById<Button>(R.id.science)
        val Entertainment=findViewById<Button>(R.id.entertainment)
        val Sports=findViewById<Button>(R.id.sports)

       Business.setOnClickListener{
           val message="business"
           val intent=Intent(this,MainActivity::class.java)
           intent.putExtra("ExtraMessage",message)
           startActivity(intent)

       }

        Technology.setOnClickListener{
            val message="technology"
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("ExtraMessage",message)
            startActivity(intent)
       }

        Science.setOnClickListener{
            val message="science"
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("ExtraMessage",message)
            startActivity(intent)
       }

        Entertainment.setOnClickListener{
            val message="entertainment"
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("ExtraMessage",message)
            startActivity(intent)
       }

        Sports.setOnClickListener{
            val message="sports"
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("ExtraMessage",message)
            startActivity(intent)
       }


    }


}