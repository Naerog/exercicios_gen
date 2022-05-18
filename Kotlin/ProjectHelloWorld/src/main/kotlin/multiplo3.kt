fun main() {
    /* 6- Escrever um programa que receba vários números inteiros no teclado. E no
       final imprimir a média dos números múltiplos de 3. Para sair digitar
       0(zero).(DO...WHILE)
     */
    var num: Int; var media = 0.0; var aux = 0; var i = 0
    do {
        print("Insira um número inteiro: ")
        num = readln().toInt()
        if (num % 3 == 0) {
            aux += num
        }
        i++
        media = (aux/i).toDouble()
    } while (num != 0)
    println("A média dos números múltiplos de 3: %.2f".format(media))
}