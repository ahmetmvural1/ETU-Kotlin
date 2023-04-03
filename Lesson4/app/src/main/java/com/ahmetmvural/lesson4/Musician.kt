package com.ahmetmvural.lesson4

class Musician(name: String, instrument: String, age: Int) {


    var name: String? = name
        private set
        get
    //hem getter hem setterı pirivate yaptın
    private var instrument: String? = instrument
    var age: Int? = age

    private val bandName: String = "Queen"

    fun returnBandName(password: String) : String {
        if (password == "Fredy") {
            return bandName
        } else {
            return "You are not Queen "
        }
    }

}