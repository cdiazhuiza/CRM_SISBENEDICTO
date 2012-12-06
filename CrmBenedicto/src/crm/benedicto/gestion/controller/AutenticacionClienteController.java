/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.controller;

import crm.benedicto.gestion.model.Cliente;
import crm.benedicto.gestion.bd.Clientes;
import java.util.ArrayList;

public class AutenticacionClienteController {
    
   
    
        
    public boolean ingresarCliente(Cliente cliente){     
        
        Clientes.clientes.add(cliente);
                
        
        return true;
    }
    
    public ArrayList<Cliente> obtenerCliente(Cliente cliente){     
        
        return null;
    }
}
