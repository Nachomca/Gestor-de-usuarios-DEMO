package Controlador;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */

public class AccesoA {
    
    public static Connection con; //global para que no se cierre en todo el programa hasta llamar a cerrar()
    static PreparedStatement ps;
    
    public static void conectar()
    {
        try{            
            System.out.println("Se va a conectar");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/equipo","equipo","equipo");
            System.out.println("Conectado");
//            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
//                                  ResultSet.CONCUR_READ_ONLY);
            System.out.println("Statement creado");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static boolean consultaInicial(String nombre, String contraseña)
    {   
        try {

            ps = con.prepareStatement("select * from entrenador where nombre = ? and contraseña = ?");

            ps.setString(1, nombre);

            ps.setString(2, contraseña);


            ResultSet rs = ps.executeQuery();

            
            if(rs.next())
            {
                rs.close();
            
                return true;
            }
            else
            {
                rs.close();
                
                return false;
            }
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public static int sacarDni(String nombre)
    {
        int dni = 0;
        
        try
        {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from entrenador where nombre = '" + nombre + "'");
            
            rs.next();
            
            dni = rs.getInt(1);

            System.out.println(dni);
            
            rs.close();
            stmt.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        return dni;
    }
    
    public static void cerrar()
    {
        try
        {
            con.close();
            
            System.out.println("Todo cerrado");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}


