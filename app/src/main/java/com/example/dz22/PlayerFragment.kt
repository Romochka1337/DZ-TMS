package com.example.dz22

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.dz22.databinding.FragmentPlayerBinding

class PlayerFragment : Fragment() {
    private lateinit var btnStart: Button
    private lateinit var btnPause:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPlayerBinding.inflate(inflater)
        btnStart = binding.btnStart
        btnPause = binding.btnPause

        val intent = Intent(this.context, MediaService::class.java)
        btnStart.setOnClickListener { context?.startService(intent) }
        btnPause.setOnClickListener { context?.stopService(intent) }
        return binding.root
    }
}