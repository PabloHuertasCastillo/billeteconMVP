<%-- 
    Document   : recibeDatos
    Created on : 22 ene. 2021, 21:34:56
    Author     : Pablo
--%>

<%@page import="modelo.Billete"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% Billete billete = (Billete) request.getAttribute("billete"); %>
        <h3>El importe de los billetes con IVA: <%= billete.getImporte() %> €</h3>
        <h3>El importe de los billetes sin IVA: <%= Math.round(billete.getImporte() / 1.21) %> €</h3>
        <h3>Número de billetes: <%= billete.getCantidad() %></h3>
        <h3>Fecha del vuelo: <%= billete.getFechaVuelo() %></h3>
    </body>
</html>
