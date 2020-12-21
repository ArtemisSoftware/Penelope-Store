package com.artemissoftware.penelopestore.repositories

import com.artemissoftware.penelopestore.api.MakeupApi
import com.artemissoftware.penelopestore.api.models.ProductDto

class MakeupRepository_Impl(private val makeupApi: MakeupApi): MakeupRepository{

    override suspend fun getAllProducts(): List<ProductDto> {
        return makeupApi.getAllProducts()
    }

    override suspend fun getProductsByBrand(brand: String): List<ProductDto> {
        return makeupApi.getProductsByBrand(brand)
    }
}