fun main(args: Array<String>) {

    val set = hashSetOf(1,7,53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to  "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(listOf('a','b','b').joinToString(separator = " ", prefix = "{(-", postfix = "-)}"))
    println("Hello, ${args.getOrNull(0)}!")

    //Extensiones to String:
    val q = """To code,
            |   or not code?..""".trimMargin()
    val a= """
        Keep calm
            and lear Kotlin""".trimIndent()

    println(q)
    println(a)

    //Regular Expressions:
    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    println(regex.matches("15.02.2022"))
    println(regex.matches("15.02.22"))


    //Extension function: withIndex()

    val list1 = listOf("a", "b", "c")
    for((index, element) in list1.withIndex()) {
        println("${index+1}, $element")
    }

    //Extension function: until
    infix fun Int.until(to: Int): IntRange {return to .. 123}

    //Conversion to numbers
    val number1= "123".toInt()
    val number2= "123".toDouble()

    println("$number1 and $number2")

}

