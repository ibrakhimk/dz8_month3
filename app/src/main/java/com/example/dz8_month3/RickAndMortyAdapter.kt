package com.example.dz8_month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.dz8_month3.databinding.ItemRickAndMortyBinding

class RickAndMortyAdapter(
    val rickAndMortyList: ArrayList<RickAndMorty>,
    val onClick:(rickAndMorty: RickAndMorty) ->Unit
) : Adapter<RickAndMortyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRickAndMortyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = rickAndMortyList.size

    inner class ViewHolder(private val binding: ItemRickAndMortyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = rickAndMortyList[adapterPosition]
            itemView.setOnClickListener{
                onClick.invoke(item)
            }

            binding.apply {
                tvName.text = item.name
                tvRang.text = item.rank
            }

        }
    }
}