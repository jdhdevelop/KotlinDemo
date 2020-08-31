package com.joe.kotlin.model

class Customer constructor(name:String) {
    val firstProperty = "First property : $name".also (::print)
    init {
        println("First init block that print $name")
    }

    val secondProperty = "Second property : ${name.length}".also(::print)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}