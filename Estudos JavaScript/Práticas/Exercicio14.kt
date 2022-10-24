/*Implementar um programa em Java para converter reais em dólar (1$ -> R$ 5,16). */

fun main(args: Array<String>) {
    
    print("Qual o valor da compra: ")
    var reais = readLine()!!.toDouble()

    var calc = reais / 5.16

    println("O total de dólar é $calc")
}