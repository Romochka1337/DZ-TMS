package com.example.dz15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.dz15.databinding.FragmentTask2Binding

class Task2Fragment : Fragment() {
    private lateinit var twRandomNum: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask2Binding.inflate(inflater)
        twRandomNum = binding.twRandNum
        binding.btnRandNum.setOnClickListener { randNum() }
        return binding.root
    }

    private fun randNum() {
        twRandomNum.text = mainRandNum()
    }
    companion object {
        @JvmStatic
        fun newInstance() = Task2Fragment()
    }
}