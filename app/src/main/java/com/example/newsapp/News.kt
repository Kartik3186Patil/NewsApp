package com.example.newsapp

import com.google.gson.annotations.SerializedName

data class News (
    @SerializedName("totalResults") val totalResults:Int,
    val articles:List<Article>

    )
/*
    {
        "status": "ok",
        "totalResults": 69,
        "articles": [ … ]
    }

*/
