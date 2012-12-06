
package crm.benedicto.gestion.model;

public class Compras extends Documento{

    public Compras(String Serie, int Numero, String Concepto, String fechaEmision, String Empresa, String FechaVencimiento, String Estado, Double subtotal, Double igv, Double Total, String Moneda, String FechaPago, String Observaciones) {
        super(Serie, Numero, Concepto, fechaEmision, Empresa, FechaVencimiento, Estado, subtotal, igv, Total, Moneda, FechaPago, Observaciones);
    }
    
}
