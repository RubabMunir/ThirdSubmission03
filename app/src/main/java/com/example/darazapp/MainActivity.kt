package com.example.darazapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.darazapp.R
import com.example.darazapp.adapter.CategoryAdapter
import com.example.darazapp.data.Category
import androidx.recyclerview.widget.RecyclerView
import com.example.darazapp.adapter.ProductAdapter
import com.example.darazapp.data.Product
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.content.Intent
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {

    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var productRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecyclerView = findViewById(R.id.categoryRecyclerView)

        val categoryList = listOf(
            Category("Electronics", R.drawable.c1),
            Category("Fashion", R.drawable.c2),
            Category("Electronics", R.drawable.c3),
            Category("Fashion", R.drawable.c4),
            Category("Electronics", R.drawable.c5),
            Category("Fashion", R.drawable.c1),
            Category("Electronics", R.drawable.c2),
            Category("Fashion", R.drawable.c3),
            // Add more categories as needed
        )

        val categoryAdapter = CategoryAdapter(categoryList)
        categoryRecyclerView.adapter = categoryAdapter
        categoryRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Initialize Products
        productRecyclerView = findViewById(R.id.productRecyclerView)
        val productList = listOf(
            Product("Product 1", "Rs. 170", R.drawable.l1),
            Product("Product 2", "Rs. 250", R.drawable.l2),
            Product("Product 3", "Rs. 170", R.drawable.l3),
            Product("Product 4", "Rs. 250", R.drawable.l4),
            Product("Product 5", "Rs. 170", R.drawable.l1),
            Product("Product 6", "Rs. 250", R.drawable.l2),
            // Add more products as needed
        )
        val productAdapter = ProductAdapter(productList)
        productRecyclerView.adapter = productAdapter
        productRecyclerView.layoutManager = GridLayoutManager(this, 2) // Set number of columns

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigation)

        // Set a listener for item selection
        bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_for_you -> {
                    // If you have a Home Activity or Fragment, navigate to it
                    // Intent for HomeActivity if you have one
                    val homeIntent = Intent(this, MainActivity::class.java)
                    startActivity(homeIntent)
                    true
                }

                R.id.navigation_cart -> {
                    // Navigate to CartActivity
                    val cartIntent = Intent(this, CartActivity::class.java)
                    startActivity(cartIntent)
                    true
                }

                R.id.navigation_account -> {
                    // Navigate to AccountActivity
                    val cartIntent = Intent(this, AccountActivity::class.java)
                    startActivity(cartIntent)
                    true
                }

                R.id.navigation_messages -> {
                    // Navigate to MessagesActivity
                    val cartIntent = Intent(this, MessagesActivity::class.java)
                    startActivity(cartIntent)
                    true
                }

                else -> false
            }

        }

    }
}

