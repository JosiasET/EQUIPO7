/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajofinallira;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author Josty25
 */
public class Almacen extends javax.swing.JFrame {

    /**
     * Creates new form Almacen
     */
    Cliente cliente;
    private JLabel solicitud1;
    private JLabel solicitud2;
    private JLabel solicitud3;
    private JLabel solicitud4;
    private JLabel solicitud5;
         
    public Almacen() {
        initComponents();
        cliente = new Cliente("10.0.34.142",1020);
        panel_Solicitud.setLayout(new GridLayout(5, 1));

        solicitud1 = new JLabel("Vacio");
        solicitud2 = new JLabel("Vacio");
        solicitud3 = new JLabel("Vacio");
        solicitud4 = new JLabel("Vacio");
        solicitud5 = new JLabel("Vacio");

        panel_Solicitud.add(solicitud1);
        panel_Solicitud.add(solicitud2);
        panel_Solicitud.add(solicitud3);
        panel_Solicitud.add(solicitud4);
        panel_Solicitud.add(solicitud5);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_Solicitud = new javax.swing.JPanel();
        panel_Clientes = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        vehiculo = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        ser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_label = new javax.swing.JLabel();
        numero_label = new javax.swing.JLabel();
        Marca_label = new javax.swing.JLabel();
        precio_label = new javax.swing.JLabel();
        servicio_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));

        panel_Solicitud.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout panel_SolicitudLayout = new javax.swing.GroupLayout(panel_Solicitud);
        panel_Solicitud.setLayout(panel_SolicitudLayout);
        panel_SolicitudLayout.setHorizontalGroup(
            panel_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );
        panel_SolicitudLayout.setVerticalGroup(
            panel_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        panel_Clientes.setBackground(new java.awt.Color(204, 0, 204));

        Nombre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Simon2XD.png")); // NOI18N
        Nombre.setText("Nombre");

        telefono.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Simon2XD.png")); // NOI18N
        telefono.setText("Numero");

        vehiculo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        vehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Simon2XD.png")); // NOI18N
        vehiculo.setText("MARCA");

        hora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Simon2XD.png")); // NOI18N
        hora.setText("PRECIO");

        ser.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ser.setForeground(new java.awt.Color(255, 255, 255));
        ser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Simon2XD.png")); // NOI18N
        ser.setText("Servicio");

        jLabel2.setText("Detalle de solicitud");

        nombre_label.setText("NOMBRES");

        numero_label.setText("Numero");

        Marca_label.setText("Marca");

        precio_label.setText("Precio");

        servicio_label.setText("Servici´o");

        javax.swing.GroupLayout panel_ClientesLayout = new javax.swing.GroupLayout(panel_Clientes);
        panel_Clientes.setLayout(panel_ClientesLayout);
        panel_ClientesLayout.setHorizontalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(telefono)
                    .addComponent(ser)
                    .addComponent(hora)
                    .addComponent(vehiculo))
                .addGap(69, 69, 69)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panel_ClientesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_label)
                            .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Marca_label)
                            .addComponent(precio_label)
                            .addComponent(servicio_label))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        panel_ClientesLayout.setVerticalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ClientesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(numero_label))
                .addGap(45, 45, 45)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiculo)
                    .addComponent(Marca_label))
                .addGap(35, 35, 35)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora)
                    .addComponent(precio_label))
                .addGap(38, 38, 38)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser)
                    .addComponent(servicio_label))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SOLICITUDES");

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(panel_Solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(panel_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn_Actualizar)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addGap(393, 393, 393))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Actualizar)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Salir)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
       
    String recibir = cliente.RecibirSolicitude(); // JSON que recibes
    
    
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marca_label;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JLabel numero_label;
    private javax.swing.JPanel panel_Clientes;
    private javax.swing.JPanel panel_Solicitud;
    private javax.swing.JLabel precio_label;
    private javax.swing.JLabel ser;
    private javax.swing.JLabel servicio_label;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel vehiculo;
    // End of variables declaration//GEN-END:variables

    

}

