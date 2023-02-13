package courseraWeek2

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

class MyClass {
    lateinit var lateinitVar: String

    fun initializationLogic() {
        println(this::lateinitVar.isInitialized)
        lateinitVar = "value"
        println(this::lateinitVar.isInitialized)
    }
}

fun main() {
    println("Before")
    lazyValue.length
    Thread.sleep(5000)
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)

}

