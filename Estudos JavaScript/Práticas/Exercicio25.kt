/*Implementar um programa em Java que realize uma pergunta sobre um
anime/filme ao usuário e verifique se a resposta está correta.
A pergunta usada como base foi: “Qual é o personagem de Friends que trabalha com TI?”*/

fun main(args: Array<String>) {
        
    print("Qual o personagem de Friends que trabalha com TI: ");
    var resposta =readLine()!!.toString()

    var condiction = resposta.trim().equals("Chandler", ignoreCase = true);

    println("A resposta está certa? $condiction");
    
}