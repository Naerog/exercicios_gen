fun main () {
    /* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
        21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
        idade for =-99. (WHILE)
     */
    var idade = 0;var aux21= 0 ;var aux50 = 0

    while (idade != -99){
        print("Insira sua idade: ")
        idade = readln().toInt()

        if (idade < 21) {
            aux21++
        } else if (idade > 50) {
            aux50++
        }
    }
    println("\nTotal de pessoas com menos de 21 anos: $aux21")
    println("Total de pessoas com mais de 50 anos : $aux50")
}