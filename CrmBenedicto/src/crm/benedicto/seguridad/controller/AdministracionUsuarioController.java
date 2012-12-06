/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad.controller;

import crm.benedicto.seguridad.bd.Usuarios;
import crm.benedicto.seguridad.model.Usuario;

/**
 *
 * @author Cesar
 */
public class AdministracionUsuarioController {

    public AdministracionUsuarioController() {
        
    }
    
    
    
    public Usuario validarUsuario(String usuario){
        
        for(Usuario objUsua : Usuarios.usuarios){
            if(objUsua.getUsuario().equals(usuario)){
                return objUsua;
            }
        }
               
        return null;
    }
    
}
