package com.example.darazapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        // Setting up click listeners for each section
        findViewById<View>(R.id.toPay).setOnClickListener {
            startActivity(Intent(this, ToPayActivity::class.java))
        }

        findViewById<View>(R.id.toShip).setOnClickListener {
            startActivity(Intent(this, ToShipActivity::class.java))
        }

        findViewById<View>(R.id.toReceive).setOnClickListener {
            startActivity(Intent(this, ToReceiveActivity::class.java))
        }

        findViewById<View>(R.id.toReview).setOnClickListener {
            startActivity(Intent(this, ToReviewActivity::class.java))
        }

        // Set click listener for Daraz Wallet section
        findViewById<View>(R.id.darazWalletSection).setOnClickListener {
            startActivity(Intent(this, DarazWalletActivity::class.java))
        }

        // Set click listener for Payment Options section
        findViewById<View>(R.id.paymentOptionsSection).setOnClickListener {
            startActivity(Intent(this, PaymentOptionsActivity::class.java))
        }
    }
}
