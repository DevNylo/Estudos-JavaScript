/*Implementar um programa em Java para verificar se um número é par.*/

fun main(args: Array<String>) {
    println("Programa de Impar ou Par")

    print("Digite um número: ")
    var impaPar =readLine()!!.toInt();

    var number = impaPar % 2;
    
    var result = number == 0;

    print("O número é par? $result")
}