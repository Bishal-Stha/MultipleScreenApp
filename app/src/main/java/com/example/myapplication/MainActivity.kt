package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val orderBtn = findViewById<Button>(R.id.orderBtn)
        orderBtn.setOnClickListener {
            val order1 = findViewById<EditText>(R.id.order1).text.toString()
            val order2 = findViewById<EditText>(R.id.order2).text.toString()
            val order3 = findViewById<EditText>(R.id.order3).text.toString()
            val order4 = findViewById<EditText>(R.id.order4).text.toString()
            intent = Intent(this,Order::class.java)
            intent.putExtra("order1",order1)
            intent.putExtra("order2",order2)
            intent.putExtra("order3",order3)
            intent.putExtra("order4",order4)
            startActivity(intent)
        }
    }
}