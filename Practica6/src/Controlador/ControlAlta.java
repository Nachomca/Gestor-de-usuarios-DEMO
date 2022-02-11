package Controlador;

import Modelo.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */

public class ControlAlta {
    
    static Statement stmt;
    static ResultSet rs;
    
    public static String[] ContarApellidos(int dni) {
        int n = 0;
        String [] apellido = new String[0];
        
        try {
            Statement stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = stmt.executeQuery("Select apellido from jugador where dni_entrenador = " + dni);
            
            while(!rs.isLast())
            {
                n++;
                rs.next();
            }
            
            apellido = new String[n];
            
            n = 0;
            
            rs.first();
            
            while(!rs.isLast())
            {
                apellido[n] = rs.getString(1);
                n++;
                rs.next();
            }
 
            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
               
        return apellido;
    }
    
    public static Jugador sacarJugador(String apellido)
    {
        Jugador jug = new Jugador();
        
        try {
            Statement stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = stmt.executeQuery("Select * from jugador where apellido = " + apellido);
            
            rs.next();
            jug = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getInt(7));

            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
        
        return jug;
    }
    
    public static Partido sacarPartido(String num)
    {
        Partido par = new Partido();
        
        try {
            Statement stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = stmt.executeQuery("Select * from partidos where codigo = " + num);
            
            rs.next();
            par = new Partido(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4));

            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
        
        return par;
    }
    
    public static int sacarNumero()
    {
        int i = 0;
        
        try {
            Statement stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = stmt.executeQuery("Select * from partidos");
            
            while(rs.next())
                i++;

            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
        
        return i;
    }
    
    public static void nuevaConvocatoria(int num, int numJug, int codPar)
    {
        try {
            Statement stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = stmt.executeQuery("insert into convocatorias values ("+num+ "," + numJug + "," + codPar + ", 10)");
            
            rs = stmt.executeQuery("Select * from convocatorias where codigo = " + num);
            
            rs.next();
            
            Convocatoria aux = new Convocatoria(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
            
            rs = stmt.executeQuery("Select * from partidos where codigo = " + codPar);
            
            rs.next();
            Partido par = new Partido(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4));
            
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"El dinero generado será de:\n" + (aux.getEurosPorPunto() * par.getPuntos()));

            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
        }
    }
}
