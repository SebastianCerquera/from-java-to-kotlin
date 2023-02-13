package courseraWeek2

import courseraWeek2.ColorsEnum.*
enum class ColorsEnum {
    BLUE, ORANGE, RED
}

fun getDescription(color: ColorsEnum) =
    when(color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
    }

enum class ColorProperties(
    val r: Int, val g: Int, val b: Int
) {
    BLUE(0,0,225), ORANGE(255, 165, 0), RED(255, 0 ,0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(ColorProperties.BLUE.r)
    println(ColorProperties.BLUE.rgb())
}

