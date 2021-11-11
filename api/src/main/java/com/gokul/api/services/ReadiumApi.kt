package com.gokul.api.services

import com.gokul.api.model.ArticlesRepsonse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ReadiumApi {

    @GET("articles")
    fun getArticles():Call<ArticlesRepsonse>



}