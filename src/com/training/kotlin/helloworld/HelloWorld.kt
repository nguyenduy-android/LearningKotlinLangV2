package com.training.kotlin.helloworld

class HelloWorld {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }

    fun hello(){
        println("Hello World");
    }
}

fun main(){
    val h : HelloWorld = HelloWorld(1000)
    h.hello()
}