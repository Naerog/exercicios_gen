fun main (){
    /*
    2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */

    val aviao = Aviao(
        2,
        2,
        "Vermelho",
        true,
        "Gol"
    )
    aviao.velocidade = 240.0
    aviao.ano = 2008
    val aviao2 = Aviao(
        2,
        2,
        "Preto",
        true,
        "Latam"
    )
    aviao2.velocidade = 300.0
    aviao2.ano = 2014
    aviao.infos()
    aviao2.infos()

    aviao.ligDesligLuzes()

    aviao.voar()

    aviao.pousar()

    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
}