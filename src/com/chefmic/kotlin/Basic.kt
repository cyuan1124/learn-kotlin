package com.chefmic.kotlin

val PI = 3.14 // static final
var x = 0

fun incrementX() {
    x += 1
}

/**
 * Define a method for adding 2 ints
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    println("sum of 19 and 23 is ${simplySum(19, 23)}")
}

fun simplySum(a: Int, b: Int) = a + b

/**
 * Define a method return nothing
 */
fun printSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${sum(a, b)}")
}

/**
 * Unchangeable value
 */
fun main2() {
    val a: Int = 1 // explicitly assign a type
    val b = 2
    val c : Int
    c = 3

    println("a = $a, b = $b, c = $c")
}

fun main3() {
    var x = 5
    x += 1

    print("x is $x")
}

/**
 * string module
 */
fun main4() {
    var a = 1
    val s1 = "a is $a"

    a = 2

    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2 is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

/**
 * Sample for for-loop
 */
fun forLoop() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

/**
 * Sample for while loop
 */
fun whileLoop() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

/**
 * Sample for range
 */
fun range() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "C")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    for (x in 1..5) {
        println(x)
    }

    for (x in 1..10 step 2) {
        println(x)
    }
}

fun collectionSample() {
    val items = setOf("apple", "banana", "kiwi")

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    items.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{ println(it) }
}


