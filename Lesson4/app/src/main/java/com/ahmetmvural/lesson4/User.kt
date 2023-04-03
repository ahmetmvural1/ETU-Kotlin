package com.ahmetmvural.lesson4

open class User {
    //property
    var name: String? = null
    var age: Int? = null
    var gender: String? = null

    constructor(nameInput: String, ageInput: Int, genderInput: String) {
        this.name = nameInput
        this.age = ageInput
        this.gender = genderInput
        println("user created")
    }
}