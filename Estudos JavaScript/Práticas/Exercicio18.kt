/*Implementar um programa em Java para calcular o total de uma venda de açaí a
partir das quantidades compradas para cada tamanho: pequeno, médio e grande,
sabendo que o valor do açaí é R$ 13,50, R$ 15,00 e R$ 17,50 respectivamente. */

fun main(args: Array<String>) {
    
    print("Pequeno: ")
    var pequeno = readLine()!!.toByte()

    print("Médio: ")
    var medio = readLine()!!.toByte()

    print("Grande: ")
    var grande = readLine()!!.toByte()

    var calc = (pequeno * 13.50) + (medio * 15.00) + (grande * 17.50)

    println("Total à pagar é R$ $calc")
}