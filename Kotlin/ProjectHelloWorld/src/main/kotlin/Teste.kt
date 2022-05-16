fun main() {
/*
PARA
1- A prefeitura de uma cidade fez uma pesquisa entre 20 dos seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
*/
    var num = 1
    var i: Int = 0
    var salarioArray: FloatArray = floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f)
    var filhoArray: IntArray = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

    while (num<=20) {
        println("Escreva aqui o salário dos habitantes um a um: ")
        salarioArray[num] = readln().toFloat()
        println("Escreva aqui a quantidade de filhos por pessoa individualmente: ")
        filhoArray[num] = readln().toInt()
        num++
    }
}


