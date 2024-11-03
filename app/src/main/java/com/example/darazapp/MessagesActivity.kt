package com.example.darazapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.darazapp.adapter.MessageItem
import com.example.darazapp.adapter.MessagesAdapter

class MessagesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        val messagesRecyclerView = findViewById<RecyclerView>(R.id.messagesRecyclerView)
        messagesRecyclerView.layoutManager = LinearLayoutManager(this)

        val messages = listOf(
            MessageItem("EXCLUSIVE ALERT", "Pre-Order the latest from Tecno", "Yesterday"),
            MessageItem("Chic Saturdays", "Aapka Style Destination!", "Yesterday"),
            MessageItem("Up to 20% OFF in Coin Channel", "Shop now for great discounts", "Yesterday")
            // Add more sample messages as needed
        )

        messagesRecyclerView.adapter = MessagesAdapter(messages)

        // Setting up click listeners for each header
        findViewById<LinearLayout>(R.id.chatsHeader).setOnClickListener {
            startActivity(Intent(this, ChatsActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.ordersHeader).setOnClickListener {
            // Navigate to Orders screen
             startActivity(Intent(this, OrdersActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.activitiesHeader).setOnClickListener {
            // Navigate to Activities screen
            // startActivity(Intent(this, ActivitiesActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.promosHeader).setOnClickListener {
            // Navigate to Promos screen
            // startActivity(Intent(this, PromosActivity::class.java))
        }
    }
}
