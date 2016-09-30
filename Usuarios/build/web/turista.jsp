<%-- 
    Document   : Alumno
    Created on : 21/09/2016, 10:34:16 AM
    Author     : bernardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Turista</title>
    </head>
    <body>
        <form action="TuristaController" method="post">
            <fieldset> 
                <legend> Registro de Turista </legend>
                <div>
                    <label for="idNumero">ID Numero: </label>
                    <input type="text" name="idNumero" value="${turista.idNumero}" placeholder="ID Numero"  readonly="readonly">
                </div>
                <div>
                    <label for="identificacion">Identificacion: </label>
                    <input type="text" name="identificacion" value="${turista.identificacion}" placeholder="Identificacion" >
                </div>
                <div>
                    <label for="nombre">Nombre: </label>
                    <input type="text" name="nombre" value="${turista.nombre}" placeholder="Nombre" >
                </div>
                <div>
                    <label for="telefono">Telefono: </label>
                    <input type="text" name="telefono" value="${turista.telefono}" placeholder="Telefono" >
                </div>
                <div>
                    <label for="pais">Pais: </label>
                    <input type="text" name="pais" value="${turista.pais}" placeholder="Pais" >
                </div>
                <div>
                    <label for="email">Email: </label>
                    <input type="text" name="email" value="${turista.email}" placeholder="Email" >
                </div>
                
                
                <div>
                    <input type="submit" value="guardar">
                </div>
            </fieldset>
        </form>
    </body>
</html>
