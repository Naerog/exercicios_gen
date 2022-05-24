import pookotlin.Cliente2

fun main () {

    while(true){
        print("Digite o seu nome ou 0 para sair: ")
        val nome = readln()
        if(nome == "0") {
            break
        }
        print("Digite seu endereço: ")
        val endereco = readln()
        print("Digite seu telefone: ")
        val telefone = readln()
        try {
            val cliente = Cliente2(nome,endereco, telefone)

            while(true) {
                println("\n--- Menu ---")

                println("1 - Adicionar Compras")
                println("2 - Remover Compras")
                println("3 - Listar Compras")
                println("4 - Sair")

                print("Opção: ")
                val opc = readln().toInt()

                when(opc) {
                    1 -> {print("Digite um item para adicionar no carrinho: ")
                        val compra = readln()
                        cliente.addCompra(compra)
                    }
                    2 -> {print("Digite um item para remover do carrinho: ")
                        val compra = readln()
                        cliente.removeCompra(compra)
                    }
                    3 -> cliente.listCompras()
                    4 -> break

                    else -> println("Valor inválido.")
                }
            }
        } catch(e: Exception) {
            println(e.message)
        }
    }
}