import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoreTest{

    @Test
    fun somaTest(){
        assertEquals(4, Calculadore.soma(2,2))


    }
    @Test
    fun subTest(){
        assertEquals(2,Calculadore.subtração(4,2))
    }
    @Test
    fun multiTest(){
        assertEquals(16, Calculadore.multiplicação(4, 4))
    }
    @Test
    fun diviTest(){
        assertEquals(2.0, Calculadore.divisão(4.0,2.0))
    }
    @Test
    fun pctmTest(){
        assertEquals(50, Calculadore.porcentagem(50,100))
    }
    @Test
    fun potenTest(){
        assertEquals(25.0,Calculadore.potência(5.0,2.0))
    }

}