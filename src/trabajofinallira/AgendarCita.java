/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajofinallira;

/**
 *
 * @author emira
 */
public class AgendarCita extends javax.swing.JFrame {

    /**
     * Creates new form AgendarCita
     */
    public AgendarCita() {
        initComponents();
        setLocationRelativeTo(null);
        AlmecenarCliente.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre_Tex = new javax.swing.JTextField();
        Numero_Telefono = new javax.swing.JTextField();
        Marco_Cliente = new javax.swing.JTextField();
        Hora_Cliente = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_Editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlmecenarCliente = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tipo_Servicios = new javax.swing.JTextField();
        jLabel9Fondo = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Barlow Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Login.png"))); // NOI18N
        jLabel1.setText("  HOLA ¿AQUIEN VAMOS A GREGAR HOY?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 530, 70));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Simon2XD.png"))); // NOI18N
        jLabel2.setText("DIGITE EL NOMBRE DEL CLIENTE ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 134, 260, 29));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Simon2XD.png"))); // NOI18N
        jLabel3.setText("NUMERO DE TEFONO DEL CLIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 181, 260, 28));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Simon2XD.png"))); // NOI18N
        jLabel4.setText("TIPO DE VEHICULO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 221, 178, 31));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Simon2XD.png"))); // NOI18N
        jLabel5.setText("HORA DEL LAVADO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 270, 178, 27));

        Nombre_Tex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_TexActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre_Tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 280, 29));

        Numero_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero_TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(Numero_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 280, 28));
        jPanel1.add(Marco_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 280, 31));
        jPanel1.add(Hora_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 280, 27));

        Guardar.setBackground(new java.awt.Color(0, 204, 204));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/SaveXD.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 371, 124, -1));

        btn_Regresar.setBackground(new java.awt.Color(0, 204, 204));
        btn_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Simon1XD.png"))); // NOI18N
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 120, -1));

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        AlmecenarCliente.setColumns(20);
        AlmecenarCliente.setRows(5);
        jScrollPane1.setViewportView(AlmecenarCliente);

        jLabel7.setText("LISTA DE CLIENTES ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Editar)
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Editar)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/Simon2XD.png"))); // NOI18N
        jLabel8.setText("SERVICIO O PROMOCION: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 309, 178, 27));
        jPanel1.add(Tipo_Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 280, 27));

        jLabel9Fondo.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectofinal/Imagenes/FondoAzulXD.png"))); // NOI18N
        jPanel1.add(jLabel9Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre_TexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_TexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_TexActionPerformed

    private void Numero_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero_TelefonoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
        String nombre=Nombre_Tex.getText();
        String apellido=Numero_Telefono.getText(); 
        String tipoVehiculo=Marco_Cliente.getText();
        String horaLavado=Hora_Cliente.getText(); 
        String tip = Tipo_Servicios.getText();
        
        Cliente cliente= new Cliente(nombre,apellido,tipoVehiculo,horaLavado, tip);
        cliente.enviarDatosAlServidor();
       
        AlmecenarCliente.append(cliente.toString());
    
        
        Nombre_Tex.setText("");
        Numero_Telefono.setText(""); 
        Marco_Cliente.setText("");
        Hora_Cliente.setText("");
        Tipo_Servicios.setText("");
        
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        Principal i = new Principal();
        i.setVisible(true);
        dispose();        
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        AlmecenarCliente.setEditable(true);
    }//GEN-LAST:event_btn_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AlmecenarCliente;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Hora_Cliente;
    private javax.swing.JTextField Marco_Cliente;
    private javax.swing.JTextField Nombre_Tex;
    private javax.swing.JTextField Numero_Telefono;
    private javax.swing.JTextField Tipo_Servicios;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9Fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
