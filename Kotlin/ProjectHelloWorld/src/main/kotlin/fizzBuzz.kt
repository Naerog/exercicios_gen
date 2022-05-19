fun main () {
    for (num in 1..100) {
        fizzBuzz(num)
    }
}

fun fizzBuzz (num: Int) {
    if(num % 3 == 0 && num % 5 == 0) return println("FizzBuzz")
    if(num % 3 == 0) return println("Fizz")
    if(num % 5 == 0) return println("Buzz")
    return println(num)
}
