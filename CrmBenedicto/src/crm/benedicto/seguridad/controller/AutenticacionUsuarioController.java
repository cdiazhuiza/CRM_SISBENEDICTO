/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad.controller;

/**
 *
 * @author alumnos
 */

import crm.benedicto.seguridad.model.Usuario;
import crm.benedicto.seguridad.bd.Usuarios;
import java.util.ArrayList;

public class AutenticacionUsuarioController {
    
    
    public boolean validarUsuario(String usuario, String contrasena){     
        if(usuario.equals("cdiaz")&&contrasena.equals("carlos"))
            return true;
        return false;
    }
    
    
        
    public boolean ingresarUsuario(Usuario usuario){     
        
        Usuarios.usuarios.add(usuario);
                
        
        return true;
    }
    
    public ArrayList<Usuario> obtenerUsuarios(Usuario usuario){     
        
        return null;
    }
}
