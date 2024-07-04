package com.example.gfg

import java.io.Serializable

class Employee(
    val name: String,
    val email: String
) : Serializable {

    init {
       var string = email
    }
}
