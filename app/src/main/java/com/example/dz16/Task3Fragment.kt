package com.example.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.FragmentTask1Binding
import com.example.dz16.databinding.FragmentTask3Binding

class Task3Fragment : Fragment() {

    private lateinit var etInpRating: EditText
    private lateinit var tvOutGrade: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask3Binding.inflate(inflater)

        etInpRating = binding.etInpRating
        tvOutGrade = binding.tvOutGrade
        binding.btnCountRating.setOnClickListener { countGrade() }
        return binding.root
    }
    private fun countGrade() {
        tvOutGrade.text = rating(etInpRating.text.toString())
    }
    companion object {

        @JvmStatic
        fun newInstance() = Task3Fragment()
    }
}