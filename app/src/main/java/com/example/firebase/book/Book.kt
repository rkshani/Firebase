package com.example.firebase.book

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firebase.R
import com.github.barteksc.pdfviewer.PDFView

class Book : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_book)

        pdfView = findViewById(R.id.pdfView)
        pdfView.fromAsset("android.pdf").load()


    }
}