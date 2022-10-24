/*Implementar um programa em Java para verificar se uma pessoa está com febre,
sabendo que é considerado febre a partir de 37.3 graus. */

fun main(args: Array<String>) {

    print("Qual a sua temperatura? ")
    var temp = readLine()!!.toDouble

    var result = temp >= 37.3

    print("Você está com febre? $result" )
}
