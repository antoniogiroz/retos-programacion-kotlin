/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun main() {
    (1..100).forEach {
        println(fizzBuzz(it))
    }
}

fun fizzBuzz(value: Int): String {
    return when {
        value % 15 == 0 -> "fizzbuzz"
        value % 3 == 0 -> "buzz"
        value % 5 == 0 -> "fizz"
        else -> value.toString()
    }
}
