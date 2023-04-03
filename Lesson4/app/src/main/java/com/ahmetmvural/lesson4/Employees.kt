package com.ahmetmvural.lesson4

// Super yöntemiyle inheritance gösterimi Diğer yöntemle aynı farklı gösterim tipi
class Employees:
User {
    constructor(nameInput: String, ageInput: Int, genderInput: String):
            super(nameInput,ageInput,genderInput) {
    }

    fun myUser() {
        println("My Name is ${name}")
        println("My Age is ${age}")
        println("My Gender is ${gender}")
    }
}