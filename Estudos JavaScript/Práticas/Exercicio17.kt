    /*Implementar um programa em Java para calcular o total de uma venda de açaí a
partir da quantidade de açaís comprados, sabendo que o estabelecimento oferece
um tamanho único para o açaí no valor de R$ 13,50*/

fun main(args: Array<String>) {

    print("Qual quantidade de AÇAÍ: ")
    var qtdAcai = readLine()!!.toByte()

    var calc = qtdAcai * 13.50

    println("Total à pagar é R$ $calc")

}