package henrancapoli

class Cachorro (nome: String, idade: Int) : Animal(nome, idade){
    override fun som () {
        println("Emitindo som de cachorrinho AUAUAUAUUAUAUAAUAUAUUAAU")
    }
    override fun correr() {
        println("Correndo como um cachorro 1000000000% animadão")
    }
}