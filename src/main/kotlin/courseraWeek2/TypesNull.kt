package courseraWeek2

fun main() {
    val s1: String = "always no null"
    val s2: String? = null

    println(s1.length)
    //println(s2.length) no tiene referencia, por lo tanto, no es posible
    //Acceso seguro:
    s2?.length //asi si puede acceder, dando null si es null o s2.length de lo contrario

    val s: String? = null

    val length1: Int = if ( s != null) s.length else 0
    println(length1)

    val length2: Int = s?.length ?: 0 //Elvis separator
    println(length2)

    println(s)

    try {
        s!!
    }
    catch(excepcionNull : NullPointerException){
        excepcionNull.javaClass
        println(excepcionNull.toString())
    }

    val length3: Int = s?.length ?: 1230 //Elvis separator
    println(length3)


}

fun foo3() : String = "foo"
fun bar3() : String? = "bar"