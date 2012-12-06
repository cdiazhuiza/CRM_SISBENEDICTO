
package crm.benedicto.gestion.controller;

import crm.benedicto.gestion.model.Ventas;
import crm.benedicto.gestion.bd.VentasBD;

public class VentaController {
    
     public boolean ingresarDocumento(Ventas venta){             
        VentasBD.ListaVentas.add(venta);
        return true;
    }
     
}
