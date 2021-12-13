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
    
    static Connection con; //global para que no se cierre en todo el programa hasta llamar a cerrar()
    static Statement stmt; //global para que no se cierre en todo el programa hasta llamar a cerrar()
    
    public static void conectar()
    {
        try{            
            System.out.println("Se va a conectar");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/equipo","equipo","equipo");
            System.out.println("Conectado");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            System.out.println("Statement creado");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static boolean consultaInicial(String consulta)
    {
        try
        {
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("consulta hecha");
            
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

        }catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    public static void cerrar()
    {
        try
        {
            stmt.close();
            con.close();
            
            System.out.println("Todo cerrado");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}


