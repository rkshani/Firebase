package com.example.firebase.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firebase.R

class RecyclerviewAdapter(private val fruits:List<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun getItemCount(): Int {
       return fruits.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val fruit = fruits[position]
        holder.txt.text = fruit
    }

}

class MyViewHolder(view:View): RecyclerView.ViewHolder(view){

    val txt: TextView = view.findViewById(R.id.txtname)

}