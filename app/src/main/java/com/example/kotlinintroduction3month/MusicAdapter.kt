package com.example.kotlinintroduction3month

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinintroduction3month.databinding.ItemMusicBinding

class MusicAdapter(
    val musicList: ArrayList<Music>,
    val onClick: (position: Int) -> Unit
    ): RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = musicList.size




    inner class ViewHolder(private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = musicList[adapterPosition]
            binding.apply {
                tvName.text = item.name
                tvAuthor.text = item.author
                tvTime.text = item.time
            }
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }
}