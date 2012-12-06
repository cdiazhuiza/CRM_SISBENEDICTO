/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.controller;

import crm.benedicto.gestion.model.Prospecto;
import crm.benedicto.gestion.bd.Prospectos;
import java.util.ArrayList;

public class AutenticacionProspectoController {
    
      
    
        
    public boolean ingresarProspecto(Prospecto prospecto){     
        
        Prospectos.prospectos.add(prospecto);
                
        
        return true;
    }
    
    public ArrayList<Prospecto> obtenerCliente(Prospecto prospecto){     
        
        return null;
    }
}
