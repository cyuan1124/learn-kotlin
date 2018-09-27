package com.chefmic.kotlin.spices

fun main(args: Array<String>) {
    val sc1 = SpiceContainer("Steel")
    val sc2 = SpiceContainer("Glass")

    println(sc1.label)
}

data class SpiceContainer(val label: String)

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}