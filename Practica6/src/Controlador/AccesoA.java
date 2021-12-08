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
    
    public static boolean consultaNombre(String consulta)
    {
        try
        {
            System.out.println("Se va a conectar");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/equipo","equipo","equipo");
            System.out.println("Conectado");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("consulta hecha");
            
            rs.close();
            stmt.close();
            con.close();
            
            return true;
            
        }catch(Exception e)
        {
            return false;
        }
    }
    
    public static boolean consultaContraseña(String consulta)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/equipo","equipo","equipo");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            
            rs.close();
            stmt.close();
            con.close();
            
            return true;
            
        }catch(Exception e)
        {
            return false;
        }
    }
    
}


