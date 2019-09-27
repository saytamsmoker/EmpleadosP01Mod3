
package cl.duoc;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado empleado=new Empleado("17622907", "pedro", 24, 4);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(empleado);
        boolean esperado = true;
        empleado = new Empleado("17622907", "pedro", 24, 5);
        boolean obtenido = instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
