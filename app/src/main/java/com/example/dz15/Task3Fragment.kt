package com.example.dz15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz15.databinding.FragmentTask2Binding
import com.example.dz15.databinding.FragmentTask3Binding

class Task3Fragment : Fragment() {

    private lateinit var etInpNum: EditText
    private lateinit var twSumOfDs: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask3Binding.inflate(inflater)
        etInpNum = binding.etInpNum
        twSumOfDs = binding.twSumOfDigits
        binding.btnSumOfDigits.setOnClickListener { sumOfDigits() }
        return binding.root
    }

    private fun sumOfDigits() {
        twSumOfDs.text = mainSumOfDs(etInpNum.text.toString())
    }
    companion object {
        @JvmStatic
        fun newInstance() = Task3Fragment()
    }
}