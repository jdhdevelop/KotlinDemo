package com.joe.kotlin.model

class Person {
    private var name:String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "Name:$value"
        }
}