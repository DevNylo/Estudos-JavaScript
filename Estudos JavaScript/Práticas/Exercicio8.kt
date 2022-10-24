/*Implemente um programa em Java que a partir do lado de um octágono de lados
iguais, informados pelo usuário, calcule seu perímetro e apresente ao usuário. */

fun main(args: Array<String>) {
    
    print("Digite o valor: ")
    var num = readLine()!!.toInt()

    var calc = num * 8

    println("A perímetro do octagono é: $calc")
}