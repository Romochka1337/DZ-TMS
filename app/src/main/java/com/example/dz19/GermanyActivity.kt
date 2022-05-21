package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityGermanyBinding

class GermanyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGermanyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGermanyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this@GermanyActivity, MainActivity::class.java)
            startActivity(intent) }
    }
}