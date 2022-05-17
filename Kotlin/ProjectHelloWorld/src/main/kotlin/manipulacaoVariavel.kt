fun main () {
        println("Entre com o nome:")
        val nome = readLine()!!
        pegarLetra(nome)
}

fun pegarLetra (nome: String){
    val letra = nome[0]
    return if(letra.equals('A', true) || letra.equals('a', true)) {
        println(letra)
    } else {
        println("Não começa com A/a parça")
    }
}
