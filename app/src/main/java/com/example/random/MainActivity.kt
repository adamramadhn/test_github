package com.example.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(this,"HELLO MINNA!",Toast.LENGTH_LONG).show()
        }
        val btn2 = findViewById<Button>(R.id.btn)
        btn2.setOnClickListener {
            Toast.makeText(this@MainActivity, "BYE!", Toast.LENGTH_LONG).show()
        }
    }
}