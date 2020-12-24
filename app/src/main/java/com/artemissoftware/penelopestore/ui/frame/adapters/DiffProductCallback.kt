package com.artemissoftware.penelopestore.ui.frame.adapters

import androidx.recyclerview.widget.DiffUtil
import com.artemissoftware.penelopestore.api.models.ProductDto

class DiffProductCallback : DiffUtil.ItemCallback<ProductDto>() {
    override fun areItemsTheSame(oldItem: ProductDto, newItem: ProductDto) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ProductDto, newItem: ProductDto) =
        oldItem == newItem
}
