package henrancapoli

open class Animal (var nome: String, var idade: Int){
    open fun som() {
        println("Emitindo som")
    }
    open fun correr() {
        println("Correndo")
    }
}