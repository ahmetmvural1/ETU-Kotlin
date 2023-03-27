package com.ahmetmvural.lesson3

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ahmetmvural.lesson3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    private lateinit var  sharedPreferences: SharedPreferences
    var agePreferences: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupLoadData()
    }

    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun setupLoadData() {
        sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3", MODE_PRIVATE)
       // agePreferences = sharedPreferences.getInt("userAge",-1)
        // Enum Kullanımı
        agePreferences = sharedPreferences.getInt(SharedType.UserAge.get,-1)
        //sharedPreferences.getString(SharedType.UserName.get,"")

        if (agePreferences == -1) {
            binding.resultTextView.text = "Kaydedilmiş değer yok"
        } else {
            binding.resultTextView.text = "Senin Yaşın: ${agePreferences} " + UserType.BuissnesUser.get
        }


    }


    fun saveAction(view: View) {
       //val sharedPreferences = this.getSharedPreferences("com.ahmetmvural.lesson3", MODE_PRIVATE)

        val yourAge = binding.ageTextView.text.toString().toIntOrNull()
        if (yourAge == null) {
            binding.resultTextView.text = "Doğru değer girmediniz"
        } else {
            binding.resultTextView.text = "Kaydedildi Yaşınız: " + yourAge
            sharedPreferences.edit().putInt(SharedType.UserAge.get,yourAge).apply()
        }

    }

    fun deleteAction(view: View) {
        //agePreferences = sharedPreferences.getInt("userAge", -1)

        if (agePreferences != -1) {
            sharedPreferences.edit().remove(SharedType.UserAge.get).apply()
            binding.resultTextView.text = "Yaşı sildiniz"
        }
    }
}