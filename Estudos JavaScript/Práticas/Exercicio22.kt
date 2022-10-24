/*Implementar um programa em Java para verificar se um aluno passou ou não,
baseado em 3 notas, considerando que a média mínima para passar é 6. */

fun main(args: Array<String>) {

    print("Qual a primeira nota? ")
    var nota1 = readLine()!!.toDouble()

    print("Qual a segunda nota? ")
    var nota2 = readLine()!!.toDouble()

    print("Qual a terceira nota? ")
    var nota3 = readLine()!!.toDouble()

    println("Verificando se você foi aprovado...")

    var result = (nota1 + nota2 + nota3) / 3 >= 6

    print("O aluno foi aprovado? $result")
}