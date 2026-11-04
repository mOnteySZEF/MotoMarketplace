package com.example.motomarketplace

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        val btnOgloszenia = findViewById<Button>(R.id.btnOgloszenia)
        val btnDodaj = findViewById<Button>(R.id.btnDodaj)

        btnOgloszenia.setOnClickListener {
            val intent = Intent(this, OgloszeniaActivity::class.java)
            startActivity(intent)
        }

        btnDodaj.setOnClickListener {
            val intent = Intent(this, DodajActivity::class.java)
            startActivity(intent)
        }
    }
}
