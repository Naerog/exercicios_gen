import henrancapoli.Cachorro
import henrancapoli.Cavalo
import henrancapoli.Preguica

fun main () {
    val cavalo = Cavalo(
        "Cavalinho",
        8,
    )
    println("Nome : ${cavalo.nome}")
    println("Idade: ${cavalo.idade}")
    cavalo.correr()
    cavalo.som()
    val cachorro = Cachorro(
        "Cachorrinho",
        3,
    )
    println()
    println("Nome : ${cachorro.nome}")
    println("Idade: ${cachorro.idade}")
    cachorro.correr()
    cachorro.som()
    val preguica = Preguica(
        "Preguicinha",
        5,
    )
    println()
    println("Nome : ${preguica.nome}")
    println("Idade: ${preguica.idade}")
    preguica.correr()
    preguica.som()
}