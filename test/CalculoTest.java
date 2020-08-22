import junit.framework.*;
import org.junit.Test;
import testeJUnit.Calculo;


public class CalculoTest extends TestCase {
    @Test
    public void testeSoma() {
        float valor1 = 10;
        float valor2 = 5;
        float esperado = 15;

        float resposta = Calculo.executaSoma(valor1,valor2);

        assertEquals(esperado,resposta);

    }
}
