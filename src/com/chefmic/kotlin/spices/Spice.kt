package com.chefmic.kotlin.spices

sealed class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    abstract fun prepareSpice()
}

class Curry(val level: Int) : Spice("Curry"), Grinder, SpiceColor by YellowSpiceColor {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {

    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.BLUE
}