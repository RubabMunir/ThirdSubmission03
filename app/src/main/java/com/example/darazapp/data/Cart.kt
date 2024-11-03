package com.example.darazapp.data

data class CartItem(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int,
    val imageResId: Int // Reference to an image resource
)
