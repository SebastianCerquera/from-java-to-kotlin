package courseraWeek2

enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color) : String =
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
    }

fun max(a: Int, b:Int) = if(a > b) a else b
