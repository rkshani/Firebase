package com.example.firebase.ViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firebase.R

class LiveData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        val txtCount = findViewById<TextView>(R.id.tvCount)
        val countBtn = findViewById<Button>(R.id.btnCount)
        var counter = 0

        countBtn.setOnClickListener {
            txtCount.text = counter.toString()
            ++counter
            txtCount.text = counter.toString()

        }
    }
}