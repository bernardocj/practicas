/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.TuristaDAOImp;

import model.Turista;
import dao.TuristaDAO;

/**
 *
 * @author Bernardo
 */

public class TuristaController extends HttpServlet {

    private  final String LISTA_ALUMNO = "/lista_turista.jsp";
    private  final String AGREGAR_CAMBIAR = "/turista.jsp";
    private TuristaDAO dao;

    public TuristaController() {
        dao = new TuristaDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_ALUMNO;
            int idNumero = Integer.parseInt(request.getParameter("idNumero"));
            dao.borrarTurista(idNumero);
            request.setAttribute("turista",dao.desplegarTurista());

        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_CAMBIAR;
            int idNumero = Integer.parseInt(request.getParameter("idNumero"));
            Turista turista = dao.elegirTurista(idNumero);
            request.setAttribute("turista", turista);

        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_CAMBIAR;

        } else {
            forward = LISTA_ALUMNO;
            request.setAttribute("turista", dao.desplegarTurista());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        Turista turista = new Turista();
        turista.setIdentificacion(request.getParameter("identificacion"));
        turista.setNombre(request.getParameter("nombre"));
        turista.setTelefono(request.getParameter("telefono"));
        turista.setPais(request.getParameter("pais"));
        turista.setEmail(request.getParameter("email"));
        

        String idNumero = request.getParameter("idNumero");
        
        if (idNumero == null || idNumero.isEmpty()) {
            dao.agregarTurista(turista);
        } else {
            turista.setIdNumero(Integer.parseInt(idNumero));
            dao.cambiarTurista(turista);
        }

        RequestDispatcher view = request.getRequestDispatcher(LISTA_ALUMNO);
        request.setAttribute("turista", dao.desplegarTurista());
        view.forward(request, response);

    
}
}