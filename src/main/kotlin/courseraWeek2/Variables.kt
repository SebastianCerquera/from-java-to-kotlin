package courseraWeek2

fun main() {
    val question: String = "life, the universe," + "and everything"
    println("$question")

    //question = "sure?" //esto denotaria un error y el IDE nos recomienda cambiar la keyboard val por var.

    var answer = 0
    answer = 42
    println(answer)

    //No es necesario especificar el tipo de variable.
    val greeting = "Hi!"
    var number = 0

    //Referencia a una lista muteable:
    val lenguages = mutableListOf("Java")
    lenguages.add("Kotlin")

    val mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")
    println(mutableList)

    val readOnlyList = listOf("Java")
    //readOnlyList.add("Kotlin") // Esta linea no es permitida
    println(readOnlyList)
}