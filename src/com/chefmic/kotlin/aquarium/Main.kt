package com.chefmic.kotlin.aquarium

fun main(args: Array<String>) {
    buildAquarium();
}

fun buildAquarium() {
    val aquarium = Aquarium()

    println("Width: ${aquarium.width}, height: ${aquarium.height} and length: ${aquarium.length}")
}