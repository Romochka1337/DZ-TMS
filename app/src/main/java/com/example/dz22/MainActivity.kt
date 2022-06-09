package com.example.dz22

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dz22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startLoginFragment()
    }
    private fun startLoginFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, LoginFragment()).commit()
    }
}