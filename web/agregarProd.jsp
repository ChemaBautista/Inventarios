<%-- 
    Document   : agregarProd
    Created on : 29/05/2014, 09:24:40 AM
    Author     : Chema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <jsp:include page="menuProducto.jsp"/>
    <h3>Agregar Producto</h3>
    <center>
        <table with ="50%">
            <form action="AgregarProd" method="post"/>
            
            <tr>
                <td colspan="2">Datos del producto</td>
            </tr>
            <tr>
                <td>Id_Prod:</td>
                <td><input type="number" name="idProd"></td>
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