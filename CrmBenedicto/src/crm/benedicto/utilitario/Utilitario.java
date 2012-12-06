
package crm.benedicto.utilitario;

import java.util.Date;
import javax.swing.JOptionPane;
import sun.org.mozilla.javascript.internal.regexp.SubString;
public class Utilitario {
    
    public static boolean ValidarString(String Cadena){
        boolean Exito=false;
        Exito = Cadena.equals("")? false:true;
    return Exito;
    }
    
    public static boolean ValidarNumero(Double Entero){
        boolean Exito=false;
        Exito = (Entero > 0)? true:false;
    return Exito;
    }
    
   public static boolean ValidarFecha(Date Fecha){
        boolean Exito=false;
        int dia,mes;
        dia = Fecha.getDay();
        mes = Fecha.getMonth();
        Exito = (dia > 0 && dia <=31 )? true:false;
        Exito = (mes > 0 && mes <=12 )? true:false; 
    return Exito;
    }
   
   public static void validaEnterosKeypress(java.awt.event.KeyEvent evt){
         int k = (int) evt.getKeyChar();
       if(k>=97 && k<=122 || k>=65 && k<=90){
       JOptionPane.showMessageDialog(null, "Solo se permite ingresar Números ");
       evt.consume();
       }
   }
}
