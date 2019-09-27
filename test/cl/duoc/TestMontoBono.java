
package cl.duoc;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestMontoBono {

    public TestMontoBono() {
    }
    
    @Test
    public void testBuscar(){
        System.out.println("BonoMonto");
        Empleado empleado=new Empleado("11111111", "Joaquina", 36, 3);
        int esperado = 0;
        int obtenido = empleado.montoBono();
        Assert.assertEquals(esperado, obtenido);
    }
}
