package com.chefmic.kotlin

class SimpleSpice {

    var name = "curry"
    var level = "mild"

    var heat: Int
        get() = when (level) {
            "mild" -> 5
            else -> 0
        }
        set(value) {}
}

fun main(args: Array<String>) {
    val spice = SimpleSpice()
    println("Spice name is ${spice.name} and its heat is ${spice.heat}")
}