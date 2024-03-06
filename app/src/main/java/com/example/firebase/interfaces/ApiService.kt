package com.example.firebase.interfaces

import com.example.firebase.DataClasses.Post
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}