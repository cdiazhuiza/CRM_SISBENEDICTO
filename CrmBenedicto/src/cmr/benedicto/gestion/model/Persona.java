/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmr.benedicto.gestion.model;

/**
 *
 * @author p4810
 */
abstract class Persona {
    
    private int codigo;
    private String nombre;
    private String apellidoPaterno;
    private String epellidoMaterno;
    private int DNI;
    private int celular;
    private int telefono;

    public Persona(String nombre, String apellidoPaterno, String epellidoMaterno, int DNI, int celular, int telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.epellidoMaterno = epellidoMaterno;
        this.DNI = DNI;
        this.celular = celular;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getEpellidoMaterno() {
        return epellidoMaterno;
    }

    public void setEpellidoMaterno(String epellidoMaterno) {
        this.epellidoMaterno = epellidoMaterno;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
   
    
}
