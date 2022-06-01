package com.example.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.FragmentTask1Binding
import com.example.dz16.databinding.FragmentTask6Binding

class Task6Fragment : Fragment() {
    private lateinit var etInpFact: EditText
    private lateinit var tvOutFact: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask6Binding.inflate(inflater)
        etInpFact = binding.etInpFacNum
        tvOutFact = binding.tvOutFactorial
        binding.btnFactorial.setOnClickListener { countFactorial() }
        return binding.root
    }
    private fun countFactorial() {
        tvOutFact.text = factorial(etInpFact.text.toString())
    }
}