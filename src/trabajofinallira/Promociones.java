/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajofinallira;

import java.awt.BorderLayout;

/**
 *
 * @author Josty25
 */
public class Promociones extends javax.swing.JFrame {

    /**
     * Creates new form Promociones
     */
    public Promociones() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        PromocionJpanel1 pr1 = new PromocionJpanel1();
        pr1.setSize(850, 425);
        pr1.setLocation(0, 0);
        
        PanelPromociones.removeAll();
        PanelPromociones.add(pr1, BorderLayout.CENTER);
        PanelPromociones.revalidate();
        
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
        btn_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelPromociones = new javax.swing.JPanel();
        btn_promo1 = new javax.swing.JButton();
        jLabel2Oferta = new javax.swing.JLabel();
        btn_promo2 = new javax.swing.JButton();
        btn_promo3 = new javax.swing.JButton();
        jLabel2Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_regresar.setBackground(new java.awt.Color(0, 51, 204));
        btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("Salir");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 48, 68, 30));

        jLabel1.setFont(new java.awt.Font("Barlow Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("PROMOCIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 22, -1, -1));

        PanelPromociones.setBackground(new java.awt.Color(0, 0, 0));
        PanelPromociones.setOpaque(false);
        PanelPromociones.setPreferredSize(new java.awt.Dimension(850, 435));

        javax.swing.GroupLayout PanelPromocionesLayout = new javax.swing.GroupLayout(PanelPromociones);
        PanelPromociones.setLayout(PanelPromocionesLayout);
        PanelPromocionesLayout.setHorizontalGroup(
            PanelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelPromocionesLayout.setVerticalGroup(
            PanelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(PanelPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 143, -1, 440));

        btn_promo1.setBackground(new java.awt.Color(51, 255, 204));
        btn_promo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_promo1.setForeground(new java.awt.Color(0, 0, 0));
        btn_promo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Precios.png")); // NOI18N
        btn_promo1.setText("1er Promociones");
        btn_promo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_promo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel2Oferta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Ofertas XD.png")); // NOI18N
        jPanel1.add(jLabel2Oferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        btn_promo2.setBackground(new java.awt.Color(102, 255, 204));
        btn_promo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_promo2.setForeground(new java.awt.Color(0, 0, 0));
        btn_promo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Precios.png")); // NOI18N
        btn_promo2.setText("2da Promociones");
        btn_promo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_promo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        btn_promo3.setBackground(new java.awt.Color(51, 255, 204));
        btn_promo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_promo3.setForeground(new java.awt.Color(0, 0, 0));
        btn_promo3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\Precios.png")); // NOI18N
        btn_promo3.setText("3ra Promociones");
        btn_promo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promo3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_promo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        jLabel2Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josty25\\Documents\\NetBeansProjects\\EQUIPO7\\src\\com\\mycompany\\proyectofinal\\Imagenes\\FondosPs3.jpg")); // NOI18N
        jLabel2Fondo.setText("jLabel2");
        jPanel1.add(jLabel2Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_promo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promo1ActionPerformed
        PromocionJpanel1 pr1 = new PromocionJpanel1();
        pr1.setSize(850, 435);
        pr1.setLocation(0, 0);
        
        PanelPromociones.removeAll();
        PanelPromociones.add(pr1, BorderLayout.CENTER);
        PanelPromociones.revalidate();
    }//GEN-LAST:event_btn_promo1ActionPerformed

    private void btn_promo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promo3ActionPerformed
        PromocionesJpanel3 p3 = new PromocionesJpanel3();
        p3.setSize(850, 435);
        p3.setLocation(0, 0);
        
        PanelPromociones.removeAll();
        PanelPromociones.add(p3, BorderLayout.CENTER);
        PanelPromociones.revalidate();
    }//GEN-LAST:event_btn_promo3ActionPerformed

    private void btn_promo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promo2ActionPerformed
        PromocionesJpanel2 p2 = new PromocionesJpanel2();
        p2.setSize(850, 435);
        p2.setLocation(0, 0);
        
        PanelPromociones.removeAll();
        PanelPromociones.add(p2, BorderLayout.CENTER);
        PanelPromociones.revalidate();
    }//GEN-LAST:event_btn_promo2ActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        InicioCarwash i = new InicioCarwash();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Promociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promociones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPromociones;
    private javax.swing.JButton btn_promo1;
    private javax.swing.JButton btn_promo2;
    private javax.swing.JButton btn_promo3;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Fondo;
    private javax.swing.JLabel jLabel2Oferta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
