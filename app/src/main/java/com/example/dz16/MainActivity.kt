package com.example.dz16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.dz16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sumEvenNums()
        binding.btnTask1.setOnClickListener { startFragment(Task1Fragment()) }
        binding.btnTask2.setOnClickListener { startFragment(Task2Fragment()) }
        binding.btnTask3.setOnClickListener { startFragment(Task3Fragment()) }
        binding.btnTask4.setOnClickListener { startFragment(Task4Fragment()) }
        binding.btnTask6.setOnClickListener { startFragment(Task6Fragment()) }
        binding.btnTask7.setOnClickListener { startFragment(Task7Fragment()) }
    }
    private fun startFragment(fragment:Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, fragment).commit()
    }
}