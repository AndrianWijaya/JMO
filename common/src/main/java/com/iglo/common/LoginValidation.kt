package com.iglo.common

object LoginValidation {
    const val USER_NAME = "andrian.wijaya@gmail.com"
    const val PASSWORD = "indocyber"


    fun validate(username: String, password: String): String{
        if (username == USER_NAME && password == PASSWORD) {
            return "Login Berhasil"
        } else if (username == USER_NAME && password != PASSWORD) {
            return "Password Salah"
        } else if (username != USER_NAME && password == PASSWORD){
            return "Username Salah"
        } else {
            return "Username dan Password Salah"
        }
    }
}