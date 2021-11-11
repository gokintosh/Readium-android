package com.gokul.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Tags(
    @Json(name = "tags")
    val tags: List<String>
)