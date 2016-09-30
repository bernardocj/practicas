/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Usuario;

/**
 *
 * @author jony
 */
public interface UsuarioDAO {
     void agregagarUsuario(Usuario usuario);
    void borrarUsuario(int idUsuario);
    void cambiarUsuario(Usuario usuario);
    List<Usuario>desplegarUsuarios();
    Usuario elegirUsuario(int idUsuario);
}
