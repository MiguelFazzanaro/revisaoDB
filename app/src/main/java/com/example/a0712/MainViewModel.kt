package com.example.a0712

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel (val repository: Repository): ViewModel() {
    val listaAgenda = MutableLiveData<List<Agenda>>()

    fun addContato(agenda: Agenda){
        viewModelScope.launch {
            repository.addContatoTask(agenda)
        }
    }

    fun getAllContatos(){
        viewModelScope.launch {
            listaAgenda.value = repository.getAllContatoTask()
        }
    }
}