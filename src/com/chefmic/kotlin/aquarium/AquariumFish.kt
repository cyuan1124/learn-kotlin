package com.chefmic.kotlin.aquarium

abstract class AquariumFish {

    abstract val color: String

}

class Shark : AquariumFish(), FishAction {

    override val color = "gray"

    override fun eat() {
        println("Shark is eating!")
    }
}

class Plecostomus : FishAction, FishColor by GoldColor {
    override fun eat() {

    }
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun main(args: Array<String>) {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color} \nPleco: ${pleco.color}")

    feedFish(shark)
}

object GoldColor : FishColor {
    override val color = "gold"
}