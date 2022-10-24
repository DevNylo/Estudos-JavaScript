/*Implementar um programa em Java para calcular o total de uma venda de açaí a
partir das quantidades compradas para cada tamanho: pequeno, médio e grande,
sabendo que o valor do açaí é R$ 13,50, R$ 15,00 e R$ 17,50. O programa também
deve receber o valor do cupom de desconto em porcentagem. */

fun main(args: Array<String>) {
    
    print("Pequeno: ")
    var pequeno = readLine()!!.toByte()

    print("Médio: ")
    var medio = readLine()!!.toByte()

    print("Grande: ")
    var grande = readLine()!!.toByte()

    print("Cupom de desconto: ")
    var cupom = readLine()!!.toByte()

    var calc = (pequeno * 13.50) + (medio * 15.00) + (grande * 17.50)
    var result = (cupom / 100) * calc

    println("Total à pagar é R$ $result")
}