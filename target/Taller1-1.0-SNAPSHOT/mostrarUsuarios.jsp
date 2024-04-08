<%-- 
    Document   : mostrarUsuarios
    Created on : 6/04/2024, 11:51:00 p. m.
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar los usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>

        
        <%
            /*
                se declara una lista de tipo usuarios, en la cual se guarda
                los usuarios que se obtienen de la base de datos 
             */
             
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int i = 1; 

            /* Ciclo para recorrer la lista y mostrara los usuarios */
            for(Usuario usuario : listaUsuarios){

        %>
        
            <h2>Nuermo de Usuario <%= i %> </h2>
            
            <p><strong>Id: <%= usuario.getId()%> </strong></p>
            <p>CC: <%= usuario.getCc()%></p>
            <p>Nombre: <%= usuario.getNombre() %></p>
            <p>Apellido: <%= usuario.getApellido() %></p>
            <p>Telefono: <%= usuario.getTelefono() %></p>
            <br>
            <br>
            <% i++; %>
                
        <% } %>

    </body>
</html>
