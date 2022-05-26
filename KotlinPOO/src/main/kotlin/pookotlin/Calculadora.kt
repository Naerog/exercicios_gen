package pookotlin

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    companion object {
        var n1 = 0.0
        var n2 = 0.0

        fun soma(n1: Double, n2: Double): Double {
            println("\n-- Soma --")
            println(n1+n2)
            return n1+n2
        }
        fun sub(n1: Double, n2: Double): Double {
            println("\n-- Subtração --")
            println(n1-n2)
            return n1-n2
        }
        fun mult(n1: Double, n2: Double): Double {
            println("\n-- Multiplicação --")
            println(n1*n2)
            return n1*n2
        }
        fun div(n1: Double, n2: Double): Double {
            println("\n-- Divisão --")
            println(n1/n2)
            return n1/n2
        }
        fun raiz(n1: Double): Double {
            println("\n-- Raiz --")
            println(sqrt(n1))
            return sqrt(n1)
        }
        fun pot(n1: Double, n2: Double): Double {
            println("\n-- Potência --")
            println(n1.pow(n2))
            return n1.pow(n2)
        }
    }
}