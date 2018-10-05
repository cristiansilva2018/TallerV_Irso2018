<%-- 
    Document   : index
    Created on : 01/09/2018, 23:59:14
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Ingreso de Clientes</h1>
        <form action="controlador" method="POST">
            
            <br>
            Identificacion<input type="text" name="identificacion" value="" />
            <br>
            Nombres: <input type="text" name="nombres" value="" />
            <br>
            Apelido:<input type="text" name="apellido" value="" />
            <br>
            <input type="submit" value="Grabar" />
        </form>
    </body>
</html>
