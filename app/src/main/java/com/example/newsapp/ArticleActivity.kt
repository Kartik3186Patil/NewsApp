package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.browser.customtabs.CustomTabsIntent
import com.bumptech.glide.Glide
import org.w3c.dom.Text
import java.sql.Types.NULL

class ArticleActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val articleImage:ImageView=findViewById(R.id.article_image)
        val articleTitle:TextView=findViewById(R.id.article_title)
        val articleAuthor:TextView=findViewById(R.id.article_author)
        val articleDesc:TextView=findViewById(R.id.article_description)
        val readMoreButton:Button=findViewById(R.id.read_more_button)

        val imageUrl=intent.getStringExtra("imageUrl")
        val title=intent.getStringExtra("title")
        val author=intent.getStringExtra("author")
        val description=intent.getStringExtra("description")
        val articleUrl=intent.getStringExtra("articleUrl")

        Glide.with(this)
            .load(imageUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(articleImage)

        articleTitle.text=title
        articleAuthor.text= buildString {
//        append("Written by: ")
            val nullAuthor:String?=author
            val result=nullAuthor?.let {
                append("Written By:")
                append(author)
            }?:run{
                append("No author information")
            }



    }
        articleDesc.text=description

        readMoreButton.setOnClickListener{
            //This will open outside the browser
//         val urlIntent=Intent(Intent.ACTION_VIEW, Uri.parse(articleUrl))
//            startActivity(urlIntent)

           val customTabsIntent= CustomTabsIntent.Builder().build()
          customTabsIntent.launchUrl(this, Uri.parse(articleUrl))
        }
    }
}