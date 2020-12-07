package com.example.a0712

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_lista.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var db: AppDataBase
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel by viewModels<MainViewModel> {
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return MainViewModel(repository) as T
                }
            }
        }

        initdb()
        repository = RepositoryImpl(db.agendaDAO())

        btAdicionaContato.setOnClickListener {
            if (tvNomeCadastro == null || tvNumeroCadastro == null){
                Toast.makeText(this, "Preencher os campos", Toast.LENGTH_SHORT).show()
            }else {
                viewModel.addContato(Agenda(nome = "$tvNomeCadastro", telefone = "$tvNumeroCadastro"))
            }
        }

        btnLista.setOnClickListener {
            startActivity(Intent(this, Lista::class.java))
        }
    }

    fun initdb(){
        db = this.let{
            AppDataBase.invoke(this)
        }
    }
}