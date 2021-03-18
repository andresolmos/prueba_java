<%-- 
    Document   : home
    Created on : 19-feb-2021, 8:42:48
    Author     : andre
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" >
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <div class="row">
            <form action="" method="post" >

                        <label  >Digite su Nombre </label>
                        <input type="text" name="nombre" Class="form-control"
                               value='<c:out value="${personabean[0].nombre}"></c:out>  ' />
                        <br>
                        <br>
                        <label  >Digite su apellido </label>
                        <input type="text" name="apellido" Class="form-control" 
                               value='<c:out value="${personabean[0].apellido}"></c:out>' />
                        <br><br>
                        <label name="correo" >Digite su edad </label>
                        <input type="text" name="edad" Class="form-control"
                               value="<c:out value='${personabean[0].edad}'></c:out>" />
                        <br><br>
                        <label name="telefono" >Digite su correo </label>
                        <input type="text" name="correo" Class="form-control"
                               value="<c:out value='${personabean[0].correo}'></c:out>" />
                        <br><br>

                        <input type="submit" name="btnEnviar" value="Actualizar datos" class="btn btn-primary btn-md" />
            </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
