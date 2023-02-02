package courseraWeek2

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val sum2: (Int, Int) -> Int = { x, y -> x + y }

    val list = listOf(1,2,3,4)
    val isEven = { i: Int -> i % 2 == 0 }
    val result = isEven(42)
    val predicate = isEven

    println(result)

    println(list.any(isEven))
    println(list.filter(isEven))

    fun isEvenFun(i: Int): Boolean = i % 2 == 0
//    val predicate2 =isEvenFun() //esto no es posible, guardar una función en una variable
    val predicate2 =::isEvenFun

    println(list.any(::isEvenFun))
    println(list.filter(::isEvenFun))


}