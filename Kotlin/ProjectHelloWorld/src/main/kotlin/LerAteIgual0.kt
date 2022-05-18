fun main(){
    /*5- Crie um programa que leia um número do teclado até que encontre um
         número igual a zero. No final, mostre a soma dos números
         digitados.(DO...WHILE)
     */
    var num: Int; var aux = 0;
    do {
        print("Insira um número: ")
        num = readln().toInt()
        aux += num
    }while (num != 0)
    print("A soma dos números digitados: $aux")
}