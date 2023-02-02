# Curso Kotlin
Curso *Kotlin for Java Developer* tomado desde la plataforma [*Coursera*](https://www.coursera.org/) ofrecido por 
*JETBRAINS*.

   - **Mas info:** <https://www.coursera.org/lecture/kotlin-for-java-developers/from-java-to-kotlin-P62Ej>
## Semana 1
*Kotlin* es un lenguaje de programación, creado por *Jetbrains* en el año 2010. Es la base del desarrollo de Android.
También es utilizado en el desarrollo backend (usando framework como Spring, Micronau o Ktor), permite generar programas 
de forma nativa, hacer Script que se pueden ejecutar en cualquier entorno.

Diferentes plataformas de destino:
- Kotlin/JVM (Server, Android)
- Kotlin/JS (Browser)
- Kotlin/Native (iOS)

    - **Mas info:** [¿Qué es Kotlin?](https://www.coursera.org/learn/kotlin-for-java-developers/lecture/XqvPb/what-is-kotlin),
  [Historia de Kotlin](https://www.coursera.org/learn/kotlin-for-java-developers/lecture/K8pZr/history-of-kotlin).
  

## Semana 2

### Básico:
 #### De Java a Kotlin:
El IDE `Intellij Idea` nos permite convertir código *Java* a código *Kotlin* de manera "automática", basta con copiar
el código y pegarlo en el file de Kotlin .kt; pero esta conversión no es idiomática, por lo que se hace necesario 
releer el código y modificarlo manualmente.

   - **Mas info:** <https://www.coursera.org/lecture/kotlin-for-java-developers/from-java-to-kotlin-P62Ej>

 #### Variables:
Existen dos tipos de variables las mutables (`var`) y las inmutables (`val`).
 
 - Keyword val: Viene de "value" y denota  variable de solo lectura o asignada una vez.
 - Keyword var: Viene de "variable" y denota una variable mutable, la cual puede ser modificada.

En *Kotlin* se puede omitir el tipo de variable, ya que el compilador infiere automáticamente el tipo, una vez asignada:

   - `val greeting: String = "Hi!"` se puede escribir:`val greeting = "Hi!"` 

Tal como Java podemos hacer una analogía de `val` como `final`, y esta es inmutable en la referencia, con esto no dice 
nada acerca del contenido del objeto, por lo cual si es posible modifica un objeto guardado en `val`, por ejemplo:


~~~
val lenguages = mutableListOf("Java")
lenguages.add("Kotlin")
~~~

En *Kotlin* se tiene una distinción entre las listas mutable y read-only:

~~~
val muteableList = mutableListOf("Java") //Lista muteable
val readOnlyList = listOf("Java") // No puede ser modificada
~~~

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/GhGA8/variables>

 #### Funciones:

`Intellij Idea` o `Android Studio` puede convertir automáticamente una forma a otra. Ejemplo nos permite convertir una
función a una *expression body*, para esto nos ubicamos en la palabra `return` y oprimimos *alt* + *enter*.

Si la función no retorna algún tipo específico, utilizamos la keyword `Unit` similar a la keyword `void` utilizada en 
*Java*, aunque en *Kotlin* no es necesario especificarla.


En *Kotlin* se puede definir funciones en todas partes:

- Top-level function: 
~~~
fun topLevel() = 1
~~~
- Member function: 
~~~
call A {
  fun member() = 2
}
~~~
- Local function:
~~~
fun other() {
  fun local() = 3S
}
~~~

Desde Java, se puede llamar una *top-level function* como una función `static`. 
Es posible cambiar el nombre de la clase que contiene las *top-level function* esto agregando la anotación: 
`@file:JvmNave("Util")` encima del package que contiene el file.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/52g61/functions>

 #### Argumentos, Named & default:
Se puede proveer valores por default para los argumentos, o especificar sus nombres, cuando son llamados en una función.
Para esto se debe especificar el nameCharacteristic y =, no es necesario escribir todas las características, ya que de
no hacerlo se toman las que vienen por defecto.

En *Kotlin* no hay conversión implícita, es necesario llamar explícitamente `toInt`, o `toChar`.

Si llamas una función *Kotlin* con valores por defecto, desde *Java se debe agregar la anotación `@JvmOverloads`:

~~~
//Kotlin
@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0)

//Java
sum(1);
~~~

Esta función en *Kotlin* genera 8 combinaciones posibles, pero cuando es llamada en *Java* solo sobrecarga 4 funciones:

~~~
public static final int sum(int a, int b, int c)
public static final int sum(int a, int b)
public static final int sum(int a)
public static final int sum()

~~~

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/MGwZg/named-default-arguments>


### Estructuras de control:
 #### Condicionales: if & when

Él `if` y el `when` son las estructuras de control básicas, él `if` se usa igual que en *Java*, solo que en *Kotlin*
puedes igualar una variable a un `if` directamente, el caso del `when` funciona similar al `switch` de *Java*, (una forma
de agregar multiples `if-else`), pero no es necesario usar `break` ya que en *Kotlin* una vez se ingrese.

Cuando requerimos algún tipo de jerarquía y se requiere validar algún tipo o subtipos, y de acuerdo hacer una acción, en
*Kotlin* podemos usar `when` para esto.


- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/7iKgc/conditionals-if-when>

 #### Loops

Las formas básicas de ciclos en *Java* son: `for`, `while` y `do-while`, en *Kotlin* usamos la misma estructura del
`while` y `do-while` que en *Java*, pero él `for` es diferente:

~~~
val list = listOf("a", "b", "c")
for(s :String in list) {
  print(s)
}
~~~

La especificación del tipo dentro del for es opcional. Para el caso de iterar un Map, también es diferente en *Kotlin*:

~~~
val map = mapOf(1 to "one",
                2 to "two",
                3 to "three")
for ((key, value) in map) {
  println("$key = $value")
}
~~~

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/WOweq/loops>

 #### 'in' checks & ranges
La keyword `in` es utilizada para establecer un rango, se usa tanto en *Int* como en *String*. Suele venir acompañado de
**..** : `c in 'a'..'z'`.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/ungradedWidget/Yqyi3/kotlin-playground-checking-identifier>


 #### Exception
El manejo de excepciones en *Kotlin* es muy similar al de *Java* con una importante diferencia *Kotlin* no hace 
diferencia entre *checked* y *unchecked* excepciones. Para el manejo de todas las excepciones lo hacemos con `throw`.

En *Kotlin* él `try` es una expresión, lo que quiere decir que se puede asignar el resultado a una variable.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/MCxNk/exceptions>

### Extensions
 
 #### Extensions Functions
Las funciones de extensión, extienden la clase, se define fuera de la clase, pero puede ser llamada como miembro de ella.
El tiempo que se extiende la función se denomina *Receiver*, el receiver es llamado por referencia `this`, también se
puede llamar los miembros del receiver dentro de una función de extensión sin especificar él `this`, ejemplo:

~~~
fun String.lastChar() = this.get(this.length - 1)
fun String.lastChar() = get(length -1)
~~~

Estas funciones son necesarias hacerle el *import com.example.package.etc*  para poder llamarlas desde otras clases.

Para llamar este tipo de funciones desde *Java* es necesario importarlas como `static`.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/i8Av9/extension-functions>

 #### Examples from the Standard Library

Kotlin standard library = Java standard library + extensions

Nota: `set.javaClass` en *Kotlin* es similar a: `set.getClass()` en *Java· Cuando creas colecciones usando las funciones
desde *Kotlin Standard Library*, instancias de *Java Standard Classes* son creadas. La biblioteca de *Kotlin* 
simplemente provee extensiones de regular *Java collections*. 

No existen algo como *Kotlin SDK*, simplemente es *JDK* + *extensiones*.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/ungradedWidget/drdf0/kotlin-playground-sum-as-an-extension-function>

 #### Calling Extensions
*Kotlin* resuelve el llamado de clase *Padre* a clase *Hijo* igual que lo hace *Java*, con los métodos statics. Por lo 
general elige el padre, una extensión no puede ocultar a un miembro por completo, pero si puede sobrecargarlo.

## Semana 3

### Nullability

 #### Nullable types

Sir Tony Hoare fue el inventor del null reference. Son errores difíciles de solucionar, lo cual hace que a menudo estas
excepciones sean `thrown`. Un moderno acercamiento es hacer que NPE sea un *compile-time* error y no un *run-time* error.

*Kotlin* distingue entre tipos nullables y tipo no nullables, agregando `?` al tipo de variable.  Ejemplo:

~~~
val s1: String = null //No es posible
val s2: String? = null 
~~~

*?:*, es sinónimo de nullable. Haciendo uso de *Elvis operator ?:*, se puede dar valores por defecto. El cual remplazaría
un if-else.

~~~
foo ?: bar
    foo != null ---> foo
    foo == null ---> bar
~~~

Se puede lanzar un null pointer exception usando: *!!*

~~~
foo!!
    foo != null ---> foo
    foo == null ---> NPE
~~~

En general es preferible usar: `?.  ?: if-checks` a `!!`. 

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/wM6YD/nullable-types>


 #### Nullable Types Under the Hood

Anotaciones: *@Nullable*, *@NotNull*

La clase `Optional` aunque es similar al manejo de tipos nullables, son muy diferentes en términos de rendimiento. Los 
tipos *Optional* es un wrapper que almacena la referencia al objeto inicial. En cambio, los tipos nullables no crean 
ningún wrapper, se implementan mediante anotaciones.

Existe una diferencia entre una lista de elementos nullables `List<Int?>` (cada elemento dentro de la lista puede ser 
nulo o no), y una lista nullable `List<Int>?` tola la lista puede ser nula o no.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/39clE/nullable-types-under-the-hood>

### Functional Programming
  
 #### Lambdas

Lambda es una función anónima, que se puede utilizar como una expresión. En *Kotlin* Lambda siempre va con llaves, 
la sintaxis:
~~~
{ x: Int, y: Int -> x + y }
~~~

Si *Kotlin* tiene su propio argumento se puede remplazar por `it` ejemplo:

~~~
list.any { i -> i > 0 }
list.any { it > 0 }
~~~

Si se requiere una lambda multilínea para lógicas más complicadas, se escribe varias líneas y la última de estas es la
que se retornara:
~~~
lis.any {
    print("Procesando $it")
    it > 0  //esto es lo que retorna.
}
~~~


Si se usa un map, se puede desconstruir dentro de una lambda y en vez de usar un parámetro se llaman ambos:
~~~
map.mapValues { (key,values) -> "$key -> $values!" }
~~~

Si no se usa alguno de estos valores, este se puede reemplazar por _ en la lambda:
~~~
map.mapValues { (_,values) -> "$values!" }
~~~

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/5WnAh/lambdas>

 #### Common operations on collections
Él `filter` y él `map` dentro de la biblioteca estándar de *Kotlin* son funciones de extensión. El *filter* dentro de 
una lista mantienen los elementos que satisfacen el predicado dado. El *map* transforma cada elemento dentro de una 
colección y almacena todos los elementos transformados en una nueva lista.
Existen predicados tales como: *any (all, none)* que hacen verificación sobre una lista y devuelven un Boolean. El 
operador: *find* encuentra un elemento que satisface el predicado dado y lo devuelve como resultado, si no encuentra un 
elemento que satisfaga devuelve un `null`. Otro operador: *first / firstOrNull* hace la misma función que *find*, pero 
devuelve el primer elemento o nulo que satisface, first arroja una excepción si no encuentra el elemento. El operador: 
*count* recuenta el número de veces que se satisface el predicado. El operador: *partition* divide la colección en dos 
colecciones la que cumple el predicado y los restantes elementos. El operador: *groupBy* es usado para dividir la 
colección en más de dos grupos (dividen maps siendo su nueva `key` el predicado seleccionado). El operador: 
*associateBy* es similar al groupBy, solo que este requiere si o si una key única, ya que remueve los que tengan claves
duplicadas. El operador: *associate* para crear un map asociado a una lista.  El operador: *zip* otorga una manera de 
organizar un par de listas, devuelve una lista de pares donde cada par contiene un elemento de la primera y un elemento
de segunda lista. El operador: *flatten* se utiliza en una lista de listas, combina todos los elementos en una lista 
anidada y los devuelve. El operador: *flatMap*, convierte cada elemento inicial en una lista. Toma los String y los 
mapea en dos lista luego los aplana en una sola lista.

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/kpua0/common-operations-on-collections>

 #### Function Types

En *Kotlin* es posible almacenar una lambda como una variable. Se puede llamar una lambda previamente almacenada en una 
variable, sobre cualquier colección que se tenga dada, siempre que se espere una expresión de tipo función ejemplo: 
`println(list.any(isEven))`. Incluso se puede llamar una lambda de una forma más directa siguiendo las siguientes 
sintaxis: `{ println("hey!") }()`, `run { println("hey!") }` (hacen exactamente lo mismo).

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/865m3/function-types>  

 #### Member references

Al igual que *Java* en *Kotlin* se maneja tipo por referencias, dicha sintaxis es la misma en ambos lenguajes. Ejemplo:

~~~
    class Person(val name: String, val age: Int)
    people.maxBy { it.age}
    
    //convert lambda to reference:
    people.maxBy(Person::age)
~~~

Tener en cuenta que se puede guardar una lambda en una variable, peor no se puede guardar una función en una variable,
el compilador arroja un error. Ya que en *Kotlin* hay una clara distinción entre variable y función. Para solucionar 
este inconveniente se debe usar la sintaxis de la función de referencia: `::isEven` 

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/vhWDv/member-references>


## Semana 4
