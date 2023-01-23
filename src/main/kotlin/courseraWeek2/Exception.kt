package courseraWeek2

import java.io.IOException

fun main() {
    val number = 12

    val percentage = if (number in 0 .. 100)
        number
    else
        throw IllegalArgumentException(
            "A percentage value must be " +
            "between 0 and 100: $number"
        )
    val string= "12ñ3"
    val number2 = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        null
    }
}

//fun foo() = throw IOException() Este código no complia en Java

@Throws(IOException::class)
fun bar() {throw IOException()}