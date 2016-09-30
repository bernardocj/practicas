<%-- 
    Document   : lista_alumno
    Created on : 21/09/2016, 10:34:46 AM
    Author     : Bernardo Coronilla Jaramillo bernardocoronillajaramillogmail.com
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Turistas</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                <th>  ID Numero</th>
                <th>-  Identificacion</th>
                <th>-  Nombre</th>
                <th>-  Telefono</th>
                <th>-  Pais</th>
                <th>-  Email</th>
                
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${turista}" var="turista">
                    <tr>
                        <td>${turista.idNumero}</td>
                        <td>${turista.identificacion}</td>
                        <td>${turista.nombre}</td>
                        <td>${turista.telefono}</td>
                        <td>${turista.pais}</td>
                        <td>${turista.email}</td>
                       
                        <td> 
                            <a href="TuristaController?action=cambiar&idNumero=${turista.idNumero}">Cambiar</a> 
                        </td>
                        <td> 
                            <a href="TuristaController?action=borrar&idNumero=${turista.idNumero}">Borrar</a> 
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="TuristaController?action=agregar">Agregar Turista</a>
        </p>
    </body>
</html>
