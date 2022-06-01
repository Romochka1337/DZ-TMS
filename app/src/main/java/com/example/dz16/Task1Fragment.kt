package com.example.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.FragmentTask1Binding

class Task1Fragment : Fragment() {

    private lateinit var etInpNumA: EditText
    private lateinit var etInpNumB: EditText
    private lateinit var tvOutEvenOrOdd: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask1Binding.inflate(inflater)
        etInpNumA = binding.etInpNumA
        etInpNumB = binding.etInpNumB
        tvOutEvenOrOdd = binding.tvOutEvenOrOdd
        binding.btnEvenOrOdd.setOnClickListener { evenOrOdd() }
        return binding.root
    }
    private fun evenOrOdd() {
        tvOutEvenOrOdd.text = evenOrOdd(etInpNumA.text.toString(), etInpNumB.text.toString())
    }
}