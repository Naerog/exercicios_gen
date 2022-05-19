fun main () {
    var num1 = 0; var num2 = 0
    print("Insira o primeiro número: ")
    num1 = readLine()!!.toInt()
    print("Insira o segundo número: ")
    num2 = readLine()!!.toInt()
    println("Escolha a operação (1. Soma, 2. Subtração, 3. Multiplicação, 4. Divisão, 5. Todas")
    var operacao = readLine()?.toInt()
    when (operacao){
        1 -> mais(num1, num2)
        2 -> menos(num1, num2)
        3 -> multiplicacao(num1, num2)
        4 -> divisao(num1, num2)
        5 -> {
            println("\n--- TABELA DE RESULTADOS ---")
            mais(num1,num2)
            menos(num1, num2)
            multiplicacao(num1, num2)
            divisao(num1, num2)
        }
    }

}
fun menos (num1: Int, num2: Int) {
    return println("A subtração destes números é    : ${num1-num2}")
}
fun mais(num1: Int, num2: Int) {
    return println("A soma destes números é         : ${num1+num2}")
}
fun multiplicacao (num1: Int, num2: Int) {
    return println("A multiplicacao destes números é: ${num1*num2}")
}
fun divisao (num1: Int, num2: Int) {
    return println("A divisao destes números é      : ${(num1/num2).toDouble()}")
}