<%-- 
    Document   : add
    Created on : 23/06/2022, 04:05:06 AM
    Author     : HP V2
--%>

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
        <div class="container" style="height:50px;width:20vw;">
            <form action="Log">
                <div class="form-group">
                    <label >ID</label>
                    <input  class="form-control" ype="text" name="id_Alumno" placeholder="Ingrese ID">
                <div class="form-group">
                    <label ">Nombre</label>
                    <input  class="form-control" type="text" name="nombre" placeholder="Nombre">
                </div>
                <div class="form-group">
                    <label >Apellido Paterno</label>
                    <input  class="form-control" type="text" name="apeP" placeholder="Apellido Paterno">
                </div>
                <div class="form-group">
                    <label >Apellido Materno</label>
                    <input  class="form-control" type="text" name="apeM" placeholder="Apellido Materno">
                </div>
                <div class="form-group">
                    <label >Matricula</label>
                    <input  class="form-control" type="text" name="matricula" placeholder="Matricula">
                </div>
                <div class="form-group">
                    <label >Contraseña</label>
                    <input  class="form-control" type="text" name="pass" placeholder="Contraseña">
                </div>
                <div class="form-group">
                    <label >Salon</label>
                    <input  class="form-control" type="text" name="salon" placeholder="Salon">
                </div>
                 <div class="form-group">
                    <label >Profesor</label>
                    <input  class="form-control" type="text" name="profesor" placeholder="Profesor">
                 </div>
                  <div class="form-group">
                    <label >Hora</label>
                    <input  class="form-control" type="text" name="hora" placeholder="Hora">
                  </div>
                   <div class="form-group">
                    <label >Dia</label>
                    <input  class="form-control" type="text" name="dia" placeholder="Dia">
                   </div> 
                    <div class="form-group">
                    <label >Materia</label>
                    <input  class="form-control" type="text" name="materia" placeholder="Materia">
                    </div>      
                    <button class="btn btn-primary" name="accion" value="Agregar">Agregar</button>
            </form>
        </div>
    </body>
</html>
