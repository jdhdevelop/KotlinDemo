package com.joe.kotlin.demo

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val result = withContext(Dispatchers.Default) {
            println("current thread is ${Thread.currentThread().name}")
            5+5
        }
        println(result)
    }
}

