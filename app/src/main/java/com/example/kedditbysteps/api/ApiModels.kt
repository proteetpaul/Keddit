package com.example.kedditbysteps.api

class RedditNewsDataResponse(
    val author: String,
    val title: String,
    val num_comments: Int,
    val created: Long,
    val thumbnail: String,
    val url: String
)

class RedditChildrenResponse(
    val data: RedditNewsDataResponse
)

class RedditDataResponse(
    val children: List<RedditChildrenResponse>,
    val after: String?,
    val before: String?
)

class RedditNewsResponse(val data: RedditDataResponse)