package com.example.utsproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.daftar_fakultas.view.*

class dataFadapter (val dataupnItemList: List<data_upn>, val clickListener: (data_upn) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.daftar_fakultas,parent,false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(dataupnItemList[position],clickListener)
    }
    override fun getItemCount() = dataupnItemList.size

    class PartViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(data : data_upn, clickListener: (data_upn) -> Unit){
            itemView.gambar_fakultas.setImageResource(data.gambarF)
            itemView.namafakultas.text = data.namaF
            itemView.setOnClickListener{ clickListener(data)}
        }
    }
}