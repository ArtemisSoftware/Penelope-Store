package com.artemissoftware.penelopestore.repositories

import com.artemissoftware.penelopestore.api.models.ProductDto

interface MakeupRepository {

    suspend fun getAllProducts(): List<ProductDto>

    suspend fun getProductsByBrand(brand: String): List<ProductDto>

}