package courseraWeek2

fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>{


    return TODO("Provide the return value")
}


fun use1(ints: List<Int>) {
    ints.filter {it > 0}
}

fun use2(ints: List<Int?>) {
    ints.filter {it != null && it > 0}
}

interface List<E> {
    fun get(index: Int) : E
}