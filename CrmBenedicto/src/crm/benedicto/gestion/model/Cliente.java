/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.model;

import crm.benedicto.gestion.model.Persona;
import java.util.Date;

/**
 *
 * @author p4810
 */
public class Cliente extends Persona{

    public Cliente(int codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String email, int DNI, int celular, int telefono, Date fechaContacto) {
        super(codigo, nombre, apellidoPaterno, apellidoMaterno, email, DNI, celular, telefono, fechaContacto);
    }

    
   
        
}
