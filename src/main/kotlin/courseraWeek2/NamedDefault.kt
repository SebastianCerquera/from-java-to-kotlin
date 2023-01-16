package courseraWeek2

fun main() {
    println(listOf('a','b','c',).joinToString(
        separator = "", prefix = "(", postfix = ")"))

    println(listOf('a','b','c').joinToString(postfix = "."))

    displaySeparator(size = 3)
    println("\n")
    displaySeparator(size = 3, character = '5')
    println("\n")

    println(sum(3))
    println(sum(a = 3, b = 2))
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun sum(a: Int = 0, b: Int = 1, c: Int = 2) = a + b + c