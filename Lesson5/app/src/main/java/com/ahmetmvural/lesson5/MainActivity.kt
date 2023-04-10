package com.ahmetmvural.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmetmvural.lesson5.databinding.ActivityMainBinding
//Global değer ataması
//var globalSelectedCity: City? = null

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var cityList: ArrayList<City>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupCityList()
    }

    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun setupCityList() {
        cityList = ArrayList<City>()
        val erzurum = City("Erzrurum","1M",R.drawable.erz)
        val istanbul = City("İstanbul","20M",R.drawable.istanbul)
        val isparta = City("Isparta","550K",R.drawable.isparta)
        val ankara = City("Ankara","5M",R.drawable.ankara)
        val izmir = City("İzmir","3M",R.drawable.izmir)

        cityList.add(erzurum)
        cityList.add(isparta)
        cityList.add(istanbul)
        cityList.add(ankara)
        cityList.add(izmir)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CityAdapter(cityList)
        binding.recyclerView.adapter = adapter
    }
}