package Modelo;

import java.sql.Date;

/**
 *
 * @author Nacho
 */
public class Partido {
    
    private int codigo;
    private String arbitro;
    private Date fecha;
    private int puntos;

    public Partido(int codigo, String arbitro, Date fecha, int puntos) {
        this.codigo = codigo;
        this.arbitro = arbitro;
        this.fecha = fecha;
        this.puntos = puntos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
