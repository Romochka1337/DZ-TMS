package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityLatviaBinding

class LatviaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLatviaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatviaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this@LatviaActivity, MainActivity::class.java)
            startActivity(intent) }
    }
}