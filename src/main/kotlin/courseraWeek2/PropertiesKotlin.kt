package courseraWeek2

interface User {
    val nickname: String
}

class SubscribinUser(val email: String) : User {

    // Extension properties
    val String.lastIndex: Int
        get() = this.length - 1

    val String.indices: IntRange
        get() = 0..lastIndex
    override val nickname: String
        get() = email.substringBefore('@')
}
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {

    println("asdf".lastIndex)
    println("asdf".indices)
    val s = "abc"
    println(s.medianChar)
    println(s.medianChar)
    val sb = StringBuilder(s)
    sb.lastChar = 'a'
    println( sb )

}

val String.medianChar
    get(): Char? {
        println("Calculating...")
        return getOrNull(length / 2)
    }


