package com.chefmic.kotlin.adv

open class BaseBuildingMaterial(val numberNeeded:Int = 1)

class Wood: BaseBuildingMaterial(4)

class Brick: BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(val material: T) {

    var baseMaterialsNeeded = 100

    var actualMaetrialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaetrialsNeeded ${material::class.simpleName} required")
    }
}

fun main(args: Array<String>) {
    Building(Wood()).build()
}