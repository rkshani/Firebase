package com.example.firebase.Retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firebase.DataClasses.Post
import com.example.firebase.R
import com.example.firebase.singletons.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DemoApiCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_api_call)

        val textView: TextView = findViewById(R.id.textView)
        RetrofitClient.instance.getPosts().enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful) {
                    textView.text = response.body()?.joinToString(separator = "\n\n") { post ->
                        "Title: ${post.title}\nBody: ${post.body}"
                    }

                } else {
                    textView.text = "Error: ${response.code()}"
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                textView.text = t.message
            }

        })
    }
}