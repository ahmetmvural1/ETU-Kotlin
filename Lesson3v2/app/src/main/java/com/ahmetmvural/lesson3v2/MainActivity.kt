package com.ahmetmvural.lesson3v2

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ahmetmvural.lesson3v2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var  sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
//Sayfa oluşturulmadan önce create çalışır yalnızca 1 kere çalışır.
        println("on create called")


    }

    override fun onResume() {
        super.onResume()
        //ardından resume çalışır
        println("on resume called")
        getUserGender()
    }

    override fun onPause() {
        super.onPause()
        //sayfa kapanırken pause çalışır
        println("on pause called")
    }

    override fun onStop() {
        super.onStop()
        //ardından stop çalışır
        println("on stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("on destroy called")
    }

    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun loginAction(view: View) {
        //Burada shared a kayıt yapacağız
       // sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3v2", MODE_PRIVATE)
     //   val userName = binding.userNameTextView.text.toString()
       // var name = binding.nameTextView.text.toString()

        //sharedPreferences.edit().putString("userName",userName).apply()
        //sharedPreferences.edit().putString("name",name).apply()


        val intent = Intent(applicationContext, NextActivity::class.java)
        intent.putExtra("userName",binding.userNameTextView.text.toString())
        intent.putExtra("name",binding.nameTextView.text.toString())
        startActivity(intent)
       // finish()
    }


    fun getUserGender() {
        sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3v2", MODE_PRIVATE)
        val userGender = sharedPreferences.getString("userGender","")
        if (userGender == "") {
            binding.textView.text = "Cinsiyet Bulunamadı"
        } else {
            binding.textView.text = "Cinsiyetiniz: " + userGender
        }
    }
}