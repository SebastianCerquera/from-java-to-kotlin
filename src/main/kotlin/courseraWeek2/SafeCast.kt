package courseraWeek2

fun main() {
    val any = 123
    val printAny = (any as? String)?.uppercase()
    println(printAny)
}

fun castAny(any : String?): String? {
    return (any as? String)?.uppercase()
}