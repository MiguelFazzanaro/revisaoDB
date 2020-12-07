package com.example.a0712

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAdicionaContato.setOnClickListener {

            tvNomeCadastro

            tvNumeroCadastro
        }

        btnLista.setOnClickListener {
            startActivity(Intent(this, Lista::class.java))
        }
    }
}