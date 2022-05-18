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
    if (num1 <= num2 && num2 <= num3) {
        println("A ordem crescente é:  $num1, $num2, $num3")
    } else if (num1 <= num3 && num3 <= num2) {
        println("A ordem crescente é:  $num1, $num3, $num2")
    } else if (num2 <= num1 && num1 <= num3) {
        println("A ordem crescente é: $num2, $num1, $num3")
    } else if (num2 <= num3 && num3 <= num1) {
        println("A ordem crescente é: $num2, $num3, $num1")
    } else if (num3 <= num1 && num1 <= num2) {
        println("A ordem crescente é: $num3, $num1, $num2")
    } else {
        println("A ordem crescente é: $num3, $num2, $num1")
    }
}

/*
// forma de fazer do Elisson
fun main(){

    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
     */

    print("Entre com o primeiro número:")
    val n1 = readln().toInt()
    print("Entre com o segundo número:")
    val n2 = readln().toInt()
    print("Entre com o terceiro número:")
    val n3 = readln().toInt()

    val listanum = listOf(n1, n2, n3)

    val ordcre = listanum.sorted()
    val orddec = listanum.sortedDescending()

        println("Os números em ordem crescente são: $ordcre")
        println("Os números em ordem decrescente são: $orddec")
 */