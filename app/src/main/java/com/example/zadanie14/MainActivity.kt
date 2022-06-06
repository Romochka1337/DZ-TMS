package com.example.zadanie14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.zadanie14.databinding.ActivityMainBinding
import com.example.zadanie14.databinding.FragmentTask2Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainUser()

        val btnTask2 : Button = findViewById(R.id.btnTask2)
        btnTask2.setOnClickListener { startFragment(Task2Fragment()) }
        val btnTask3 : Button = findViewById(R.id.btnTask3)
        btnTask3.setOnClickListener { startFragment(Task3Fragment()) }
        val btnTask4 : Button = findViewById(R.id.btnTask4)
        btnTask4.setOnClickListener { startFragment(Task4Fragment()) }
    }
    private fun startFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, fragment).commit()
    }
}