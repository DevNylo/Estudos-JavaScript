/*Implementar um programa em Java que verifique se o estado atual de combustível
em um carro aponta à necessidade de reabastecê-lo, sabendo que é sugerido realizar
o abastecimento quando o combustível atinge ¼ ou menos do tamanho do tanque. O
programa deve receber o tamanho do tanque e quantidade atual de combustível e
retornar se o carro deve ser reabastecido.*/

fun main(args: Array<String>) {
    
    print("Qual o tamanho do tanque de combustível em Litros: ")
    var tanque = readLine()!!.toInt()

    print("Qual a quantidade de combustível no tanque em Litros? ")
    var comb = readLine()!!.toDouble()

    var calc = tanque / 4
    var result = comb <= calc

    print("Carro precisa ser reabastecido? $result")

}