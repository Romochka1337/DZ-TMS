package com.example.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.FragmentTask1Binding
import com.example.dz16.databinding.FragmentTask2Binding


class Task2Fragment : Fragment() {
    private lateinit var etInpFuncA: EditText
    private lateinit var etInpFuncB: EditText
    private lateinit var etInpFuncC: EditText
    private lateinit var tvOutFuncResult: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask2Binding.inflate(inflater)
        etInpFuncA = binding.etInpFuncA
        etInpFuncB = binding.etInpFuncB
        etInpFuncC = binding.etInpFuncC
        tvOutFuncResult = binding.tvOutFuncResult
        binding.btnFuncVar.setOnClickListener { functionVar() }
        return binding.root
    }
    fun functionVar() {
        val strA: String = etInpFuncA.text.toString()
        val strB: String = etInpFuncB.text.toString()
        val strC: String = etInpFuncC.text.toString()
        tvOutFuncResult.text = mainFuncVar(strA,strB,strC)
    }
}