package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityThailandBinding

class ThailandActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThailandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThailandBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this@ThailandActivity, MainActivity::class.java)
            startActivity(intent) }
    }
}