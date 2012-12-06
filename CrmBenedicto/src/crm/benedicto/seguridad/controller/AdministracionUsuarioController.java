/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad.controller;

import crm.benedicto.seguridad.bd.Usuarios;
import crm.benedicto.seguridad.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class AdministracionUsuarioController {

    public AdministracionUsuarioController() {
        
    }
    
    
    
    public Usuario validarUsuario(String usuario){
        
        int c = 0;
        
        for(Usuario objUsua : Usuarios.usuarios){
            if(objUsua.getUsuario().equals(usuario)){
                objUsua.setIndice(c);
                return objUsua;
            }
            c++;
        }
               
        return null;
    }
    
    public boolean ingresarUsuario(Usuario objUsua){
          
        try {
            Usuarios.usuarios.add(objUsua);
            return true;
        }catch (Exception e) {
            //System.out.println("ERROR :  " +e.getMessage());
            return false;
        }
    }
    
}
