fun main() {
    println("Digite o valor do circulo:")
    var diametro = readln().toDouble()
    val raio = diametro/2
    val pi = 3.14
    val area = pi*(raio*raio)
    val perimetro = 2*3.14*raio
    println("Área     : $area")
    println("Perimetro: %.2f".format(perimetro))
}