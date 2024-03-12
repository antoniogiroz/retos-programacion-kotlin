/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

fun main() {
    val totalNumbers = 50
    val numbers = mutableListOf<Long>(0, 1)

    for (index in 2..<totalNumbers) {
        val nextNumber = numbers[index - 2] + numbers[index - 1]
        numbers.add(nextNumber)
    }

    println(numbers)
}
