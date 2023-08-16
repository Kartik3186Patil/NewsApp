package com.example.newsapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG="MainActivity"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel= ViewModelProvider(this)[NewsViewModel::class.java]
      val receivedMessage=intent.getStringExtra("ExtraMessage")

        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)

//        lifecycleScope.launch {
//            viewModel.getNews("receivedMessage")
//            viewModel.getArticlesFlow().collect{articles->
//                if(articles.isEmpty()) return@collect
//                recyclerView.adapter=NewsAdapter(articles,this@MainActivity)
//                recyclerView.layoutManager=LinearLayoutManager(this@MainActivity)
//
//            }
//        }
        lifecycleScope.launch {
            receivedMessage?.let { category ->
                viewModel.getNews(category)
                viewModel.getArticlesFlow().collect { articles ->
                    if (articles.isEmpty()) return@collect
                    recyclerView.adapter = NewsAdapter(articles, this@MainActivity)
                    recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                }
            }
        }
    }
}
