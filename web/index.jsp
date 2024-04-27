<%-- 
    Document   : login
    Created on : 22/06/2022, 01:17:42 AM
    Author     : HP V2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.Connection"%>
<%@page import = "java.sql.SQLException"%>
<%@page import = "java.sql.DriverManager"%>
<%@page import="SQL.conect"%>
<%@page import="SQL.Consulta"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
      <body>
          <%
          conect conex = new conect();
          Connection con = conex.getCon();
          %>
        <div class="container"> 
            <div class="row"> 
                <div class="col-md-6"> 
                    <div class="card"> 
                        <form class="box" method="POST" action="Log"> 
                            <h1>Login</h1> 
                            <p class="text-muted"> Porfavor Ingrese Los Datos!</p> 
                            <select name="Rol" class="sele">
                                <option class="opt">Alumno</option>
                                 <option  class="opt">Administrador</option>
                            </select>
                            <input type="text" name="user" placeholder="Username"> 
                            <input type="password" name="pass" placeholder="Password"> 
                            <p>${error}</p>
                            <input type="submit" name="" value="Login" href="#">  
                        </form> 
                    </div> 
                </div> 
            </div>
        </div>
    </body>
</html>
