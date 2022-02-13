/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.*;
import Modelo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class JPanelModificar extends javax.swing.JPanel {

    /**
     * Creates new form JPanelModificar
     */
    
    String nombre = "", apellido = "", sueldo = "", fecha = "", foto = "";
    
    Entrenador ent;
    
    int dni;
    
    int op;
    
    int bandera = 0;
    
    public JPanelModificar(Entrenador ent, int dni) {
        initComponents();
        this.ent = ent;
        this.dni = dni;
        jFileChooser1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un campo:", "Nombre", "Apellido", "Fecha", "Sueldo", "Foto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(520, 520, 520))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String opcion = jComboBox1.getSelectedItem().toString();
        
        if(opcion.equals("Nombre"))
        {
            op = 1;
        }else if(opcion.equals("Apellido"))
        {
            op = 2;
        }else if(opcion.equals("Fecha"))
        {
            op = 3;
        }else if(opcion.equals("Sueldo"))
        {
            op = 4;
        }else
        {
            jComboBox1.setVisible(false);
            jTextField1.setVisible(false);
            jFileChooser1.setVisible(true);
            op = 5;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private boolean comprobarFecha(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String strDate = jTextField1.getText();
       
        if (strDate.trim().equals(""))
	{
	    return false;
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}

        
    }
    
    private boolean comprobarNumero(){
        try{
            int n = Integer.parseInt(jTextField1.getText());
            
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        switch(op)
        {
            case 1:
            {
                nombre = jTextField1.getText();
                //System.out.println(nombre);
                break;
            }
            case 2:
            {
                apellido = jTextField1.getText();
                break;
            }
            case 3:
            {
                try{
                     if(!comprobarFecha())
                        throw new ControlException("");
                     
                    fecha = jTextField1.getText();
                    bandera = 0;
                }catch(ControlException e){
                    ControlException ex = new ControlException("fecha");
                    jTextField1.setText("");
                    bandera = 1;
                }
                
                break;
            }
            case 4:
            {
                try{                   
                    if(!comprobarNumero())
                        throw new ControlException("");
                    
                    sueldo = jTextField1.getText();
                    bandera = 0;
                }catch(ControlException e){
                    ControlException ex = new ControlException("int");
                    jTextField1.setText("");
                    bandera = 1;
                }
                
                break;
            }
            case 5:
            {
                break;
            }
        }
        
        if(!nombre.equals(""))
        {
            ControlPerfil.modificarNombre(dni, nombre);
        }
        
        if(!apellido.equals(""))
        {
            ControlPerfil.modificarApellido(dni, apellido);
        }
        
        if(!fecha.equals(""))
        {
            try {
                ControlPerfil.modificarFecha(dni, fecha);
            } catch (Exception ex) {
                Logger.getLogger(JPanelModificar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(!sueldo.equals(""))
        {
            ControlPerfil.modificarSueldo(dni, sueldo);
        }
        
        if(!foto.equals(""))
        {
            //ControlPerfil.modificarFoto(dni);
        }
        
        if(bandera == 0)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Perfil modificado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}