package com.chefmic.kotlin

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Create a DTO
 */
data class Customer(val name: String, val email: String)

fun foo(a: Int = 0, b: String = "") {

    for (i in 1..100) {
    }
    for (i in 1 until 100) {
    }
    for (x in 2..10 step 2) {
    }
    for (x in 10 downTo 1) {
    }

    val x = 5
    if (x in 1..10) {

    }

    // Read only list
    val list = listOf("a", "b", "c")

    // Read only map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
    // map["a"] = 5
}

fun String.spaceToCamelCase() {
    val files = File("test").listFiles()
    print(files?.size ?: "empty")
}

object Resource {
    val name = "Name"
}

fun transform(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}

fun test() {
    val result = try {
        transform("Black")
    } catch (e: IllegalArgumentException) {
        throw e
    }
}

fun foo(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

fun testTurtle() {
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

fun tryWith() {
    val stream = Files.newInputStream(Paths.get("/assets/file.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }
}