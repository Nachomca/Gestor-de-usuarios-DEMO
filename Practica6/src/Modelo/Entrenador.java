package Modelo;

import java.sql.Date;

/**
 *
 * @author Nacho
 */
public class Entrenador {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String foto;
    private Date fecha;
    private int sueldo;
    private int contraseña;
    
    public Entrenador()
    {}

    public Entrenador(int dni, String nombre, String apellido, String foto, Date fecha, int sueldo, int contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.fecha = fecha;
        this.sueldo = sueldo;
        this.contraseña = contraseña;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
