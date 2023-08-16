package com.example.newsapp

import retrofit2.http.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey

interface NewsService {
    @GET("top-headlines")
    suspend fun fetchHeadlines(
        @Query("country")country:String,
        @Query("category")category: String,
        @Query("apiKey")apiKey: String
    ):News
}