package courseraWeek2

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello, ${args.getOrNull(0)}")

    println("First ${foo()}, second ${foo()}")
}

fun foo() : String {
    println("Calculating foo...")
    return  "foo"
}