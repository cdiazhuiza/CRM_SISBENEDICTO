/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmr.benedicto.gestion.model;

import cmr.benedicto.gestion.model.Persona;
import java.util.Date;

/**
 *
 * @author p4810
 */
public class cliente extends Persona{

        private Date fechacontacto;
        
    public cliente(String nombre, String apellidoPaterno, String epellidoMaterno, int DNI, int celular, int telefono, Date fechacontacto) {
        super(nombre, apellidoPaterno, epellidoMaterno, DNI, celular, telefono);
        this.fechacontacto = fechacontacto;
    }

    public Date getFechacontacto() {
        return fechacontacto;
    }

    public void setFechacontacto(Date fechacontacto) {
        this.fechacontacto = fechacontacto;
    }

    
    
    
    
    
    
    
}
