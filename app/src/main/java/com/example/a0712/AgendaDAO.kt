package com.example.a0712

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AgendaDAO{
    @Insert
    suspend fun addContato (agenda: Agenda)

    @Query ("SELECT * FROM agenda")
    suspend fun getAgenda (): List<Agenda>
}