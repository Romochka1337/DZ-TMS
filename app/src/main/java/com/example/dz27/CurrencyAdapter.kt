package com.example.dz27

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dz27.databinding.AdapterMovieBinding

class CurrencyAdapter : RecyclerView.Adapter<MainViewHolder>() {
    private var currencyList = mutableListOf<Currency>()
    fun setCurrencies(currencies: List<Currency>) {
        this.currencyList = currencies.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterMovieBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val currency = currencyList[position]
        if (ValidationUtil.validateCurrency(currency)) {
            holder.binding.name.text = currency.Cur_Name
            holder.binding.price.text = currency.Cur_OfficialRate
        }
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }
}

class MainViewHolder(val binding: AdapterMovieBinding) : RecyclerView.ViewHolder(binding.root) {
}

