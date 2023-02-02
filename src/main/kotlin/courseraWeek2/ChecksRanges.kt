package courseraWeek2

import java.util.Date

fun main() {

    for(i in  'a'..'z'){}
    println(isLetter('r'))
    println(isLetter('5'))

    println(recognize('$'))

    println(("Java".."Scala").javaClass)
    println((1..10).javaClass)
    println("Kotlin" in setOf("Java", "Scala"))


}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun compareDate(mydate: Date, starDate: Date, endDate: Date): Boolean {
    return mydate in starDate .. endDate
}

fun isAString(s: String):Boolean {
    fun isValidCharacter(ch: Char) =
        ch == '_' || ch.isLetterOrDigit()

    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s ) {
        if (!isValidCharacter(ch)) return false
    }
    return true

}

