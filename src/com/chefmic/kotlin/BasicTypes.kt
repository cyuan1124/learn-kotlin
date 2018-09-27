package com.chefmic.kotlin

fun equalNum() {
    val a: Int = 1000
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA === anotherBoxedA) // false
    print(boxedA == anotherBoxedA)  // true
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException()
    }

    return c.toInt() - '0'.toInt()
}

// Construct array with lambda
val array = Array(5, { i -> (i * i).toString() })

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun min(a: Int, b: Int): Int = if (a > b) {
    print("A is bigger")
    a
} else {
    print("B is bigger")
    b
}