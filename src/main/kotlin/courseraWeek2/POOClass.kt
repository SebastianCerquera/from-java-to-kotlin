package courseraWeek2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> throw  IllegalArgumentException("Unknown expression")
}

sealed class Expr2
class Num2(val value: Int) : Expr2()
class Sum2(val left: Expr, val right: Expr2) : Expr2()

fun eval(e: Expr2) : Int = when (e) {
    is Num2 -> e.value
    is Sum2 -> eval(e.left) + eval(e.right)
}