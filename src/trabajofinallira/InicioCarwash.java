/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajofinallira;

/**
 *
 * @author Josty25
 */
public class InicioCarwash extends javax.swing.JFrame {
    
    public InicioCarwash() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Coche = new javax.swing.JLabel();
        btn_Agendar = new javax.swing.JButton();
        btn_ListaClientes = new javax.swing.JButton();
        btn_Servicios = new javax.swing.JButton();
        btn_Promo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Barlow Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CAR WASH");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 269, -1));

        Coche.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Imagen-removebg-preview.png")); // NOI18N
        jPanel2.add(Coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        btn_Agendar.setFont(new java.awt.Font("Impact", 3, 18)); // NOI18N
        btn_Agendar.setText("Agenda de citas");
        btn_Agendar.setPreferredSize(new java.awt.Dimension(125, 25));
        btn_Agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgendarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Agendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, 40));

        btn_ListaClientes.setFont(new java.awt.Font("Impact", 3, 18)); // NOI18N
        btn_ListaClientes.setText("Lista de clientes");
        btn_ListaClientes.setPreferredSize(new java.awt.Dimension(125, 25));
        btn_ListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 40));

        btn_Servicios.setFont(new java.awt.Font("Impact", 3, 18)); // NOI18N
        btn_Servicios.setText("Servicios");
        btn_Servicios.setPreferredSize(new java.awt.Dimension(125, 25));
        btn_Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ServiciosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, 40));

        btn_Promo.setFont(new java.awt.Font("Impact", 3, 18)); // NOI18N
        btn_Promo.setText("Promociones");
        btn_Promo.setPreferredSize(new java.awt.Dimension(125, 25));
        btn_Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PromoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 40));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\FondoInicio.jpg")); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 700, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Fondos.jpg")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(1000, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgendarActionPerformed
        AgendarCita g = new AgendarCita();
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_AgendarActionPerformed

    private void btn_ListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaClientesActionPerformed
        ListaDeClientes l = new ListaDeClientes();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ListaClientesActionPerformed

    private void btn_ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ServiciosActionPerformed
        Servicios s = new Servicios();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ServiciosActionPerformed

    private void btn_PromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PromoActionPerformed
        Promociones p = new Promociones();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_PromoActionPerformed

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
            java.util.logging.Logger.getLogger(InicioCarwash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioCarwash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioCarwash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioCarwash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioCarwash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coche;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btn_Agendar;
    private javax.swing.JButton btn_ListaClientes;
    private javax.swing.JButton btn_Promo;
    private javax.swing.JButton btn_Servicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
