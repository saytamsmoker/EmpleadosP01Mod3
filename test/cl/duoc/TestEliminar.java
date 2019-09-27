
package cl.duoc;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author saita
 */
public class TestEliminar {

    public TestEliminar() {
    }
 
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String rut="17622907";
        Empleado empleado=new Empleado("17622907", "pedro", 24, 4);
        BussEmpleado instance=new BussEmpleado();
        instance.Crear(empleado);
        boolean esperado=true;  
        boolean obtenido=instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
}
