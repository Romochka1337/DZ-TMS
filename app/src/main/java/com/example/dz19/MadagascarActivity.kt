package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityFranceBinding
import com.example.dz19.databinding.ActivityMadagascarBinding

class MadagascarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMadagascarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMadagascarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this@MadagascarActivity, MainActivity::class.java)
            startActivity(intent) }
    }
}