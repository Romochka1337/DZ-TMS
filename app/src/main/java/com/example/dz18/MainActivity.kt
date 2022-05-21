package com.example.dz18

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.dz18.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            startCollect(
                Region.Minsk,
                binding.pbPotatoMinsk,
                binding.pbCabbageMinsk,
                binding.pbBeetMinsk
            )
            startCollect(
                Region.Gomel,
                binding.pbPotatoGomel,
                binding.pbCabbageGomel,
                binding.pbBeetGomel
            )
            startCollect(
                Region.Brest,
                binding.pbPotatoBrest,
                binding.pbCabbageBrest,
                binding.pbBeetBrest
            )
        }
        binding.btnShowResult.setOnClickListener { showResult() }
    }

    private fun startCollect(
        region: Region,
        proBarPotato: ProgressBar,
        proBarCabbage: ProgressBar,
        proBarBeet: ProgressBar
    ) {
        CoroutineScope(Dispatchers.Default).launch {
            var i: Int = 0
            launch {
                while (i < 100) {
                    val a: Int = (0..3).random()
                    i += a
                    region.timePotato++
                    delay(200)
                    proBarPotato.progress = i
                }
            }
            launch {
                while (i < 100) {
                    val a: Int = (0..3).random()
                    i += a
                    region.timeCabbage++
                    delay(200)
                    proBarCabbage.progress = i
                }
            }
            launch {
                while (i < 100) {
                    val a: Int = (0..3).random()
                    i += a
                    region.timeBeet++
                    delay(200)
                    proBarBeet.progress = i
                }
            }
        }
        binding.btnStart.visibility = View.INVISIBLE
        binding.btnShowResult.visibility = View.VISIBLE
    }

    private fun showResult() {
        binding.tvMinsk.visibility = View.INVISIBLE
        binding.tvGomel.visibility = View.INVISIBLE
        binding.tvBrest.visibility = View.INVISIBLE
        binding.pbPotatoMinsk.visibility = View.INVISIBLE
        binding.pbPotatoGomel.visibility = View.INVISIBLE
        binding.pbPotatoBrest.visibility = View.INVISIBLE
        binding.pbCabbageMinsk.visibility = View.INVISIBLE
        binding.pbCabbageGomel.visibility = View.INVISIBLE
        binding.pbCabbageBrest.visibility = View.INVISIBLE
        binding.pbBeetMinsk.visibility = View.INVISIBLE
        binding.pbBeetGomel.visibility = View.INVISIBLE
        binding.pbBeetBrest.visibility = View.INVISIBLE
        binding.tvPotatoResult.visibility = View.VISIBLE
        binding.tvCabbageResult.visibility = View.VISIBLE
        binding.tvBeetResult.visibility = View.VISIBLE

        when{
            ((Region.Minsk.timePotato <= Region.Gomel.timePotato)&&(Region.Minsk.timePotato <= Region.Brest.timePotato)) ->  binding.tvPotatoResult.text = "Минск быстрее всех собрал урожай картофеля"
            ((Region.Gomel.timePotato <= Region.Minsk.timePotato)&&(Region.Gomel.timePotato <= Region.Brest.timePotato)) ->  binding.tvPotatoResult.text = "Гомель быстрее всех собрал урожай картофеля"
            else -> binding.tvPotatoResult.text = "Брест быстрее всех собрал урожай картофеля"
        }
        when{
            ((Region.Minsk.timeCabbage <= Region.Gomel.timeCabbage)&&(Region.Minsk.timeCabbage <= Region.Brest.timeCabbage)) -> binding.tvCabbageResult.text = "Минск быстрее всех собрал урожай капусты"
            ((Region.Gomel.timeCabbage <= Region.Minsk.timeCabbage)&&(Region.Gomel.timeCabbage <= Region.Brest.timeCabbage)) -> binding.tvCabbageResult.text = "Гомель быстрее всех собрал урожай капусты"
            else -> binding.tvCabbageResult.text = "Брест быстрее всех собрал урожай капусты"
        }
        when{
            ((Region.Minsk.timeBeet <= Region.Gomel.timeBeet)&&(Region.Minsk.timeBeet <= Region.Brest.timeBeet)) -> binding.tvBeetResult.text = "Минск быстрее всех собрал урожай свеклы"
            ((Region.Gomel.timeBeet <= Region.Minsk.timeBeet)&&(Region.Gomel.timeBeet <= Region.Brest.timeBeet)) -> binding.tvBeetResult.text = "Гомель быстрее всех собрал урожай свеклы"
            else -> binding.tvBeetResult.text = "Брест быстрее всех собрал урожай свеклы"
        }
    }
}