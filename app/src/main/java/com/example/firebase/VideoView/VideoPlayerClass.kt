package com.example.firebase.VideoView

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.firebase.R

class VideoPlayerClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player_class)
        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)
        val uri : Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.video)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

    }
}