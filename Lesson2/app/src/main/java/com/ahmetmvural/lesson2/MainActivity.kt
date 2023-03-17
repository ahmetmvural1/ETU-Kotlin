package com.ahmetmvural.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import com.ahmetmvural.lesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        binding.resultTextView.text = "Lütfen Tüm değerleri doğur giriniz..."
        ///allMath()
    }

    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun sumButtonClick(view: View) {
        //val firstNumber = binding.firstNumber.text.toString().toInt()
       // var secoundNumber = binding.secondNumber.text.toString().toInt()

       // val result = firstNumber + secoundNumber

     //   binding.resultTextView.text = "İşleminizin Sonucu: ${result}"

        val firstNumberText = binding.firstNumber.text
        val secoundNumberText = binding.secondNumber.text

        /*
        if (firstNumberText.isEmpty() || secoundNumberText.isEmpty()) {
            binding.resultTextView.text = "Değer boş lütfen değer girin."
        } else {
            val result = firstNumberText.toString().toInt() + secoundNumberText.toString().toInt()

            binding.resultTextView.text = "İşleminizin Sonucu: ${result}"
        }
*/
/*
        if (firstNumberText.toString() == "" || secoundNumberText.toString() == "") {
            binding.resultTextView.text = "Değer boş lütfen değer girin."
        } else {
            val result = firstNumberText.toString().toInt() + secoundNumberText.toString().toInt()
            binding.resultTextView.text = "İşleminizin Sonucu: ${result}"
        }

 */
/*

        if (firstNumberText.isEmpty() || secoundNumberText.isEmpty()) {
            binding.resultTextView.text = "Değer boş lütfen değer girin."
        } else {
            mathCalculator(seperator = "+", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }

 */
/*
        if (firstNumberText.isNotEmpty() && secoundNumberText.isNotEmpty()) {
            mathCalculator(seperator = "+", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }

 */
/*
        if (firstNumberText.isBlank()) {
            binding.resultTextView.text = "1. değer boş"
        }

 */
/*
        val isFirstNumber = firstNumberText.toString().toIntOrNull()

        if (isFirstNumber == null) {
            binding.resultTextView.text = "1. değer boş"
        }
        */
        val nullText = binding.nullTextView.text
        val isNullText = nullText.toString().toIntOrNull()

        if (isNullText == null) {
            binding.resultTextView.text = "Lütfen doğru sayı giriniz"
        } else {
            binding.resultTextView.text = "Evet doğru değer girdiniz"
        }


    }

    fun subButtonClick(view: View) {
        val firstNumberText = binding.firstNumber.text
        val secoundNumberText = binding.secondNumber.text
        /*a
        if (firstNumberText.isEmpty() || secoundNumberText.isEmpty()) {
            binding.resultTextView.text = "Değer boş lütfen değer girin."
        } else {
            mathCalculator(seperator = "-", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }
*/
        if (firstNumberText.isNotEmpty() && secoundNumberText.isNotEmpty()) {
            mathCalculator(seperator = "-", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }
    }

    fun multiButtonClick(view: View) {
        val firstNumberText = binding.firstNumber.text
        val secoundNumberText = binding.secondNumber.text
        /*
        if (firstNumberText.isEmpty() || secoundNumberText.isEmpty()) {
            binding.resultTextView.text = "Değer boş lütfen değer girin."
        } else {
            mathCalculator(seperator = "*", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }
        */

        if (firstNumberText.isNotEmpty() && secoundNumberText.isNotEmpty()) {
            mathCalculator(seperator = "*", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }
    }

    fun divButtonClick(view: View) {
        val firstNumberText = binding.firstNumber.text
        val secoundNumberText = binding.secondNumber.text
        if (firstNumberText.isEmpty() || secoundNumberText.isEmpty()) {
            binding.resultTextView.text = "Değer boş lütfen değer girin."
        } else {
            mathCalculator(seperator = "/", firstNumber = firstNumberText.toString().toDouble(), secoundNumber = secoundNumberText.toString().toDouble())
        }
    }

    fun mathCalculator(seperator: String, firstNumber: Double, secoundNumber: Double) {
        var resultNumber = 0.0
        if (seperator == "+") {
            resultNumber = firstNumber + secoundNumber
        } else if  (seperator == "-") {
            resultNumber = firstNumber - secoundNumber
        }else if (seperator == "*") {
            resultNumber = firstNumber * secoundNumber
        }else if (seperator == "/") {
            resultNumber = firstNumber / secoundNumber
        }

        binding.resultTextView.text =  "İşleminizin Sonucu: ${resultNumber}"
    }



    /// methodlar
    // method adları yapacağı işlemi özetlemelidir.
    // method adları olabildiğince bir veya iki kelimeyi geçmemeli
    // parametreler anlaşılabilir olmalı adlandırma yazılmalır


/*
    fun sumFunction(firstNumber: Int, secondNumber: Int): Int {

        val result = firstNumber + secondNumber
        return  result
    }

    fun allMath() {
       // val sumFun = sumFunction(23,33)
       // sumFunction(firstNumber = 23, secondNumber = 33)
       // println("Result: ${sumFun}")
    }

 */





}