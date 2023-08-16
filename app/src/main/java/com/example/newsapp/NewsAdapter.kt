package com.example.newsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NewsAdapter(val newsList:List<Article>,val context: Context):RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    class NewsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val newsImage=itemView.findViewById<ImageView>(R.id.news_image)
        val newsTitle=itemView.findViewById<TextView>(R.id.title_text)
        val newsDesc=itemView.findViewById<TextView>(R.id.desc_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false)
        return NewsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem=newsList[position]
        holder.newsTitle.text=currentItem.titleText
        holder.newsDesc.text=currentItem.descText
        Glide.with(context)
            .load(currentItem.imageUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.newsImage)

        holder.itemView.setOnClickListener{
            val intent=Intent(context,ArticleActivity::class.java)
            val bundle=bundleOf(
                "imageUrl" to currentItem.imageUrl,
                "title" to currentItem.titleText,
                "author" to currentItem.authorName,
                "description" to currentItem.descText,
                "articleUrl" to currentItem.articleUrl
            )
            intent.putExtras(bundle)
            context.startActivity(intent)
        }
    }


}