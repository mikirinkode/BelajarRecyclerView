package com.mikirinkode.belajarrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mikirinkode.belajarrecyclerview.databinding.ItemUserBinding


class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private val userList = ArrayList<UserEntity>()

    class UserViewHolder(private val binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(userEntity: UserEntity){

            binding.apply {
                tvUserName.text = userEntity.name
                tvStudy.text = userEntity.study

                Glide.with(itemView)
                    .load(userEntity.userPhotoUrl)
                    .into(ivUserPhoto)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }


    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(newList: ArrayList<UserEntity>){
        this.userList.clear()
        this.userList.addAll(newList)
        notifyDataSetChanged()
    }
}