package com.example.darazapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.darazapp.R // Ensure this is the correct import

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the login link TextView by ID
//        val loginLink: TextView = findViewById(R.id.signup_link)

        // Set an OnClickListener on the login link
//        loginLink.setOnClickListener {
            // Create an Intent to open LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent) // Start the login activity
        }
    }
