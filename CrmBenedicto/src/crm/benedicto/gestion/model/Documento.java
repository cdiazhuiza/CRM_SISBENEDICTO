
package crm.benedicto.gestion.model;

abstract class Documento {
    String Serie;  
    int Numero;    
    String Concepto; 
    String fechaEmision;
    String Empresa;
    String FechaVencimiento;
    String Estado;
    
    Double subtotal;
    Double igv;
    Double Total;
    String Moneda;
    String FechaPago;
    String Observaciones;
    
    public Documento(String Serie, int Numero, String Concepto, String fechaEmision, String Empresa, String FechaVencimiento, String Estado, Double subtotal, Double igv, Double Total, String Moneda, String FechaPago, String Observaciones) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Concepto = Concepto;
        this.fechaEmision = fechaEmision;
        this.Empresa = Empresa;
        this.FechaVencimiento = FechaVencimiento;
        this.Estado = Estado;
        this.subtotal = subtotal;
        this.igv = igv;
        this.Total = Total;
        this.Moneda = Moneda;
        this.Observaciones = Observaciones;
        this.FechaPago = FechaPago;
    }

    public String getSerie() {
        return Serie;
    }

    public int getNumero() {
        return Numero;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public String getConcepto() {
        return Concepto;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public Double getIgv() {
        return igv;
    }

    public Double getTotal() {
        return Total;
    }

    public String getMoneda() {
        return Moneda;
    }

    public String getObservaciones() {
        return Observaciones;
    }
   
}
