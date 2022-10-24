/*Implementar um programa em Java para verificar se dois retângulos possuem a
mesma área. */

fun main(args: Array<String>) {
    
    println("PRIMEIRO RETÂNGULO")

    print("Digite o valor da BASE ")
    var base1 = readLine()!!.toDouble()

    print("Digite o valor da ALTURA ")
    var altura1 =  readLine()!!.toDouble()

    println("------------------------------")

    println("SEGUNDO RETÂNGULO")

    print("Digite o valor da BASE ")
    var base2 =  readLine()!!.toDouble()

    print("Digite o valor da ALTURA ")
    var altura2 = readLine()!!.toDouble()

    var area1 = base1 * altura1;
    var area2 = base2 * altura2;

    var comparar = area1 == area2;

    print("O primeiro retângulo possui área $area1")
    print("O segundo retângulo possui área $area2");
    print("Eles são iguais? $comparar");
}