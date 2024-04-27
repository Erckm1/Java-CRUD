<%-- 
    Document   : Aministrador
    Created on : 23/06/2022, 12:17:04 AM
    Author     : HP V2
--%>

<%@page import = "java.util.List"%>
<%@page import = "Modelo.Alumno"%>
<%@page import = "java.util.Iterator"%>
<%@page import = "ModeloDAO.AlumnoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <a href="Log?accion=add">Agregar Nuevo</a>
            <table class="table">
                <thead class="thead-dark">
                    <tr color="blue">
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th>Matricula</th>
                         <th>Contraseña</th>
                        <th>Salon</th>
                        <th>Profesor</th>
                        <th>Hora</th>
                        <th>Dia</th>
                        <th>Materia</th>
                    </tr>
                </thead>
                <%
                    AlumnoDAO dao=new AlumnoDAO();
                    List<Alumno>list=dao.listar();
                    Iterator<Alumno>iter=list.iterator();
                    Alumno al=null;
                    while(iter.hasNext()){
                    al=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td><%=al.getId_Alumno()%></td>
                        <td><%=al.getNombre()%></td>
                        <td><%=al.getApellidoP()%></td>
                        <td><%=al.getApellidoM()%></td>
                        <td><%=al.getMatricula()%></td>
                        <td><%=al.getPass()%></td>
                        <td><%=al.getSalon()%></td>
                        <td><%=al.getProfesor()%></td>
                        <td><%=al.getHora()%></td>
                        <td><%=al.getDia()%></td>
                        <td><%=al.getMateria()%></td>
                        <td>
                            <a href="Log?accion=editar&id=<%=al.getId_Alumno()%>">Editar</a>
                            <a href="Log?accion=eliminar&id=<%=al.getId_Alumno()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
    </body>
</html>

