fun main() {
    // Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
    print("Insira a idade: ")
    val idade = readLine()!!.toInt()

    when (idade) {
       in 10.. 14 -> println("Infantil")
       in 15 .. 17 -> println("Juvenil")
       in 18 .. 25 -> println("Adulto")
    }

}