/*Implementar um programa em Java para converter kilos para gramas. */

fun main(args: Array<String>) {
    
    print("Quantos KG: ")
    var kg = readLine()!!.toDouble()

    var calc = kg * 1000

    println("$calc gramas")
}