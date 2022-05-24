fun main () {
    var num = listOf(10,3,5,7,9)
    var maior = 0
    var menor = 0
    for(i in num.indices) {
        if (num[i] > maior) {
            maior = num[i]
        }
        if (num[i] < menor || menor == 0) {
            menor = num[i]
        }
    }
        println("Maior número é $maior")
        println("Menor número é $menor")
}