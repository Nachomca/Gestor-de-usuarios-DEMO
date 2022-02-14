/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;  
import java.util.Date; 

/**
 *
 * @author Nacho
 */
public class ControlPerfil {
    
    static Statement stmt;
    static ResultSet rs;
    
    public static Entrenador sacarEntrenador(int dni)
    {
        Entrenador ent = new Entrenador();
        
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            rs = stmt.executeQuery("Select * from entrenador where dni = " + dni);
            
            rs.next();
            ent = new Entrenador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(6),rs.getInt(5),rs.getInt(7));

//            rs.close();
//            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
        
        return ent;
    }
    
    public static void modificarNombre(int dni, String nombre)
    {
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            int otro = stmt.executeUpdate("Update entrenador set nombre = '"+ nombre +"' where dni = " + dni);
            
            //rs.next();

//            rs.close();
//            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
    
    public static void modificarApellido(int dni, String apellido)
    {
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            int otro = stmt.executeUpdate("Update entrenador set apellido = '"+ apellido +"' where dni = " + dni);
            
            //rs.next();

//            rs.close();
//            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
    
    public static void modificarFecha(int dni, String fec) throws Exception
    {
         Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fec);
        
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            int otro = stmt.executeUpdate("Update entrenador set fecha = '"+ fecha +"' where dni = " + dni);
            
            //rs.next();

//            rs.close();
//            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
    
    public static void modificarSueldo(int dni, String suel)
    {
        int sueldo = Integer.parseInt(suel);
        
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            int otro = stmt.executeUpdate("Update entrenador set nombre = "+ sueldo +" where dni = " + dni);
            
            //rs.next();

//            rs.close();
//            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
    
     public static void modificarFoto(int dni, String foto)
    {      
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            int otro = stmt.executeUpdate("Update entrenador set foto = '"+ foto +"' where dni = " + dni);
            
            //rs.next();

//            rs.close();
//            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
    
}
