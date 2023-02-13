package courseraWeek2

object KSingleton {
    fun foo(){}
}

class A {
    companion object {
        fun foo()=  1
    }
}

fun main() {
    KSingleton.foo()
    A.foo()
}