package com.gokul.api

import com.gokul.api.services.ReadiumApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ReadiumClient {

    val retrofit=Retrofit.Builder()
        .baseUrl("https://api.realworld.io/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api=retrofit.create(ReadiumApi::class.java)
}