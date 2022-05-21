package com.example.dz19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToFrance.setOnClickListener {
            val intent = Intent(this@MainActivity, FranceActivity::class.java)
            startActivity(intent)
        }
        binding.btnToGermany.setOnClickListener {
            val intent = Intent(this@MainActivity, GermanyActivity::class.java)
            startActivity(intent)
        }
        binding.btnToBelgium.setOnClickListener {
            val intent = Intent(this@MainActivity, BelgiumActivity::class.java)
            startActivity(intent)
        }
        binding.btnToLatvia.setOnClickListener {
            val intent = Intent(this@MainActivity, LatviaActivity::class.java)
            startActivity(intent)
        }
        binding.btnToThailand.setOnClickListener {
            val intent = Intent(this@MainActivity, ThailandActivity::class.java)
            startActivity(intent)
        }
        binding.btnToMadagascar.setOnClickListener {
            val intent = Intent(this@MainActivity, MadagascarActivity::class.java)
            startActivity(intent)
        }
        binding.btnToSweden.setOnClickListener {
            val intent = Intent(this@MainActivity, SwedenActivity::class.java)
            startActivity(intent)
        }
    }
}