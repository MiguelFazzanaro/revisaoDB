package com.example.a0712

interface Repository {
    suspend fun addContatoTask(agenda: Agenda)
    suspend fun getAllContatoTask() : List<Agenda>

}

class RepositoryImpl (val agendaDAO: AgendaDAO): Repository {
    override suspend fun addContatoTask(agenda: Agenda) {
        agendaDAO.addContato(agenda)
    }

    override suspend fun getAllContatoTask() = agendaDAO.getAgenda()

}