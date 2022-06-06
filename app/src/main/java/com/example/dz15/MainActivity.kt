package com.example.dz15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.dz15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTask1.setOnClickListener { startFragment(Task1Fragment()) }
        binding.btnTask2.setOnClickListener { startFragment(Task2Fragment()) }
        binding.btnTask3.setOnClickListener { startFragment(Task3Fragment()) }
        mainSumRanNum()
        mainCat()
    }
    private fun startFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, fragment).commit()
    }
}