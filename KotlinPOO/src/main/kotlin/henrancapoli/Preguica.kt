package henrancapoli

class Preguica (nome: String, idade: Int) : Animal(nome, idade) {
    override fun som () {
        println("Emitindo som de preguiça: *Insira um som de preguiça aqui*")
    }
    override fun correr() {
        println("Correndo(?) como uma preguiça de forma bem preguiçosa (?)")
    }
}