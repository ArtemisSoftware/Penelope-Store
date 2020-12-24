package com.artemissoftware.penelopestore.api.models

import com.google.gson.annotations.SerializedName
import java.util.*


data class ProductDto (

    @SerializedName("id")
    var id: Int,

    @SerializedName("brand")
    var brand: String,

    @SerializedName("name")
    var name: String,

    @SerializedName("price")
    var price: Double,

    @SerializedName("price_sign")
    var priceSign: String,

    @SerializedName("image_link")
    var imageLink: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("category")
    var category: String,

    @SerializedName("product_type")
    var productType: String,

    @SerializedName("tag_list")
    var tags: List<String>,

    @SerializedName("updated_at")
    var updatedAt: Date,

    @SerializedName("product_colors")
    var colors: List<ProductColorsDto>
)

class ProductColorsDto (

    @SerializedName("hex_value")
    var hex: String,

    @SerializedName("colour_name")
    var colourName: String
)



