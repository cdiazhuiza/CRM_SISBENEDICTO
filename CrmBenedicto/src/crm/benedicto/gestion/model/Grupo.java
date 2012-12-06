/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.model;

/**
 *
 * @author p4810
 */
public class Grupo {
    
    private int codigo;
    private String nombredelgrupo;
    private String academia;
    private String curso;
    private String fechadeinicio;
    private String fechadefin;
    private String estado;

    public Grupo(String nombredelgrupo, String academia, String curso, String fechadeinicio, String fechadefin, String estado) {
        this.nombredelgrupo = nombredelgrupo;
        this.academia = academia;
        this.curso = curso;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.estado = estado;
    }

    public String getNombredelgrupo() {
        return nombredelgrupo;
    }

    public void setNombredelgrupo(String nombredelgrupo) {
        this.nombredelgrupo = nombredelgrupo;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(String fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getFechadefin() {
        return fechadefin;
    }

    public void setFechadefin(String fechadefin) {
        this.fechadefin = fechadefin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
   
    
}
