package courseraWeek2

import courseraWeek2.Color.*

enum class Color {
    BLUE, ORANGE, RED, YELLOW, GREEN, INDIGO, VIOLET
}

enum class Pet {
    Cat, Dog
}

fun main() {
    val color = BLUE

    println(getDescription(color))

}

fun getDescription(color: Color) : String =
    when (color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
        else -> throw Exception("Fake Color")
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(BLUE, YELLOW) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun updateWeather (degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
}

fun max(a: Int, b:Int) = if(a > b) a else b
