package pookotlin

import org.junit.jupiter.api.Test

internal class CalculadoraTest  {

    @Test
    fun somaTest() {
        kotlin.test.assertEquals(10.0, Calculadora.soma(5.0,5.0))
    }
    @Test
    fun subTest() {
        kotlin.test.assertEquals(0.0, Calculadora.sub(5.0,5.0))
    }
    @Test
    fun multTest() {
        kotlin.test.assertEquals(25.0, Calculadora.mult(5.0,5.0))
    }
    @Test
    fun divTest() {
        kotlin.test.assertEquals(1.0, Calculadora.div(5.0,5.0))
    }
    @Test
    fun raizTest() {
        kotlin.test.assertEquals(2.23606797749979, Calculadora.raiz(5.0))
    }
    @Test
    fun potTest() {
        kotlin.test.assertEquals(3125.0, Calculadora.pot(5.0,5.0))
    }


}