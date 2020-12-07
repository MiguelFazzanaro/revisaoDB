package com.example.a0712

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AgendaAdapter (
    var listaAgenda: ArrayList<Agenda>
): RecyclerView.Adapter<AgendaAdapter.AgendaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaAdapter.AgendaViewHolder {
        return AgendaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false))
    }

    override fun onBindViewHolder(holder: AgendaAdapter.AgendaViewHolder, position: Int) {
        val ag = listaAgenda[position]
        holder.nome.text = ag.nome
        holder.numero.text = ag.telefone
    }

    override fun getItemCount() = listaAgenda.size

    inner class AgendaViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val nome: TextView = itemView.findViewById(R.id.tvNome)
        val numero: TextView = itemView.findViewById(R.id.tvTelefone)

    }
}
