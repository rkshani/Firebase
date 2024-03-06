package com.example.firebase.ViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.firebase.R

class LiveData : AppCompatActivity() {
    private lateinit var viewModel: LiveDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        viewModel = ViewModelProvider(this)[LiveDataViewModel::class.java]
        val txtCount = findViewById<TextView>(R.id.tvCount)
        val countBtn = findViewById<Button>(R.id.btnCount)

        viewModel.counter.observe(this) {
            txtCount.text = it.toString()
        }

        countBtn.setOnClickListener {


            viewModel.updateCount()

           viewModel.counter.observe(this) {
               txtCount.text = it.toString()
           }


        }
    }
}