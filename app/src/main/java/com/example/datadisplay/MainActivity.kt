package com.example.datadisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun submitFunction(view: View) {
        val nameInput = findViewById<EditText>(R.id.name)
        val phoneInput = findViewById<EditText>(R.id.number)
        val intent = Intent(this, MainActivity2::class.java).also{
            it.putExtra("name", nameInput.text.toString())
            it.putExtra("phone", phoneInput.text.toString())
        }
        startActivity(intent)
    }
}