<%-- 
    Document   : home
    Created on : 19-feb-2021, 8:42:48
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
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
            <form:form commandName="personabean">
            <div class="form-group">
            <form:label  path="nombre" >Nombre Usuario </form:label>
            <form:input cssClass="form-control" path="nombre"></form:input>
            <br>
            </div>
            <div class="form-group">
            <form:label  path="apellido" >Aprllido Usuario </form:label>
            <form:input cssClass="form-control" path="apellido"></form:input>
            <br>
            </div>
            <div class="form-group">
            <form:label  path="edad" >Edad Usuario </form:label>
            <form:input cssClass="form-control" path="edad"></form:input>
            <br>
            </div>
            <div class="form-group">
            <form:label  path="correo" >Correo Usuario </form:label>
            <form:input cssClass="form-control" path="correo"></form:input>
            <br>
            </div>
            <form:button  name="enviar">enviar</form:button>
        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
