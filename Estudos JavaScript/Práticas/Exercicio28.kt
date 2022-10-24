/*Implementar um programa em Java que calcule o tempo que um livro será lido por
uma pessoa a partir do nome do livro, do total de páginas e do tempo em segundos
de leitura por página. */

fun main(args: Array<String>) {
    
    print("Qual o nome do livro? ")
    var book = readLine()!!.toString()

    print("O livro contém quantas páginas? ")
    var totalPag = readLine()!!.toString()

    print("Em quantos segundos você consegue ler cada página? ")
    var seconds = readLine()!!.toInt()

    var result = (totalPag * seconds) / 3600

    print("Você lerá $book em $result horas")

}