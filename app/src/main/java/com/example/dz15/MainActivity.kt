package com.example.dz15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.dz15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTask1.setOnClickListener { startFragment1() }
        binding.btnTask2.setOnClickListener { startFragment2() }
        binding.btnTask3.setOnClickListener { startFragment3() }
        mainSumRanNum()
        mainCat()
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
}