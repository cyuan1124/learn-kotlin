package com.chefmic.kotlin

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
