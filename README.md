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
puedes igualar una variable a un `if` directamente, el caso del `when` funciona similar al `swich` de *Java*, (una forma
de agregar multiples `if-else`).

- **Mas info:** <https://www.coursera.org/learn/kotlin-for-java-developers/lecture/7iKgc/conditionals-if-when>

## Semana 3