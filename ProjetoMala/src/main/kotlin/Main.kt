import objetos.Essenciais
import objetos.Bugigangas
import objetos.Frio
import objetos.Quente

fun main() {
/*
 Classes, Atributos e Objetos;
 Encapsulamento e Herança;
 */
    val itensEssencial = Essenciais()
    println("--- ORGANIZAÇÃO DE MALAS ---\n")
    while (true) {
        print("Digite seu nome: ")
        val nome = readln()
        print("Digite quantos dias de viagem: ")
        val dias = readln().toInt()
        print("Digite o clima: (Quente/Frio) ")
        val clima = readln()
        when (dias) {
            1 -> {
                itensEssencial.listEssencial(itens)
                when (clima) {
                    "Quente" -> {
                        println("Adicione estes itens: ")
                    }
                    "Frio" -> {

                    }
                    else -> {
                        println("CLIMA INVÁLIDO")
                    }
                }
            }
        }
    }
}



