fun main () {
    println("--- PROGRAMA DE ESTOQUE ---\n")
    val produtos = mutableListOf<String>()
    while(true) {
        println("Oque você deseja fazer? 1. Inserir itens, 2. Remover itens, 3. Editar itens, 4. Listar os itens, 5. Sair")
        when(readln().toInt()) {
            1 -> inserirItem(produtos)
            2 ->{if (produtos.size == 0){
                println("Ainda não existem itens no estoque para serem removidos.\n")
            }else {
                removerItem(produtos)
            }}
            3 ->{if (produtos.size == 0){
                println("Ainda não existem itens no estoque para serem editados.\n")
            } else {
                editEstoque(produtos)
            }}
            4 ->{if (produtos.size == 0){
                println("Ainda não existem itens no estoque para serem listados.\n")
            }else {
                listEstoque(produtos)
            }}
            5 -> break
        }
    }
}
fun inserirItem (produtos: MutableList<String>) {
    while (true) {
        println("Digite os itens para serem adicionados ao estoque ou aperte Enter para voltar ao menu: ")
        val item = readln()
        if (item == "") {
            break
        } else {
            produtos.add(item)
        }
    }
}
fun removerItem (produtos: MutableList<String>) {
    while (true) {
        listEstoque(produtos)
        println("Digite o número do item que será retirado do estoque ou aperte 0 para voltar ao menu:")
        val num = readln().toInt()
        val aux = num - 1
        produtos.removeAt(aux)
        println("O item foi removido com sucesso!\n")
        if (aux == -1){
            break
        } else if (produtos.size == 0){
            println("Não existem mais itens no estoque.\n")
            break
        }
    }
}
fun editEstoque (produtos: MutableList<String>) {
    while (true) {
        listEstoque(produtos)
        println("Digite o número do item que será editado ou aperte 0 para voltar ao menu:")
        val num = readln().toInt()
        val aux = num - 1
        if (aux == -1){
            break
        } else {
            println("Digite o novo nome do Item")
            val nome = readln()
            produtos[aux] = nome
            println("O item foi editado com sucesso!\n")
        }
    }
}
fun listEstoque (produtos: MutableList<String>) {
    println("--- ESTOQUE ---")
    for (i in 0 until produtos.size) println("${i+1}- Item: ${produtos[i]}")
}
