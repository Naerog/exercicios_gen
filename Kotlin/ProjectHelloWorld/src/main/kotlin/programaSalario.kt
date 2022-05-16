fun main () {
    // programa salário
    var codigo: Int?; var hTrab: Float?; var salario: Float?; var excesso: Float?; var valorH = 10.0f

    println("Insira o código do trabalhador: ")
    codigo = readln().toInt()
    println("Insira as horas trabalhadas: ")
    hTrab = readln().toFloat()

    if (hTrab > 50) {
        salario = 500f
        excesso = (hTrab - 50) * (valorH * 2)
        salario += excesso
    } else {
        salario = hTrab * valorH
        excesso = 0.0f
    }

    println("--- TABELA DE SALÁRIO DO TRABALHADOR --- \n")
    println("Código trabalhador: $codigo")
    println("Salário           : $salario")
    println("Salário Excedente : $excesso")
}