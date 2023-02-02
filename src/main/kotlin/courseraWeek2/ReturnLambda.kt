package courseraWeek2

fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return@flatMap listOf()
        listOf(it,it)

    }
}

fun main() {
    println(duplicateNonZero(listOf(3,0,5)))

    val list = listOf(3,0,5)
    val resutl = list.flatMap {
        if (it == 0 ) return@flatMap listOf<Int>()
        listOf(it,it)
    }

    println(resutl)
}
