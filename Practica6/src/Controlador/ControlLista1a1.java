package Controlador;

import Modelo.*;
import java.sql.*;

/**
 *
 * @author Nacho
 */

public class ControlLista1a1 {
    
    static Statement stmt;
    static ResultSet rs;
    
    public static Jugador primero(int dni)
    {
        Jugador jug = new Jugador();
        
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("Select * from jugador where dni_entrenador = " + dni);
            
            rs.next();
            jug = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getInt(7));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return jug;
    }
    
    public static Jugador avanzar()
    {
        Jugador jug = new Jugador();
        
        try {
              rs.next();

              jug = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getInt(7));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return jug;
        
    }
    
    public static Jugador retroceder()
    {
        Jugador jug = new Jugador();
        
        try {
             rs.previous();

              jug = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getInt(7));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return jug;
    }
    
    public static Jugador verUltimo()
    {
        Jugador jug = new Jugador();
        
        try {
              rs.last();

              jug = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getInt(7));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return jug;
    }
    
    public static Jugador verPrimero()
    {
        Jugador jug = new Jugador();
        
        try {
              rs.first();

              jug = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getInt(7));

        }catch (Exception e) {
                System.out.println(e);
            }
        
        return jug;
    }
    
    public static boolean esUltimo()
    {
        try {
              ResultSet rsaux = rs;
              
              rsaux.next();
              
              if(rsaux.isLast())
                  return true;

              rsaux.close();
              
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return false;
    }
    
}
