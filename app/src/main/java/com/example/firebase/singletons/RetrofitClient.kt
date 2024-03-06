package com.example.firebase.singletons

import retrofit2.Retrofit
import com.example.firebase.interfaces.ApiService
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL  = "https://jsonplaceholder.typicode.com/"
    val instance: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}