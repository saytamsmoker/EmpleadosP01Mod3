package cl.duoc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BussEmpleado {

    public List<Empleado> Listar() {
        List<Empleado> lista = new ArrayList<>();
        try {
            Conectar db = new Conectar();
            Connection conn = db.conectarMySQL();
            String sql = "SELECT * FROM empleado";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            Empleado obj;
            while (rs.next()) {
                obj = new Empleado();
                obj.setRut(rs.getString("rut"));
                obj.setNombre(rs.getString("nombre"));
                obj.setEdad(rs.getInt("edad"));
                obj.setAntiguedad(rs.getInt("antiguedad"));
                lista.add(obj);
            }
        } catch (SQLException exe) {
            System.out.println(exe.getMessage());
        }
        return lista;
    }

    public Empleado Buscar(String rut) {
        Empleado obj = new Empleado();
        try {
            Conectar db = new Conectar();
            Connection conn = db.conectarMySQL();
            String sql = "SELECT * FROM empleado WHERE rut = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, rut);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                obj.setRut(rs.getString("rut"));
                obj.setNombre(rs.getString("nombre"));
                obj.setEdad(rs.getInt("edad"));
                obj.setAntiguedad(rs.getInt("antiguedad"));
            }
        } catch (SQLException exe) {
            System.out.println(exe.getMessage());
        }
        return obj;
    }

    public boolean Crear(Empleado obj) {
        boolean std = false;
        try {
            Conectar db = new Conectar();
            Connection conn = db.conectarMySQL();
            String sql = "INSERT INTO empleado (rut, nombre, edad, antiguedad) values(?, ?, ?, ?) ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getRut());
            pstm.setString(2, obj.getNombre());
            pstm.setInt(3, obj.getEdad());
            pstm.setInt(4, obj.getAntiguedad());
            pstm.executeUpdate();
            std = true;
        } catch (SQLException exe) {
            System.out.println(exe.getMessage());
        }
        return std;
    }

    public boolean Modificar(Empleado obj) {
        boolean std = false;
        try {
            Conectar db = new Conectar();
            Connection conn = db.conectarMySQL();
            String sql = "UPDATE empleado SET "
                    + "nombre = ?, "
                    + "edad = ?, "
                    + "antiguedad = ? "
                    + "WHERE rut = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getNombre());
            pstm.setInt(2, obj.getEdad());
            pstm.setInt(3, obj.getEdad());
            pstm.setString(4, obj.getRut());
            pstm.executeUpdate();
            std = true;
        } catch (SQLException exe) {
            System.out.println(exe.getMessage());
        }
        return std;
    }

    public boolean Eliminar(String rut) {
        boolean std = false;
        try {
            Conectar db = new Conectar();
            Connection conn = db.conectarMySQL();
            String sql = "DELETE FROM empleado WHERE rut = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, rut);
            pstm.executeUpdate();
            std = true;
        } catch (SQLException exe) {
            System.out.println(exe.getMessage());
        }
        return std;
    }

}
