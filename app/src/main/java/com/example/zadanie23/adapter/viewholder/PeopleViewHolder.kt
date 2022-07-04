package com.example.zadanie23.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zadanie23.R
import com.example.zadanie23.User
import com.example.zadanie23.databinding.ItemUserBinding

class PeopleViewHolder(private val itemBinding: ItemUserBinding) : RecyclerView.ViewHolder(itemBinding.root){
    fun bind(user: User){
        with(itemBinding){
            tvName.text = user.name
            tvSecondName.text = user.secondName
            tvAge.text = user.age.toString()
            Glide.with(itemView.context)
                .load(user.image)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivAvatar)
        }
    }
}
