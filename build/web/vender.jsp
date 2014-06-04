<%-- 
    Document   : vender
    Created on : 3/06/2014, 09:25:45 AM
    Author     : Chema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nota de Venta</title>
    </head>
    <body>
        <jsp:include page="menuVenta"/>
        
        <h2>Datos del comprador</h2>
    <center>
        <table with = "50%">
            <form action="SeleccionProd" method="post"/>
            
            <tr>
                <td colspan="2">Datos del producto</td>
            </tr>
            <tr>
                <td>Id_Prod:</td>
                <td><input type="number" name="cliente"></td>
            </tr>
            <tr>
                <td>Descripcion</td>
                <td><input type="text" name="descripcion"></td>
            </tr>
            <tr>
                <td>Existencia</td>
                <td> <input type="number" name="cantidad"> </td>
            </tr>
            <tr>
                <td>Precio</td>
                <td> <input type="number" name="precio"> </td>
            </tr>
            <tr>
                <td><input type="submit" name="aceptar" title="Aceptar"></td>
            </tr>
            
        </table>
    </center>
        
    </body>
</html>
