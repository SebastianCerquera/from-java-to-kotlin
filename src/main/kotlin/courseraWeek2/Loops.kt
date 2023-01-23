package courseraWeek2

fun main() {
    val list = listOf("a", "b", "c")
    for(s :String in list) {
        print(s)
    }

    println()

    for (i in 9 until  1) {
        print(i)
    }



    val map = mapOf(1 to "one",
        2 to "two",
        3 to "three")
    for ((key, value) in map) {
        println("$key = $value")
    }

    val listIndex = listOf("a", "b", "c")
    for ((index, elemento) in listIndex.withIndex()) {
        println("$index  : $elemento")
    }

    for (i in 9 downTo  1 step 2) print(i)

    println()

    for (cic in "abc") {
        print(cic + 1)
    }

    println()

    for (i in 1..9) {
        print(i)
    }

    println()


}
