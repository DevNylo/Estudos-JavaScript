/*Implementar um programa em Java que calcule quantas paradas para
abastecimento são necessárias para realizar uma viagem, a partir da capacidade
do tanque de combustível (em litros), do consumo do veículo (km por litros) e da
distância da viagem (km). */

fun main(args: Array<String>){
    
    print("Capacidade: ")
    var comb = readLine()!!.toDouble()

    print("Km Litro: ")
    var km = readLine()!!.toDouble()

    print("Distância: ")
    var distancia = readLine()!!.toDouble()

    var calc = (comb * km) / distancia

    println("Você precisará fazer "+Math.ceil(calc)+" paradas para abastecer.")



}