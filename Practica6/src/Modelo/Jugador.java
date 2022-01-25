package Modelo;

import java.sql.Date;

/**
 *
 * @author Nacho
 */
public class Jugador {
    
    private int numero;
    private String nombre;
    private String apellido;
    private String foto;
    private float sueldo;
    private Date fecha;
    private int dniEntrenador;
    
    public Jugador()
    {
    }

    public Jugador(int numero, String nombre, String apellido, String foto, float sueldo, Date fecha, int dniEntrenador) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.sueldo = sueldo;
        this.fecha = fecha;
        this.dniEntrenador = dniEntrenador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDniEntrenador() {
        return dniEntrenador;
    }

    public void setDniEntrenador(int dniEntrenador) {
        this.dniEntrenador = dniEntrenador;
    }
    
    
}
