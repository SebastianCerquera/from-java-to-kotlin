package courseraWeek2

fun main() {
    val c : Char = "abas".lastChar()
    println(c)

    //val repetir = repeat(3,"asdf")
    //println(repetir)
    println("Hola mundo ".repeat(5))
}
fun String.lastChar() = this.get(this.length - 1) //String es el "receiver", y es llamado por referencia "this"

fun String.lastChar2() = get(length -1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1 .. n) {
        sb.append(this)
    }
    return  sb.toString();
}