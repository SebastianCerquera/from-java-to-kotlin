package courseraWeek2

val heroes = listOf(
    Hero("The Captain", 60, Gender.MALE),
    Hero( "Frenchy", 42, Gender.MALE),
    Hero( "The kid", 9, null),
    Hero( "Lady Lauren", 29, Gender.FEMALE),
    Hero( "First Mate", 29, Gender.MALE),
    Hero( "Sir Stephen", 37, Gender.MALE)
)
fun main() {
    //encontrar el último nombre
    val lastName = heroes.last().name
    println(lastName)

    val firstNameOrNull = heroes.firstOrNull{ it.age == 30 }?.name
    println(firstNameOrNull)

//    val firstName = heroes.first{ it.age == 30 }?.name
//    println(firstName) //devuelve un NoSuchElementException

    val mapDistinct = heroes.map { it.age }.distinct().size
    println(mapDistinct)

    val filterAge = heroes.filter { it.age < 30 }.size
    println(filterAge)

    val (youngest, oldest) = heroes.partition { it.age < 30 }
    println("Size youngest is ${youngest.size} and size oldest ${oldest.size}")

    val nameMaxOld = heroes.maxBy { it.age }?.name
    println(nameMaxOld)

    val nameMinOld = heroes.minBy { it.age }?.name
    println(nameMinOld)

    val allProperty = heroes.all { it.age < 50 }
    println(allProperty)

    val anyProperty = heroes.any { it.gender == Gender.FEMALE}
    println(anyProperty)

    //Quiz II
    val mapByAge: Map<Int, List<Hero>> =
        heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) ->
        group.size
    }!!
    println(mapByAge)
    println(age)
    println(group)


    val mapByName: Map<String, Hero> = heroes.associateBy { it.name }
    val ageMapByName= mapByName["Frenchy"]?.age
    println(mapByName)
    println(ageMapByName)

    val unknownHero = Hero("Unknown", 0, null)
    mapByName.getOrElse("unknown") { unknownHero }.age
    println(mapByName)

    //WARN: como no debe escribirse una lambda:

    val (first, second) = heroes
        .flatMap { heroes.map { hero -> it to hero } }
        .maxBy { it.first.age - it.second.age }!!
    println(first.name)

}

