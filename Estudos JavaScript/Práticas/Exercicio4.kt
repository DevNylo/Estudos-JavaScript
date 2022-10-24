/*Implemente um programa em Java que a partir de um número informado pelo
usuário, calcule sua metade e apresente ao usuário. */

fun main (args: Array<String>){

    print("Digite um número: ")
    var num = readLine()!!.toInt()

    var calc = num / 2

    println("A metade de $num é $calc")
}