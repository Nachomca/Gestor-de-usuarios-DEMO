package Controlador;

import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nacho
 */

public class ControlJList {
    
    static Statement stmt;
    static ResultSet rs;
    
    public static ArrayList rellenaArray(int num)
    {
        ArrayList <Convocatoria> aux = new ArrayList<Convocatoria>();
        
        try {
            stmt = AccesoA.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("Select * from convocatorias where numero_jugador = " + num);
            
            while (rs.next()) {
              
                Convocatoria em = new Convocatoria(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4));
                aux.add(em);
                 
            }

            rs.close();
            stmt.close();
            
        }catch (Exception e) {
                System.out.println(e);
            }
        
        return aux;
    }
    
}
