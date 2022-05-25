package henrancapoli

class Cavalo (nome: String, idade: Int) : Animal(nome, idade){
    override fun som () {
        println("Emitindo som de cavalo: IIIIIIROOOOOOOOOOOOOOOOOOOOOOOONC")
    }
    override fun correr() {
        println("Correndo como um cavalo galopando uiuiui poct poct poct po")
    }
}