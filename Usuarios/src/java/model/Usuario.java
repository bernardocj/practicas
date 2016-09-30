/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jony
 */
public class Usuario {
   private int idUsuario;
   private String login;
   private String password;
   private String nombre;
   private int edad;
   

    public Usuario(int id, String login, String password, String nombre, int eda) {
        this.idUsuario = id;
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.edad = eda;
    }

      public Usuario(){
       this(0,"","","",0);
   }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", login=" + login + ", password=" + password + ", nombre=" + nombre + ", edad=" + edad + '}';
    }




   
    
}
