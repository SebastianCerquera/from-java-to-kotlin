package courseraWeek2

class PersonConstructor(name: String) {
 //constructor normal
    val name: String
    init {
        this.name = name
    }
}

// cuando agregamos var o val, automaticamente hace lo mismo que esta arriba
class PersonContructorVal(val name: String)

//Cambiando la visibilidad del constructor:

class InternalComponent
internal constructor(name: String) {

}

// constructor secundario:
class Rectangless(val height: Int, val width: Int) {
    constructor(side: Int) : this(side, side){}
}

//Extends & implements

interface Base
class BaseImple : Base

open class Parents
class Childs :  Parents()

//Si requieres pasar algún argumento para inicializar la super-clase se pasa dentro del
// parentesis

open class Parent1(val name: String)
class  Child1(name: String) : Parent1(name)

open class Parent2(val name: String)
class Child2 : Parent2 {
    constructor(name: String, param: Int) : super(name)
}