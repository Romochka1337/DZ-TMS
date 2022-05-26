package com.example.zadanie20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.zadanie20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myServer = MyServer()
    private  val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lifecycle.addObserver(myServer)

        viewModel.setup()
        viewModel.firstName.observe(this, Observer {
            binding.tvFirstName.text = it
        })
        viewModel.lastName.observe(this, Observer {
            binding.tvLastName.text = it
        })
        viewModel.age.observe(this, Observer {
            binding.tvAge.text = it.toString()
        })
    }
}