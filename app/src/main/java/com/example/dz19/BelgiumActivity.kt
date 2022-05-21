package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityFranceBinding

class BelgiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFranceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFranceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this@BelgiumActivity, MainActivity::class.java)
            startActivity(intent) }
    }
}