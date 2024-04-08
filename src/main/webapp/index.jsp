<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario</h1>
        
        <!-- 
            llama al metodo Post del servlet usuario
            para enviarle la informacion del formulario
         -->
        <form action="SvUsuarios" method="POST">
            <p><label>CC: </label><input type="text" name="CC"></p>
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>


        <!-- 
            Llama el metodo Get del servlet usuario
            para redirigir a la pagina de mostrarUsuarios.jsp
         -->
        <h1>Usuarios guardados</h1>
        <form action="SvUsuarios" method="GET">
            <button type="submit">Ver Usuarios</button>
        </form>
        
        <h1>Usuario para elimiar</h1>
        <p>Ingresar el id para eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label><input type="text" name="id_usuario" required></p>
            <button type="submit">Eliminar Usuario</button>
        </form>
        

        <h1>Usuario para editar</h1>
        <p>Ingresar el id para editar</p>
        <form action="SvEditar" method="GET">
            <p><label>Id: </label><input type="text" name="id_usuarioEdit" required></p>
            <button type="submit">Editar</button>
        </form>

    </body>
</html>
