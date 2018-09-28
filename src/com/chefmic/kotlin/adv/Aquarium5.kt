package com.chefmic.kotlin.adv

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExample()
}

fun fishExample() {
    val fish = Fish("splashy")
    with(fish.name) {
        capitalize()
    }

    myWith(fish.name) {
        println(capitalize())
    }
}

fun myWith(name: String, block: String.() -> Unit) {

    name.block()

}