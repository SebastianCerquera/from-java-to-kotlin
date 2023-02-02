package courseraWeek2

val employess : List<Employee> = TODO()

enum class  City {
    PRAGA,BOGOTA
}

data class Employee(
    val city: City, val age: Int
)
fun main() {
    employess.filter { it.city == City.BOGOTA }
        .map { it.age}
        .average()
}