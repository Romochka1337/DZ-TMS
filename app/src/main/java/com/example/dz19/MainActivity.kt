package com.example.dz19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToFrance.setOnClickListener { startFranceFragment() }
        binding.btnToGermany.setOnClickListener { startGermanyFragment() }
        binding.btnToBelgium.setOnClickListener { startBelgiumFragment() }
        binding.btnToLatvia.setOnClickListener { startLatviaFragment() }
        binding.btnToThailand.setOnClickListener { startThailandFragment() }
        binding.btnToMadagascar.setOnClickListener { startMadagascarFragment() }
        binding.btnToSweden.setOnClickListener { startSwedenFragment() }
    }

private fun startFranceFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, FranceFragment.newInstance()).commit()
}
private fun startGermanyFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, GermanyFragment.newInstance()).commit()
}
private fun startBelgiumFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, BelgiumFragment.newInstance()).commit()
}
private fun startLatviaFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, LatviaFragment.newInstance()).commit()
}
private fun startThailandFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, ThailandFragment.newInstance()).commit()
}
private fun startMadagascarFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, MadagascarFragment.newInstance()).commit()
}
private fun startSwedenFragment() {
    supportFragmentManager.beginTransaction().replace(R.id.conteiner, SwedenFragment.newInstance()).commit()
}
}
