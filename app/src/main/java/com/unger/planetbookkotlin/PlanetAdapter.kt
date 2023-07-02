package com.unger.planetbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.unger.planetbookkotlin.databinding.RecyclerRowBinding

class PlanetAdapter(val planetList : ArrayList<Planets>) : RecyclerView.Adapter<PlanetAdapter.PlanetHolder>(){

    class PlanetHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlanetHolder(binding)
    }

    override fun getItemCount(): Int {
        return planetList.size
    }

    override fun onBindViewHolder(holder: PlanetHolder, position: Int)  {
        holder.binding.recyclerViewTextView.text = planetList.get(position).name

       holder.itemView.setOnClickListener{
           val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
           intent.putExtra("planet",planetList.get(position))
           holder.itemView.context.startActivity(intent)
       }
    }
}