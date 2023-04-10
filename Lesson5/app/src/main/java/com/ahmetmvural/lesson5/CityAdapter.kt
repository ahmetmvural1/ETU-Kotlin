package com.ahmetmvural.lesson5

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetmvural.lesson5.databinding.CityCellBinding

class CityAdapter(val cityList: ArrayList<City>) : RecyclerView.Adapter<CityAdapter.CityHolder>() {

    class CityHolder(val binding: CityCellBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityHolder {
        val binding = CityCellBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  CityHolder(binding)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
        holder.binding.cityTextView.text = cityList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailActivity::class.java)
            //intent.putExtra("city", cityList.get(position))
            //Global değer ataması bu pek tercih edilmez
            //globalSelectedCity = cityList.get(position)
            //Singlton obje
            //MyCity.chosenCity = cityList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

}