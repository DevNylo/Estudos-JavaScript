/*Implementar um programa em Java que verifique se o volume de um cilindro poderia
ser transferido para outro cilindro. O volume do cilindro pode ser calculado pela
fórmula: V = π . r2 . h. O programa deve receber o diâmetro e a altura dos dois
cilindros.*/

println("PRIMEIRO CILINDRO")

print("Digite o valor do RAIO ")
var firRad = readLine()!!.toDouble()

print("Digite o valor da ALTURA ")
var firHeight = readLine()!!.toDouble()

println("------------------------------")

println("SEGUNDO CILINDRO")

print("Digite o valor do RAIO ")
var secRad = readLine()!!.toDouble()

print("Digite o valor da ALTURA ")
var secHeight = readLine()!!.toDouble()

var calcRad1 = firRad / 2
var calcRad2 = secRad / 2
var firCylinder = PI * calcRad1 * calcRad1 * firHeight
var secCylinder = PI * calcRad2 * calcRad2 * secHeight
var result = firCylinder <= secCylinder

println("O primeiro CILINDRO tem VOLUME $firCylinder cm³")
println("O segundo CILINDRO tem VOLUME $secCylinder cm³")
print("É possível transferir o primeiro para o segundo? $result")
