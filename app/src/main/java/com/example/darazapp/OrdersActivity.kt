package com.example.darazapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrdersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val startShopping = findViewById<TextView>(R.id.startShopping)
        startShopping.setOnClickListener {
            // Navigate back to the main activity or shopping screen
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}