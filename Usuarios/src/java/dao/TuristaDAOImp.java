/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Turista;
import util.UtilDB;

/**
 *
 * @author Bernardo
 */
public class TuristaDAOImp implements TuristaDAO{
     private Connection connection;
    public TuristaDAOImp(){
        connection = UtilDB.getConnection();
    }
    
    @Override
    public void agregarTurista(Turista turista) {
        try {
            String query="INSERT INTO turista (identificacion,nombre,telefono,pais,email)"
                + " VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            
            ps.setString(1, turista.getIdentificacion());
            ps.setString(2, turista.getNombre());
            ps.setString(3, turista.getTelefono());
            ps.setString(4, turista.getPais());
            ps.setString(5, turista.getEmail());
            
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void borrarTurista(int idNumero) {
        try {
            String query = "DELETE FROM turista WHERE"
                    +" id_numero = ?";
            PreparedStatement ps  = connection.prepareStatement(query);
            ps.setInt(1,idNumero);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void cambiarTurista(Turista turista) {
    
              try {
            String query="UPDATE turista SET identificacion=?,nombre=?,telefono=?,pais=?,email=?"
                + " WHERE id_numero=?";
                    
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, turista.getIdentificacion());
            ps.setString(2, turista.getNombre());
            ps.setString(3, turista.getTelefono());
            ps.setString(4, turista.getPais());
            ps.setString(5, turista.getEmail());
            ps.setInt(6, turista.getIdNumero());
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public List<Turista> desplegarTurista() {
       List<Turista> turistas = new ArrayList<Turista>();
        try {
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT * FROM turista");
                    while (rs.next()) {
                Turista turista = new  Turista(
                        rs.getInt("id_numero"),
                        rs.getString("identificacion"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("pais"),
                        rs.getString("email")
                        );
                
                turistas.add(turista);
            }
                    rs.close();
                    statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

      return turistas;
    }

    @Override
    public Turista elegirTurista(int idNumero) {
         Turista turista = null;
        try {
            String query ="SELECT * FROM turista WHERE id_numero=?";
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setInt(1, idNumero);
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
              turista = new  Turista(
                        rs.getInt("id_numero"),
                        rs.getString("identificacion"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("pais"),
                        rs.getString("email")
              );
            }
                    rs.close();
                    statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

      return turista;
    }
    
    
}
