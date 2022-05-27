import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FuncionalidadesTest {

    @Test
    fun qntddParteCima() {
        assertEquals(2, Funcionalidades.qntddParteCima(2))
    }

    @Test
    fun qntddParteBaixo() {
        assertEquals(2, Funcionalidades.qntddParteBaixo(2))
    }

    @Test
    fun qntddRoupasInt() {
        assertEquals(4, Funcionalidades.qntddRoupasInt(2))
    }
}