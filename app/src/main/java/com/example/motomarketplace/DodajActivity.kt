package com.example.motomarketplace

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DodajActivity : AppCompatActivity() {

    lateinit var etMarka: EditText
    lateinit var etModel: EditText
    lateinit var etRok: EditText
    lateinit var etPrzebieg: EditText
    lateinit var etCena: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dodaj)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etMarka = findViewById(R.id.etMarka)
        etModel = findViewById(R.id.etModel)
        etRok = findViewById(R.id.etRok)
        etPrzebieg = findViewById(R.id.etPrzebieg)
        etCena = findViewById(R.id.etCena)

        val btnZapisz = findViewById<Button>(R.id.btnZapisz)
        val btnAnuluj = findViewById<Button>(R.id.btnAnuluj)

        btnZapisz.setOnClickListener {
            if (sprawdzDane()) {
                Toast.makeText(this, "Dodano ogloszenie: " + etMarka.text + " " + etModel.text, Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Uzupełnij wszystkie pola!!", Toast.LENGTH_SHORT).show()
            }
        }

        btnAnuluj.setOnClickListener {
            finish()
        }
    }

    fun sprawdzDane(): Boolean {
        if (etMarka.text.isEmpty() || etModel.text.isEmpty() || etRok.text.isEmpty()
            || etPrzebieg.text.isEmpty() || etCena.text.isEmpty()) {
            return false
        }
        return true
    }
}
