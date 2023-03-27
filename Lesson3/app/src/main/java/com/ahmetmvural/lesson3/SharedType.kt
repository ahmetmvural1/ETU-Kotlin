package com.ahmetmvural.lesson3

enum class SharedType(val get: String) {
    UserAge("userAge"),
    UserPassword("userPassword"),
    UserName("userName"),
}

enum class  UserType(val get: Int) {
    BuissnesUser(1),
    StandartUser(2),
    OutherUser(3),
}