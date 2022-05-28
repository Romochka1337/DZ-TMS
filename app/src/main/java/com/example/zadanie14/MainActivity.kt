package com.example.zadanie14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.zadanie14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainUser()

        val btnTask2 : Button = findViewById(R.id.btnTask2)
        btnTask2.setOnClickListener { startFragment2() }
        val btnTask3 : Button = findViewById(R.id.btnTask3)
        btnTask3.setOnClickListener { startFragment3() }
        val btnTask4 : Button = findViewById(R.id.btnTask4)
        btnTask4.setOnClickListener { startFragment4() }
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
}