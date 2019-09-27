
package cl.duoc;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author saita
 */
public class TestCrear {

    public TestCrear() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Empleado empleado=new Empleado("17622907", "pedro", 24, 4);
        BussEmpleado instance=new BussEmpleado();
        boolean esperado=true;
        boolean obtenido=instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
