fun main() {
    var n: String
    var soma = 0.0
    var aux = 0.0
    var media = 0.0
    var check: String

    do {
            println("Entre com um numero:")
            n = readLine()!!
            check = n
        if (isNumber(check) || isNumberNegative(check)) {
                    if (n.toDouble() >= 0 && isNumberNegative(check)) {
                        soma += n.toDouble()  // Faz a soma
                        aux++      // Calcula o numero de termos
                    } else if (n.toDouble() <= 0 && !isNumberNegative(check)){
                        soma++              // insere 1.0
                        aux--               // tira 1.0
                    }
            media = soma / aux  // Faz os calculos excluindo o valor -1 inserido
            }
        } while (isNumber(n) || isNumberNegative(check))

    // Arrumando calculos não considerando o -1


    println("Soma: $soma")
    println("Media: $media")
    println("Numero de termos: $aux")
}

fun isNumber (check: String): Boolean {
    return check.all { char -> char.isDigit()}
}

fun isNumberNegative (check: String): Boolean {
    return check.matches("-?\\d+(\\.\\d+)?".toRegex())
}