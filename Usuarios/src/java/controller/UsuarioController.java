package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UsuarioDAOImp;
import model.Usuario;
import dao.UsuarioDAO;

/**
 *
 * @author jony
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})
public class UsuarioController extends HttpServlet {

    private static final String LISTA_USUARIO
            = "/listarUsuarios.jsp";
    private static final String AGREGAR_O_CAMBIAR
            = "/usuarios.jsp";
    private UsuarioDAO dao;

    public UsuarioController() {
        dao = new UsuarioDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_USUARIO;
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            dao.borrarUsuario(idUsuario);
            request.setAttribute("usuarios",dao.desplegarUsuarios());

        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            Usuario usuario = dao.elegirUsuario(idUsuario);
            request.setAttribute("usuario", usuario);

        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;

        } else {
            forward = LISTA_USUARIO;
            request.setAttribute("usuarios", dao.desplegarUsuarios());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Usuario usuario = new Usuario();

        String idUsuario = request.getParameter("idUsuario");
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setLogin(request.getParameter("login"));
        usuario.setPassword(request.getParameter("password"));
        usuario.setEdad(Integer.parseInt(request.getParameter("edad")));
        if (idUsuario == null || idUsuario.isEmpty()) {
            dao.agregagarUsuario(usuario);
        } else {
            usuario.setIdUsuario(Integer.parseInt(idUsuario));
            dao.cambiarUsuario(usuario);
        }

        RequestDispatcher view = request.getRequestDispatcher(LISTA_USUARIO);
        request.setAttribute("usuarios", dao.desplegarUsuarios());
        view.forward(request, response);

    }
}
