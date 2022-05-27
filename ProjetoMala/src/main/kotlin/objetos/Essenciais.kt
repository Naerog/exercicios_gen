package objetos

open class Essenciais (){
   private var essencial = listOf<String>("Adoado")
   private var itensCalor = listOf<String>()
   private var itensFrio = listOf<String>()
   var itensBugigangasEs = listOf<String>()
   var itensBugigangasEx = listOf<String>()
   fun listEssencial(){
      for(i in 0 until essencial.size) {
         println(essencial[i])
      }
   }
   open fun itensCalor (itensCalor: MutableList<String>) {
      TODO("Lista dos itens de calor aqui man")
   }
   open fun listItensFrio (itensFrio: MutableList<String>) {
   TODO("Lista dos itens de frio aqui man")
   }
   open fun listItensBugigangas (itensBugigangasEs: MutableList<String>, itensBugigangasEx: MutableList<String>) {
      TODO("Lista de bugigangas essenciais aqui man")
      TODO("Lista de bugigangas extras aqui tbm")
   }