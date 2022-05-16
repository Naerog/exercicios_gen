fun main () {
    // Programa dos tomatinhos
    var peso: Float?; var excesso: Float?; var multa: Float?

    println("Insira o peso dos tomates: ")
    peso = readln().toFloat()
    if (peso > 50) {
        excesso = peso - 50
        multa = excesso * 4
        println("Houve excesso de: $peso Kgs")
        println("Multa: R$%.2f".format(multa))
    } else {
        println("Não houve excesso.")
    }

}