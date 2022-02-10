package Modelo;

/**
 *
 * @author Nacho
 */
public class Convocatoria {
    
    private int codigo;
    private int numeroJugador;
    private int codigoPartido;
    private int eurosPorPunto;

    public Convocatoria(int codigo, int numeroJugador, int codigoPartido, int eurosPorPunto) {
        this.codigo = codigo;
        this.numeroJugador = numeroJugador;
        this.codigoPartido = codigoPartido;
        this.eurosPorPunto = eurosPorPunto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public int getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(int codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public int getEurosPorPunto() {
        return eurosPorPunto;
    }

    public void setEurosPorPunto(int eurosPorPunto) {
        this.eurosPorPunto = eurosPorPunto;
    }
    
    @Override
    public String toString(){
        return codigo+"/"+numeroJugador+"/"+codigoPartido+"/"+eurosPorPunto;
    }
    
}
