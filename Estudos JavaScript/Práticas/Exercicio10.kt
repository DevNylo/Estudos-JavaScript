/*Implemente um programa em Java que a partir de cinco notas, informadas pelo
usuário, calcule a média e apresente ao usuário. */

fun main(args: Array<String>) {
    
    print("Digite uma nota: ")
    var nota1 = readLine()!!.toDouble()

    print("Digite uma nota: ")
    var nota2 = readLine()!!.toDouble()

    print("Digite uma nota: ")
    var nota3 = readLine()!!.toDouble()

    print("Digite uma nota: ")
    var nota4 = readLine()!!.toDouble()

    print("Digite uma nota: ")
    var nota5 = readLine()!!.toDouble()

    var calc = (nota1 + nota2 + nota3 + nota4 + nota5) / 5

    println("A média do aluno é: $calc")
}