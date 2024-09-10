package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val order1 = intent.getStringExtra("order1")
        val order2 = intent.getStringExtra("order2")
        val order3 = intent.getStringExtra("order3")
        val order4 = intent.getStringExtra("order4")
        val tVOrder = findViewById<TextView>(R.id.message)
        tVOrder.setText("You ordered $order1, $order2, $order3 and $order4")
        //"You ordered $order1, $order2, $order3 and $order4".toString()
    }
}