import java.util.Scanner

fun main() {

    var nome = ""; var idade = 0; var altura = 0.0f; var peso = 0.0f
    var imc = 0.0f
    val reader = Scanner(System.`in`)
    println("--- PROGRAMA DE CALCULO DO IMC ---\n")
    println("Escreva seu nome:")
    nome = readLine()!!
    println("Escreva sua idade: ")
    idade = reader.nextInt()
    println("Escreva seu peso: ")
    peso = reader.nextFloat()
    println("Escreva sua altura: ")
    altura = reader.nextFloat()
    imc = peso/(altura*altura)
    println("--- TABELA IMC ---\n")
    println("Nome  : $nome")
    println("Idade : $idade")
    println("Peso  : $peso")
    println("Altura: $altura")
    println("IMC:  %.2f ".format(imc))


    if(imc<=18.4){
        println("Você está abaixo do peso")

    }else if(imc <=24.9){
        println("Você está com o peso normal")

    }else if (imc <=29.9){
        println("Você está com sobrepeso")

    }else if (imc <=34.9){
        println("Você está com obesidade (Grau 1)")

    }else if (imc <=39.9){
        println("Você está com obesidade severa (Grau 2)")

    }else if (imc >=40){
        println("Você esta com obesidade mórbida (Grau 3)")

    }

}
