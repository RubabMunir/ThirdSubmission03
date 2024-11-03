package com.example.darazapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.darazapp.adapter.CartAdapter
import com.example.darazapp.adapter.CartItem

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val emptyCartLayout = findViewById<LinearLayout>(R.id.emptyCartLayout)
        val cartRecyclerView = findViewById<RecyclerView>(R.id.cartRecyclerView)
        val checkoutButton = findViewById<Button>(R.id.checkoutButton)

        // Sample cart items, converted to a MutableList
        val cartItems = mutableListOf(
            CartItem(R.drawable.cartitem, "Item 1", "Rs. 799"),
            CartItem(R.drawable.l4, "Item 2", "Rs. 1099"),
            CartItem(R.drawable.l1, "Item 1", "Rs. 799"),
            CartItem(R.drawable.l2, "Item 2", "Rs. 1099"),
            CartItem(R.drawable.l3, "Item 3", "Rs. 1299"),
            CartItem(R.drawable.l5, "Item 4", "Rs. 1599")
            // Add more items as needed
        )

        if (cartItems.isEmpty()) {
            emptyCartLayout.visibility = View.VISIBLE
            cartRecyclerView.visibility = View.GONE
            checkoutButton.visibility = View.GONE
        } else {
            emptyCartLayout.visibility = View.GONE
            cartRecyclerView.visibility = View.VISIBLE
            checkoutButton.visibility = View.VISIBLE

            // Set up RecyclerView with GridLayoutManager
            cartRecyclerView.layoutManager = GridLayoutManager(this, 2) // 2 items per row
            cartRecyclerView.adapter = CartAdapter(cartItems) { item ->
                // Handle remove item action
                cartItems.remove(item)
                cartRecyclerView.adapter?.notifyDataSetChanged()

                // Recalculate the total
//                val total = cartItems.sumOf { it.price.replace("Rs. ", "").toInt() }
//                totalAmount.text = "Rs. $total"

                // Toggle visibility of empty layout if cart is empty
                if (cartItems.isEmpty()) {
                    emptyCartLayout.visibility = View.VISIBLE
                    cartRecyclerView.visibility = View.GONE
                    checkoutButton.visibility = View.GONE
                }
            }

//            // Calculate and display total amount
//            val total = cartItems.sumOf { it.price.replace("Rs. ", "").toInt() }
//            totalAmount.text = "Rs. $total"
        }
    }
}
