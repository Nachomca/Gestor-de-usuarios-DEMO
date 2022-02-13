/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class ControlException extends Exception{
    public ControlException(String s) 
    {
        switch(s) 
        {
            case "int":
            {
                intNoValido();
                break;
            }

            case "float":
            {
                floatNoValido();
                break;
            }
            case "fecha":
            {
                fechaNoValida();
                break;
            }
            case "sueldo":
            {
                sueldoSuperado();
                break;
            }
        }
        
    }
   private void intNoValido() 
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "ERROR. El dato introducido no es un entero.");
    }

    private void floatNoValido() 
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "ERROR. Debes usar un decimal.");
    }
    
    private void fechaNoValida(){
        JFrame frame2 = new JFrame();
        JOptionPane.showMessageDialog(frame2, "La fecha introducida no es correcta.\nIntentalo de nuevo.");
    } 
    
    private void sueldoSuperado(){
        JFrame frame2 = new JFrame();
        JOptionPane.showMessageDialog(frame2, "El sueldo supera el máximo permitido.\nIntentalo de nuevo.");
    }
}
