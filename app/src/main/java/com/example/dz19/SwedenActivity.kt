package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityFranceBinding
import com.example.dz19.databinding.ActivitySwedenBinding

class SwedenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySwedenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwedenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this@SwedenActivity, MainActivity::class.java)
            startActivity(intent) }
    }
}