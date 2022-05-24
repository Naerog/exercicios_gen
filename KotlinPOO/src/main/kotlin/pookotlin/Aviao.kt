package pookotlin

class Aviao (
    var turbina: Int,
    var asas: Int,
    var cor: String,
    var tremPouso: Boolean,
    var modelo: String
){

    var voando = false
    var luzes = false
    var velocidade = 0.0
    var ano = 0

    /*
    Métodos - Voar, Pousar, LigarLuzes
     */

    fun voar(){
        if(voando){
            println("O avião já está no ar")
        }else{
            voando = true
            println("O avião vai voar")
        }
    }

    constructor (
     turbina: Int, asas: Int, cor: String, tremPouso: Boolean, modelo: String, velocidade: Double, ano: Int
            ): this(turbina, asas, cor, tremPouso, modelo){
            this.velocidade = velocidade;
            this.ano = ano
    }
    /*
    if(sla)
     */

    fun infos() {
        println("--- TABELA DE INFORMAÇÕES ---\n")
        println("Modelo do Avião: $modelo")
        println("Ano            : $ano")
        println("Velocidade     : ${velocidade}Km/h\n")
    }

    fun pousar(){
        if(voando){
            voando = false
            println("O avião acabou de pousar")
        }else{
            println("O avião já está no chão")
        }
    }

    fun ligDesligLuzes(){
        if(luzes){
            luzes = false
            println("Luzes estão desligadas")
        }else{
            luzes = true
            println("Luzes estão ligadas")
        }
    }
}

