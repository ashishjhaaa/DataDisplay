package com.example.datadisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val nameTextView = findViewById<TextView>(R.id.name)
        val phoneTextView = findViewById<TextView>(R.id.phone)
        nameTextView.text = name
        phoneTextView.text = phone
    }
}