<%-- 
    Document   : mostrarpersona
    Created on : 19-feb-2021, 11:26:20
    Author     : andre
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.23/js/dataTables.bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap.min.css">
        
        <title>JSP Page</title>
        <script> 
   $(document).ready(function(){
    $('#e').DataTable({  
                         
    "language": {
    "lengthMenu": "Mostrar _MENU_ registros por pagina",
      //"info": "Mostrando pagina _PAGE_ de _PAGES_ / Mostrados: _START_ de _END_ ",
    "sInfo": "Mostrando: _START_ de _END_ - Total registros: _TOTAL_ ",
    "infoEmpty": "No hay registros disponibles",
    "infoFiltered": "(filtrada de _MAX_ registros)",
    "loadingRecords": "Cargando...",
    "processing": "Procesando...",
    "search": "Buscar:",
    "zeroRecords": "No se encontraron registros coincidentes",
    "paginate": {
    "next": "Siguiente",
    "previous": "Anterior"
  }
}
});
});
        </script>



    </head>
    <body>
        <div class="container" style="width: 100%;" >
            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <center><h2>datos del usuario</h2><br>
                            
                            <form >
                                <a href="consulta.htm"><input type="button" value="buscar personas" class="btn btn-light" style="float: right;" /></a>
                               <a href="formjstl.htm"><input type="button" value="inicio" class="btn btn-light"  /></a>
                               <a href="javadoc/index.html"><input type="button" value="documentacion" class="btn btn-light"  /></a>
                                <a href="agegar_cliente.htm"><input type="button" value="agregar personas" class="btn btn-light" style="float: left;" /></a>
                            </form>
                                
                        </center>
                    </div>
                    <div class="panel-body"><center>
                                 <table id="e" class="table table-striped table-bordered" >  
                                    <thead>
                                    
                                    <th><h4> id</h4> </th>
                                    <th><h4> nombre</h4></th>
                                    <th><h4> apellido </h4></th>
                                    <th><h4> edad </h4></th>
                                    <th><h4> correo </h4></th>
                                    <th ><h4> editar </h4></th>
                                    <th><h4> borrar</h4></th>
                                    
                                    </thead>
                                    <tbody>      
                                        <c:forEach var="dato" items="${personabean}" > 
                                        <tr>
                                            <td><c:out value="${dato.id}"></c:out> </td>   
                                            <td><c:out value="${dato.nombre}"></c:out> </td>
                                            <td><c:out value="${dato.apellido}"></c:out> </td>
                                            <td><c:out value="${dato.edad}"></c:out> </td>
                                            <td><c:out value="${dato.correo}"></c:out> </td>
                                            <td><a href="modi_persona.htm?id=${dato.id}"><input type="button" value="modificar" class="btn btn-primary" /></a></td>
                                            <td><a href="bor_persona.htm?id=${dato.id}"><input type="button" value="borrar" class="btn btn-danger" /></a></td>
                                        </tr>
                                        </tbody>
                                        
                                            
                                    </c:forEach>
                            </table>
                                

                  
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
