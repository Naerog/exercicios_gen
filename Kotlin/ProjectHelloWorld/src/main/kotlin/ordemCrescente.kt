fun main () {
    //2- programa que entra com 3 números e coloca em ordem crescente
        // 1- programa que diz qual maior numero
        println("Primeiro número: ")
        val num1 = readLine()!!.toInt()
        println("Segundo número: ")
        val num2 = readLine()!!.toInt()
        println("Terceiro número: ")
        val num3 = readLine()!!.toInt()
    // 6 possibilidades
    if (num1 < num2 && num2 < num3) {
        println("A ordem crescente é:  $num1, $num2, $num3")
    } else if (num1 < num3 && num3 < num2) {
        println("A ordem crescente é:  $num1, $num3, $num2")
    } else if (num2 < num1 && num1 < num3) {
        println("A ordem crescente é: $num2, $num1, $num3")
    } else if (num2 < num3 && num3 < num1) {
        println("A ordem crescente é: $num2, $num3, $num1")
    } else if (num3 < num1 && num1 < num2) {
        println("A ordem crescente é: $num3, $num1, $num2")
    } else {
        println("A ordem crescente é: $num3, $num2, $num1")
    }
}