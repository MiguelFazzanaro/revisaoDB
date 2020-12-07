package com.example.a0712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lista.*

class Lista : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        rvLista.layoutManager = LinearLayoutManager(this)
        rvLista.setHasFixedSize(true)


    }
}