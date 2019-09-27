
package cl.duoc;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestBuscar {

    public TestBuscar() {
    }
    
    @Test
    public void testBuscar(){
        System.out.println("Buscar");
        String rut="11111111";
        Empleado empleado=new Empleado("11111111", "Joaquina", 36, 3);
        BussEmpleado instance=new BussEmpleado(); 
        Empleado obtenido=instance.Buscar(rut);
        Assert.assertEquals(empleado.getRut(), obtenido.getRut());
    }
}
