package com.artemissoftware.penelopestore.ui.frame.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.artemissoftware.penelopestore.api.models.ProductDto
import com.artemissoftware.penelopestore.databinding.ItemNewReleasesBinding

class FrameAdapter () : ListAdapter<ProductDto, FrameAdapter.FrameViewHolder>(DiffProductCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrameViewHolder {
        val binding = ItemNewReleasesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FrameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FrameViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    inner class FrameViewHolder(private val binding: ItemNewReleasesBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
//            binding.apply {
//                root.setOnClickListener {
//
//                    val position = adapterPosition
//
//                    if(position != RecyclerView.NO_POSITION){
//                        val task = getItem(position)
//                        listener.onItemClick(task)
//                    }
//
//                }
//
//            }
        }

        fun bind(productDto: ProductDto) {
            binding.apply {

                txtName.text = productDto.name
                txtBrand.text = productDto.brand
            }
        }
    }


}