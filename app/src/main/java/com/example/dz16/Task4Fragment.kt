package com.example.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.dz16.databinding.FragmentTask1Binding
import com.example.dz16.databinding.FragmentTask4Binding

class Task4Fragment : Fragment() {
    private lateinit var etInpASide: EditText
    private lateinit var etInpBSide: EditText
    private lateinit var etInpCSide: EditText
    private lateinit var etInpDSide: EditText
    private lateinit var tvCheckSides: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask4Binding.inflate(inflater)
        etInpASide = binding.etInpASide
        etInpBSide = binding.etInpBSide
        etInpCSide = binding.etInpCSide
        etInpDSide = binding.etInpDSide
        tvCheckSides = binding.tvOutCheckSides
        binding.btnCkeckSides.setOnClickListener { checkSides() }
        return binding.root
    }
    fun checkSides() {
        val sideA:String =  etInpASide.text.toString()
        val sideB:String = etInpBSide.text.toString()
        val sideC:String =  etInpCSide.text.toString()
        val sideD:String =  etInpDSide.text.toString()
        tvCheckSides.text = envelope(sideA,sideB,sideC,sideD)
    }
    companion object {
        @JvmStatic
        fun newInstance() = Task4Fragment()
    }
}