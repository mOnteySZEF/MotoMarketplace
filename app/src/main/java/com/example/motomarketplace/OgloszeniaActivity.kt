package com.example.motomarketplace

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OgloszeniaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ogloszenia)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<LinearLayout>(R.id.ogloszenie1).setOnClickListener { pokazOgloszenie("BMW 330i G20") }
        findViewById<LinearLayout>(R.id.ogloszenie2).setOnClickListener { pokazOgloszenie("BMW M3 E46") }
        findViewById<LinearLayout>(R.id.ogloszenie3).setOnClickListener { pokazOgloszenie("BMW 530d F10") }
        findViewById<LinearLayout>(R.id.ogloszenie4).setOnClickListener { pokazOgloszenie("BMW 320d E90") }
        findViewById<LinearLayout>(R.id.ogloszenie5).setOnClickListener { pokazOgloszenie("BMW X5 xDrive30d") }

        val btnPowrot = findViewById<Button>(R.id.btnPowrot)
        btnPowrot.setOnClickListener {
            finish()
        }
    }

    fun pokazOgloszenie(nazwa: String) {
        Toast.makeText(this, "wybrano: $nazwa", Toast.LENGTH_SHORT).show()
    }
}
