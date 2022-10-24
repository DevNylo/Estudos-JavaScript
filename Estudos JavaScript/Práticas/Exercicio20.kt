/*Implementar um programa em Java para calcular o salário líquido de um
funcionário, a partir de seu salário base, do bônus mensal em porcentagem e
do total de descontos em reais. */

fun main(args: Array<String>) {

    print("Qual o valor do seu salário base? ");
    var baseSalary = readLine()!!.toDouble()

    print("Qual a porcentagem do seu bônus mensal: ");
    var bonus = readLine()!!.toDouble()

    print("Desconto aplicado no seu salário em R$: ");
    var discount = readLine()!!.toDouble()

    var calc = (bonus / 100 * baseSalary) + baseSalary;

    var netSalary = calc - discount;

    print("Seu salário líquido é de $ $netSalary");

}