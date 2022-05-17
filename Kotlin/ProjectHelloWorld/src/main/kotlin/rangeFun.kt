
fun main () {
    println("Insira aq o range escolhido")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    if (a < b) {
        (a..b).forEach(::println)
    }else if (b < a) {
        (a downTo b).forEach(::println)
    }
}

