/*Implemente um programa em Java que a partir do lado de um quadrado,
informado pelo usuário, calcule sua área e apresente ao usuário. */

fun main (args: Array<String>){

    print("Digite um número: ")
    var num = readLine()!!.toInt()

    var calc = num * num

    println("A área do quadrado é: $calc")
}