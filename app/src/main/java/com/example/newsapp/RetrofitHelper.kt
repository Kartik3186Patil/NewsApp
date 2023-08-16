package com.example.newsapp

//import android.provider.SyncStateContract.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitHelper {
        private val retrofit= Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val newsService= retrofit.create(NewsService::class.java)

}