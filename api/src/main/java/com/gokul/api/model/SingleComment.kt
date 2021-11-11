package com.gokul.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleComment(
    @Json(name = "comment")
    val comment: Comment
)