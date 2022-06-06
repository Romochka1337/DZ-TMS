package com.example.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.FragmentTask1Binding
import com.example.dz16.databinding.FragmentTask7Binding

class Task7Fragment : Fragment() {
    private lateinit var etInpDec: EditText
    private lateinit var tvOutBin: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask7Binding.inflate(inflater)
        etInpDec = binding.etInpDec
        tvOutBin = binding.tvOutBinary
        binding.btnDecToBin.setOnClickListener { decToBin() }
        return binding.root
    }
    fun decToBin() {
        tvOutBin.text = decToBin(etInpDec.text.toString())
    }
}