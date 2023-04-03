package com.ahmetmvural.lesson4

class Employee(nameInput: String, ageInput: Int, genderInput: String, departmentInput: String):
    User(nameInput, ageInput, genderInput) {
    //ingeritance
    var deparment: String? = departmentInput

    fun myUser() {
        println("My Name is ${name}")
        println("My Age is ${age}")
        println("My Gender is ${gender}")
        println("My Department is ${deparment}")

    }



}