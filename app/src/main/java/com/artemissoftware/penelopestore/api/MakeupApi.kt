package com.artemissoftware.penelopestore.api

import com.artemissoftware.penelopestore.api.models.ProductDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MakeupApi {

    @GET("products.json")
    suspend fun getAllProducts(): List<ProductDto>

    @GET("get")
    suspend fun getProductsByBrand(@Query("brand") brand: String): List<ProductDto>

    @GET("get")
    suspend fun getProductsByType(@Query("brand") brand: String, @Query("product_type") type: String): List<ProductDto>

}