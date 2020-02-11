package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLayout(new FlowLayout());
        this.pack();;
    }
    private RegistroReclamo rr;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelMenuPrincipal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotonAsignarReclamo = new javax.swing.JButton();
        BotonRegistrarReclamo = new javax.swing.JButton();
        BotonTransferirReclamo = new javax.swing.JButton();
        BotonConsultarReclamo = new javax.swing.JButton();
        BotonConsultarReclamo1 = new javax.swing.JButton();
        BotonConsultarReclamo2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuPrincipal.setPreferredSize(new java.awt.Dimension(920, 531));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        LabelMenuPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        LabelMenuPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        LabelMenuPrincipal.setText("Menú Principal");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        BotonAsignarReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonAsignarReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonAsignarReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonAsignarReclamo.setText("Asignar un reclamo");
        BotonAsignarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsignarReclamoActionPerformed(evt);
            }
        });

        BotonRegistrarReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonRegistrarReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonRegistrarReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonRegistrarReclamo.setText("Registrar un reclamo");
        BotonRegistrarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarReclamoActionPerformed(evt);
            }
        });

        BotonTransferirReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonTransferirReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonTransferirReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonTransferirReclamo.setText("Transferir un reclamo");
        BotonTransferirReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTransferirReclamoActionPerformed(evt);
            }
        });

        BotonConsultarReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonConsultarReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonConsultarReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonConsultarReclamo.setText("Consultar sobre reclamos pendientes");
        BotonConsultarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarReclamoActionPerformed(evt);
            }
        });

        BotonConsultarReclamo1.setBackground(new java.awt.Color(102, 102, 102));
        BotonConsultarReclamo1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonConsultarReclamo1.setForeground(new java.awt.Color(51, 51, 51));
        BotonConsultarReclamo1.setText("Consultar sobre reclamos resueltos");
        BotonConsultarReclamo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarReclamo1ActionPerformed(evt);
            }
        });

        BotonConsultarReclamo2.setBackground(new java.awt.Color(102, 102, 102));
        BotonConsultarReclamo2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonConsultarReclamo2.setForeground(new java.awt.Color(51, 51, 51));
        BotonConsultarReclamo2.setText("Consultar sobre historial de reclamos");
        BotonConsultarReclamo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarReclamo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuPrincipalLayout = new javax.swing.GroupLayout(PanelMenuPrincipal);
        PanelMenuPrincipal.setLayout(PanelMenuPrincipalLayout);
        PanelMenuPrincipalLayout.setHorizontalGroup(
            PanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMenuPrincipalLayout.createSequentialGroup()
                .addGroup(PanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(LabelMenuPrincipal))
                    .addGroup(PanelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(PanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonConsultarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAsignarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonRegistrarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonTransferirReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonConsultarReclamo1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonConsultarReclamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(285, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuPrincipalLayout.setVerticalGroup(
            PanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BotonRegistrarReclamo)
                .addGap(18, 18, 18)
                .addComponent(BotonAsignarReclamo)
                .addGap(28, 28, 28)
                .addComponent(BotonTransferirReclamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BotonConsultarReclamo2)
                .addGap(28, 28, 28)
                .addComponent(BotonConsultarReclamo)
                .addGap(31, 31, 31)
                .addComponent(BotonConsultarReclamo1)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAsignarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignarReclamoActionPerformed

    }//GEN-LAST:event_BotonAsignarReclamoActionPerformed

    
    private void BotonRegistrarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarReclamoActionPerformed
        getContentPane().removeAll();
        rr = new RegistroReclamo();
        this.add(rr,BorderLayout.CENTER);
        this.pack();
       // rr.setLocation(point);
    }//GEN-LAST:event_BotonRegistrarReclamoActionPerformed

    private void BotonTransferirReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTransferirReclamoActionPerformed

    }//GEN-LAST:event_BotonTransferirReclamoActionPerformed

    private void BotonConsultarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarReclamoActionPerformed

    }//GEN-LAST:event_BotonConsultarReclamoActionPerformed

    private void BotonConsultarReclamo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarReclamo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConsultarReclamo1ActionPerformed

    private void BotonConsultarReclamo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarReclamo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConsultarReclamo2ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAsignarReclamo;
    private javax.swing.JButton BotonConsultarReclamo;
    private javax.swing.JButton BotonConsultarReclamo1;
    private javax.swing.JButton BotonConsultarReclamo2;
    private javax.swing.JButton BotonRegistrarReclamo;
    private javax.swing.JButton BotonTransferirReclamo;
    private javax.swing.JLabel LabelMenuPrincipal;
    private javax.swing.JPanel PanelMenuPrincipal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}