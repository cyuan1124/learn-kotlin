package com.chefmic.kotlin.aquarium.decoration

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    println(d1)
    println(d2)
    println(d3)
    println(d1.equals(d2))
    println(d3.equals(d2))
}

data class Decorations(val rocks: String) {}

data class Decorations2(val rocks: String, val wood: String, val diver: String) {}