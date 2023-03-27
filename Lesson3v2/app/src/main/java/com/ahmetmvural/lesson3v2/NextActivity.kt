package com.ahmetmvural.lesson3v2

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ahmetmvural.lesson3v2.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    private lateinit var  sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
       // loadSharedPage()
        loadIntentData()
    }

    override fun onPause() {
        super.onPause()
        sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3v2", MODE_PRIVATE)
        val gender = binding.genderTextView.text.toString()
        sharedPreferences.edit().putString("userGender", gender).apply()
    }

    fun setupBinding() {
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun loadIntentData() {
        val intent = getIntent()
        val name = intent.getStringExtra("name")
        val userName = intent.getStringExtra("userName")

        binding.userNameText.text = "User Name: " + userName
        binding.nameSurnameText.text = "Name: " + name
    }

    fun loadSharedPage() {
        sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3v2", MODE_PRIVATE)
        val userName = sharedPreferences.getString("userName","null")
        val name = sharedPreferences.getString("name","null")

        if (name == "") {
            binding.nameSurnameText.text = "Ad Soyad değeriniz boş"
        } else {
            binding.nameSurnameText.text = "Adınız Soyadınız: " + name
        }

        if (userName != "") {
            binding.userNameText.text = "Kullanıcı adınız: " + userName
        } else {
            binding.userNameText.text = "Kullanıcı Adı değeriniz boş"
        }
    }

    fun genderSave(view: View) {
        /*
        sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3v2", MODE_PRIVATE)
        val gender = binding.genderTextView.text.toString()
        sharedPreferences.edit().putString("userGender", gender).apply()

         */
    }
}