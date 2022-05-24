class Cliente (
    var nome: String,
    var cpf: String,
    var idade: Int,
    var genero: String,
    var numero: String
    ) {
    var gostos = ""
    var altura = 0.0

    fun infosCliente () {
        println("--- TABELA DE INFORMAÇÕES ---\n")
        println("Nome  : $nome")
        println("Idade : $idade")
        println("Gênero: $genero")
        println("CPF   : $cpf")
        println("Número: $numero")
        if (altura == 0.0) {
            println("Altura: Desconhecida")
        } else {
            println("Altura: $altura")
        }
        if(gostos == "") {
            println("Gostos: Desconhecido\n")
        } else {
            println("Gostos: $gostos\n")
        }
    }
    constructor (nome: String,
                cpf: String,
                idade: Int,
                genero: String,
                numero: String, gostos: String, altura: Double): this(nome, cpf, idade, genero, numero) {
                    this.altura = altura;
                    this.gostos = gostos
                }
}
