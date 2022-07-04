package com.example.dz22

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class MediaService : Service() {
    private lateinit var mediaPlayer:MediaPlayer
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
    override fun onCreate() {
        super.onCreate()
        mediaPlayer= MediaPlayer.create(this, R.raw.betkhoven)
        mediaPlayer.isLooping = true
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mediaPlayer.start()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
    }
}