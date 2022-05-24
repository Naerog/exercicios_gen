package pookotlin

class Cliente2 (private var nome: String) {

    private var endereco = ""
    private var telefone = ""

    private var listaCompras = mutableListOf<String>()


    init {
        if (nome == "") {
                throw Exception("Nome inválido!")
        }
    }

    // construtores

    constructor(nome: String, endereco: String): this(nome) {
        this.endereco = endereco
    }
    constructor(nome: String, endereco: String, telefone: String):
            this(nome, endereco) {
        this.telefone = telefone
    }


    fun addCompra(compra: String) {
        if(compra != ""){
            listaCompras.add(compra)
            println("\nItem adicionado!")
        } else {
            println("\n Item não pode ser vazio.")
        }
    }

    fun removeCompra(compra: String) {
        if(listaCompras.contains(compra)){
            listaCompras.remove(compra)
            println("\nItem removido!")
        } else {
            println("\nEsse item não existe na lista.")
        }
    }

    fun listCompras() {
        println("--- LISTA DE COMPRAS ---\n")
        listaCompras.forEach{
            println(it)
        }
        println()
    }
}