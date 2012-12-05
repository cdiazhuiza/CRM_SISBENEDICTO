/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad.model;

/**
 *
 * @author alumnos
 */
public class Usuario {
    
   private String usuario;
   private String contrasena;
   
   private String dni;
   private String nombre;
   private String apPaterno;
   private String apMaterno;
   private String email;
   private String fecIngreso;
   private String cargo;
   private String rol;
   

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuario(String usuario, String contrasena, String dni, String nombre, String apPaterno, String apMaterno, String email, String fecIngreso, String cargo, String rol) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.dni = dni;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.email = email;
        this.fecIngreso = fecIngreso;
        this.cargo = cargo;
        this.rol = rol;
    }

    // GETTERS
    
    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public String getEmail() {
        return email;
    }

    public String getFecIngreso() {
        return fecIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public String getRol() {
        return rol;
    }
   
   // SETTER

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFecIngreso(String fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
   
    
}
