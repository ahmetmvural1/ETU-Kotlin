package com.ahmetmvural.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmetmvural.lesson5.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupDetail()
    }

    fun setupBinding() {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun setupDetail() {
        val intent = intent
        //val selectedCity = intent.getSerializableExtra("city") as City
        //val selectedCity = globalSelectedCity
        val selectedCity = MyCity.chosenCity
        binding.nameTextView.text = "Şehrin Adı: " + selectedCity!!.name
        binding.populationTextView.text = "Şehrin Nüfusu: " + selectedCity!!.population
        binding.imageView.setImageResource(selectedCity!!.image)
    }
}