fun main() {
    println("Digite o valor do circulo:")
    var diametro = readln().toDouble()
    val raio = diametro/2
    val area = 3.14*(raio*raio)
    val perimetro = 2*3.14*raio
    println("O valor da área é: $area e o perimetro $perimetro")
}