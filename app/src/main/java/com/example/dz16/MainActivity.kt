package com.example.dz16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sumEvenNums()
        binding.btnTask1.setOnClickListener { startFragment1() }
        binding.btnTask2.setOnClickListener { startFragment2() }
        binding.btnTask3.setOnClickListener { startFragment3() }
        binding.btnTask4.setOnClickListener { startFragment4() }
        binding.btnTask6.setOnClickListener { startFragment6() }
        binding.btnTask7.setOnClickListener { startFragment7() }
    }
    private fun startFragment1() {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, Task1Fragment.newInstance()).commit()
    }
    private fun startFragment2() {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, Task2Fragment.newInstance()).commit()
    }
    private fun startFragment3() {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, Task3Fragment.newInstance()).commit()
    }
    private fun startFragment4() {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, Task4Fragment.newInstance()).commit()
    }
    private fun startFragment6() {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, Task6Fragment.newInstance()).commit()
    }
    private fun startFragment7() {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, Task7Fragment.newInstance()).commit()
    }
}