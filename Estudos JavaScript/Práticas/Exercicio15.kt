/*Implementar um programa em Java que retorne uma mensagem formatada com
o valor das parcelas de uma compra, a partir do valor total da compra e da
quantidade do parcelamento. */

fun main(args: Array<String>) {
    
    print("Valor da compra: ")
    var valor = readLine()!!.toDouble()

    print("Quantidade de parcelas: ")
    var parcelas = readLine()!!.toInt()

    var calc = valor / parcelas

    println("Sua compra de R$ $valor em $parcelas x de R$ $calc foi concluída")
}