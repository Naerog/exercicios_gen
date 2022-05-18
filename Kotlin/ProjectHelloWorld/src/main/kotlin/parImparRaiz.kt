import kotlin.math.sqrt

fun main() {
    // 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    //número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    //ímpar exiba o número elevado ao quadrado.

    print("Insira um número: ")
    val num1 = readLine()!!.toInt()

    println("\n--- TABELA DE NÚMEROS ---")
    if (num1 % 2 == 0) {
        val raiz = sqrt(num1.toDouble())
        println("O número $num1 é par")
        println("Raiz quadrada: %.2f".format(raiz))
    } else {
        println("O número $num1 é impar")
        println("Elevado ao quadrado: ${num1*num1}")
    }
}