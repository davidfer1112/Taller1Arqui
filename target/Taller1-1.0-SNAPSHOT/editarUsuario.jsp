
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>

        <% Usuario usu =  (Usuario) request.getSession().getAttribute("usuEditar"); %>
        <h1>Datos del Usuario</h1>
        <form action="SvEditar" method="POST">
            <p><label>CC: </label><input type="text" name="CC" value="<%= usu.getCc() %>"></p>
            <p><label>Nombre: </label><input type="text" name="nombre" value="<%= usu.getNombre() %>"></p>
            <p><label>Apellido: </label><input type="text" name="apellido" value="<%= usu.getApellido() %>"></p>
            <p><label>Telefono: </label><input type="text" name="telefono" value="<%= usu.getTelefono() %>"></p>
            <button type="submit">Guardar datos</button>
        </form>

    </body>
</html>
