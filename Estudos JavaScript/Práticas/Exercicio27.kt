/*Implementar um programa em Java que verifique se uma pessoa está acima do
peso ideal a partir de seu peso e altura, bases para o cálculo do IMC (pesquise a
fórmula do IMC).*/

fun main(args: Array<String>) {

    println("CALCULANDO IMC")
    println("-----------------------")

    print("Digite o seu peso: ")
    var peso = readLine()!!.toDouble()

    print("Digite sua altura: ")
    var altura = readLine()!!.toDouble()

    var imc = peso / (altura * altura)
    var pesoIdeal = imc > 23 && imc < 25

    println("Seu IMC é $imc")
    println("Você está acima do peso ideal? $pesoIdeal")
 
}