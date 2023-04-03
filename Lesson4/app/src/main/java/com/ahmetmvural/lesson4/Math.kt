package com.ahmetmvural.lesson4

class Math {
    //polymorphism
    //private var piNumber: Double? = 3.14

    fun getPiNumber() : Double {
        return 3.14
    }


    fun sum() : Int {
        return  25
    }

    fun sum(firstNumber: Int, secondNumber: Int) : Int {
        return  firstNumber + secondNumber
    }

    fun sum(firstNumber: Int, secondNumber: Int, thirdNumber: Int) : Int {
        return  firstNumber + secondNumber + thirdNumber
    }
}