import  courseraWeek2.ColorKotlin
import courseraWeek2.PersonKotlin
import java.awt.Color
import java.awt.Color.*

fun main() {
    val person = PersonKotlin("Alicia" , 27)
    println(person.toString())

}

fun updateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 10 -> "cold" to BLUE
        degrees < 25 ->  "mild" to ORANGE
        else -> "hot" to RED
//
//        degrees < 10 -> Pair("cold", BLUE)
//        degrees < 25 ->  Pair("mild", ORANGE)
//        else -> Pair("hot", RED)

    }

}

fun isAString(s: String) : Boolean {return s.isNotBlank()}