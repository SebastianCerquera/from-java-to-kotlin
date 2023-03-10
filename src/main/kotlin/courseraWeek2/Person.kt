package courseraWeek2

class Person(val name: String, val age: Int) {
    fun  isOlder(ageLimit: Int) = age > ageLimit
    fun getAgePredicate() = this :: isOlder //NO USAR ESTA SINTAXIS.

}
// Bound & non-bound references:

//class Person(val name: String, val age: Int) {
//    fun  isOlder(ageLimit: Int) = age > ageLimit
//    fun getAgePredicate() = isOlder()
//}
fun main() {
    val agePredicate = Person::isOlder
    val alice = Person("Alice", 22)
    val result = agePredicate(alice,18)
    println(result)
    val predicate = alice.getAgePredicate()
    println(predicate)
}