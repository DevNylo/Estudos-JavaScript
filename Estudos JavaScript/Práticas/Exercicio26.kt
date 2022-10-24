/*Implementar um programa em Java que verifique se um pedestre pode atravessar
a rua a partir da cor do semáforo.*/

fun main(args: Array<String>) {

    print("Qual a cor do semáforo: ")
    var cor = readLine()!!.toString()
    
    var semaforo = cor.equals("Verde", ignoreCase = true)

    print("Posso atravessar? $semaforo")

}