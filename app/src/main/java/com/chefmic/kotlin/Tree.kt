package com.chefmic.kotlin

class Tree(var treeName: String) {

    class Flower(var flowerName: String) {
        fun getName(): String = flowerName
    }

    inner class Fruit(var fruitName: String) {
        fun getName(): String = "$fruitName from a $treeName"
    }
}

enum class Season(val seasonName: String) {
    SPRING("spring"),
    SUMMER("summer"),
    AUTUMN("autumn"),
    WINTER("winter")
}

sealed class SeasonSealed {
    class Spring(var name: String) : SeasonSealed()
    class Summer(var name: String) : SeasonSealed()
    class Autumn(var name: String) : SeasonSealed()
    class Winter(var name: String) : SeasonSealed()
}

data class Plant(var name: String,
                 var stem: String,
                 var leaf: String,
                 var flower: String,
                 var fruit: String,
                 var seed: String)

class River<T>(var name: String, var length: T) {
    fun getInfo(): String {
        var unit: String = when (length) {
            is String -> "Meter"
            is Number -> "m"
            else -> ""
        }

        return "Length of $name is $length$unit"
    }
}