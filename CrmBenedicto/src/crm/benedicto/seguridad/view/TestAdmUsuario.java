/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad.view;


import crm.benedicto.seguridad.bd.Usuarios;
import crm.benedicto.seguridad.controller.AutenticacionUsuarioController;
import crm.benedicto.seguridad.model.Usuario;
import javax.swing.*;

/**
 *
 * @author Cesar
 */
public class TestAdmUsuario {

   public static void main(String[] args) {
   
     
       Usuario u1 = new Usuario("u1", "c1");
       Usuario u2 = new Usuario("u2", "c2");
       Usuario u3 = new Usuario("u3", "c3");
       
       Usuarios.usuarios.add(u1);
       Usuarios.usuarios.add(u2);
       Usuarios.usuarios.add(u3);
       
       
       
       for(Usuario  objUsua :  Usuarios.usuarios){     
        JOptionPane.showMessageDialog(null, objUsua.getUsuario(), "HOLA", 2);
       }
       
       
   }  
    
}
