fun main() {
    // 1- programa que diz qual maior numero
    println("Primeiro número: ")
    val a = readLine()!!.toInt()
    println("Segundo número: ")
    val b = readLine()!!.toInt()
    println("Terceiro número: ")
    val c = readLine()!!.toInt()

    if (a > b && a > c) {
        print("Maior é o primeiro número: $a")
    } else if (b > a && b > c) {
        print("Maior é o segundo número: $b")
    } else if (c > a && c > b) {
        print("Maior é o terceiro número: $c")
    }
}