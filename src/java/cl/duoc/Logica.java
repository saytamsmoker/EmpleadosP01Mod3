
package cl.duoc;

import java.util.List;

public class Logica {
    
    public static List<Empleado> Listar() {
        BussEmpleado obj=new BussEmpleado();
        return obj.Listar();
    }
    
}
