package courseraWeek2

class KotlinClass {
    var foo = 0

}
class Contact (
    val name: String,
    val address: String
)
class Person3(val name: String, var age: Int)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

val foo1 = run {
    println("Calculating the answer...")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }
class StateLogger {
    var state = false
        set(value) {
            println("state has changed: " +
                    "$field -> $value")
            field = value
        }
}


fun main() {
    val retangle = Rectangle(2,3)
    println(retangle.isSquare)
    println("$foo1 $foo1 $foo2 $foo2")

    val kotlinClass = KotlinClass()
    println(kotlinClass.foo)
}
