
package com.example.dz26

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class UserListAdapter : ListAdapter<User, UserListAdapter.UserViewHolder>(USERS_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvName: TextView = itemView.findViewById(R.id.tvName)
        private val tvSurname: TextView = itemView.findViewById(R.id.tvSurname)
        private val tvAge: TextView = itemView.findViewById(R.id.tvAge)
        private val imageAvatar: ImageView = itemView.findViewById(R.id.image_Avatar)

        fun bind(user:User) {
            tvName.text = user.name
            tvSurname.text = user.surname
            tvAge.text = user.age.toString()
            Glide.with(itemView.context)
                .load(user.image)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageAvatar)
            }

        companion object {
            fun create(parent: ViewGroup): UserViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.recyclerview_item, parent, false)
                return UserViewHolder(view)
            }
        }
    }

    companion object {
        private val USERS_COMPARATOR = object : DiffUtil.ItemCallback<User>() {
            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return ((oldItem.name == newItem.name)&&(oldItem.surname == newItem.surname)&&(oldItem.age == newItem.age))
            }
        }
    }
}
