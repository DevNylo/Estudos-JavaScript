/*Implemente um programa em Java que a partir da altura e base de um triângulo,
informados pelo usuário, calcule sua área e apresente ao usuário. */

fun main(args: Array<String>) {
    
    print("Digite a base: ")
    var base = readLine()!!.toInt()

    print("Digite a altura: ")
    var altura = readLine()!!.toInt()

    var calc = (base * altura) / 2

    println("A área do retângulo é $calc")
}