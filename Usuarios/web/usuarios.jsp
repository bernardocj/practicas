<%-- 
    Document   : usuarios
    Created on : 19-sep-2016, 14:54:15
    Author     : jony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Usuarios</title>
    </head>
    <body>
        <form action="UsuarioController" method="post">
            <fieldset>
                
                <div>
                    <label>Id de usuario:</label>
                    <input type="text" name="idUsuario" value="${usuario.idUsuario}"
                           placeholder="idUsuario"
                           readonly="readonly"/>

                </div>
                <div>
                    <label>Login:</label>
                    <input type="text" name="login" value="${usuario.login}"
                           placeholder="Login"/>
                </div>
                <div>
                    <label>Password:</label>
                    <input type="password" name="password" value="${usuario.password}"
                           placeholder="password"/>
                </div>
                <div>

                    <label>Nombre:</label>
                    <input type="text" name="nombre" value="${usuario.nombre}"
                           placeholder="Nombre del usuario"/>
                </div>
                <div>
                    <label>Edad:</label>
                    <input type="text" name="edad" value="${usuario.edad}"
                           placeholder="Edad del usuario"/>
                </div>
                <div>
                    <input type="submit" value="Guardar"/>
                </div>
            </fieldset>

        </form>


    </body>
</html>
