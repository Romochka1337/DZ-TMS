package com.example.zadanie23.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zadanie23.User
import com.example.zadanie23.adapter.viewholder.PeopleViewHolder
import com.example.zadanie23.databinding.ItemUserBinding

class PeopleAdapter(private val usersData: MutableList<User>) : RecyclerView.Adapter<PeopleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val itemBinding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PeopleViewHolder(itemBinding)
    }
    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(usersData[position])
    }
    override fun getItemCount(): Int = usersData.size
}
