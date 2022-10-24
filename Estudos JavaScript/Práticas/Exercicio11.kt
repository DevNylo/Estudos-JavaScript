/*Implementar um programa em Java para calcular o valor final de uma compra a
partir do valor da compra e do cupom de desconto. O cupom diz quantos reais
terá de desconto. */

fun main(args: Array<String>) {
    
    print("Qual o valor da compra: ")
    var valor = readLine()!!.toDouble()

    print("Qual o desconto do cupom: ")
    var desconto = readLine()!!.toDouble()

    var calc = valor - desconto

    println("Compra finalizada! O total é de R$ $calc")
}