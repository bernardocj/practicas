/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bernardo
 */
public class Turista {
    private int idNumero;
    private String identificacion;
    private String nombre;
    private String telefono;
    private String pais;
    private String email;
    
    
    

    public Turista(int idNumero, String identificacion,String nombre, String telefono, String pais, String email) {
        this.idNumero = idNumero;
        this.identificacion = identificacion;
        this.nombre=nombre;
        this.telefono = telefono;
        this.pais=pais;
        this.email=email;
        
        
        
    }
    
    public Turista(){
        this(0,"","","","","");
    }

    public int getIdNumero() {
        return idNumero;
    }

    public void setIdNumero(int idNumero) {
        this.idNumero = idNumero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    

    
    @Override
    public String toString() {
        return "Turista{" + "idNumero=" + idNumero + ", identificacion=" + identificacion + ", nombre=" + nombre + ", telefono=" + telefono + 
                 ", telefono=" + telefono + ", pais=" + pais + ", email=" + email +  '}';
    }
    
}
