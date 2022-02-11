/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.sql.ResultSet;
import java.sql.Statement;

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
    
}
