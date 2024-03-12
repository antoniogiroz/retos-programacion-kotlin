/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

fun main() {
    println("amor, roma -> ${areAnagram("amor", "roma")}")
    println("casa, saca -> ${areAnagram("casa", "saca")}")
    println("paralelepipedo, paralelepipedo -> ${areAnagram("paralelepipedo", "paralelepipedo")}")
    println("Listen, Silent -> ${areAnagram("Listen", "Silent")}")
    println("Dormitory, dirty room -> ${areAnagram("Dormitory", "dirty room")}")
    println("a!mor, r!oma -> ${areAnagram("a!mor", "r!oma")}")
    println(", test -> ${areAnagram("", "test")}")
    println(",  -> ${areAnagram("", "")}")
    println("123, 321 -> ${areAnagram("123", "321")}")
    println("amor!, roma -> ${areAnagram("amor!", "roma")}")
}

fun areAnagram(a: String, b: String): Boolean {
    if (a == b) {
        return false
    }

    val aLower = a.lowercase().toCharArray().sorted()
    val bLower = b.lowercase().toCharArray().sorted()

    return aLower == bLower
}
