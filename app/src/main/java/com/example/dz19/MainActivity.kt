package com.example.dz19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dz19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToFrance.setOnClickListener { startFragment(FranceFragment()) }
        binding.btnToGermany.setOnClickListener { startFragment(GermanyFragment()) }
        binding.btnToBelgium.setOnClickListener { startFragment(BelgiumFragment()) }
        binding.btnToLatvia.setOnClickListener { startFragment(LatviaFragment()) }
        binding.btnToThailand.setOnClickListener { startFragment(ThailandFragment()) }
        binding.btnToMadagascar.setOnClickListener { startFragment(MadagascarFragment()) }
        binding.btnToSweden.setOnClickListener { startFragment(SwedenFragment()) }
    }
    private fun startFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.conteiner, fragment).commit()
    }
}
