<%-- 
    Document   : index
    Created on : 27-09-2019, 4:49:57
    Author     : Ropo
--%>

<%@page import="java.util.List"%>
<%@page import="cl.duoc.Empleado"%>
<%@page import="cl.duoc.Logica"%>
<%@page import="cl.duoc.BussEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="card">
                <div class="card-header">
                    <h1>Lista de empleados</h1>
                </div>
                <div class="card-body">
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr class='text-center'>
                                <td>Rut</td>
                                <td>Nombre</td>
                                <td>Edad</td>
                                <td>Antiguedad</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List<Empleado> lista = Logica.Listar();
                                for (Empleado e : lista) {
                                    out.print("<tr>");
                                    out.print("<td>" + e.getRut() + "</td>");
                                    out.print("<td>" + e.getNombre() + "</td>");
                                    out.print("<td class='text-center'>" + e.getEdad() + "</td>");
                                    out.print("<td class='text-center'>" + e.getAntiguedad()+ "</td>");
                                    out.print("</tr>");
                                }
                            %>
                        </tbody>
                    </table>  
                </div>      
            </div>      
        </div>      
    </body>
</html>
