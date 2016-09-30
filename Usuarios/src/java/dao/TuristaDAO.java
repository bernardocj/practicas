/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Turista;

/**
 *
 * @author bernardo 
 */
public interface TuristaDAO {
    
    void agregarTurista(Turista turista);
    void borrarTurista(int idNumero);
    void cambiarTurista(Turista turista);
    
    List<Turista> desplegarTurista();
    Turista elegirTurista (int idNumero);
    
}
