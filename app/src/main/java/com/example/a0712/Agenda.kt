package com.example.a0712

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "agenda")
data class Agenda(
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
        var nome: String,
        val telefone: String
)
