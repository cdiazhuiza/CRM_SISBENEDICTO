
package crm.benedicto.gestion.controller;

import crm.benedicto.gestion.model.Compras;
import crm.benedicto.gestion.bd.ComprasBD;

public class CompraControler {
    
     public boolean ingresarDocumento(Compras compras){             
        ComprasBD.ListaCompras.add(compras);
        return true;
    }
    
}
