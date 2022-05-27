package pookotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
internal class CalculadoraTest  {
    @Test
    fun somaTest() = assertEquals(10.0, Calculadora.soma(5.0,5.0))
    @Test
    fun subTest() = assertEquals(0.0, Calculadora.sub(5.0,5.0))
    @Test
    fun multTest() = assertEquals(25.0, Calculadora.mult(5.0,5.0))
    @Test
    fun divTest() = assertEquals(1.0, Calculadora.div(5.0,5.0))
    @Test
    fun raizTest() = assertEquals(2.23606797749979, Calculadora.raiz(5.0))
    @Test
    fun potTest() = assertEquals(3125.0, Calculadora.pot(5.0,5.0))
}