package vista;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelMenuPrincipal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotonAsignarReclamo = new javax.swing.JButton();
        BotonRegistrarReclamo = new javax.swing.JButton();
        BotonTransferirReclamo = new javax.swing.JButton();
        BotonConsultarReclamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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
        BotonConsultarReclamo.setText("Consultar sobre reclamos registrados");
        BotonConsultarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarReclamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(LabelMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonConsultarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAsignarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegistrarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTransferirReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(277, 277, 277))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BotonRegistrarReclamo)
                .addGap(51, 51, 51)
                .addComponent(BotonAsignarReclamo)
                .addGap(47, 47, 47)
                .addComponent(BotonTransferirReclamo)
                .addGap(48, 48, 48)
                .addComponent(BotonConsultarReclamo)
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void BotonAsignarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignarReclamoActionPerformed

    }//GEN-LAST:event_BotonAsignarReclamoActionPerformed

    
    private void BotonRegistrarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarReclamoActionPerformed

    }//GEN-LAST:event_BotonRegistrarReclamoActionPerformed

    private void BotonTransferirReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTransferirReclamoActionPerformed

    }//GEN-LAST:event_BotonTransferirReclamoActionPerformed

    private void BotonConsultarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarReclamoActionPerformed

    }//GEN-LAST:event_BotonConsultarReclamoActionPerformed

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
    private javax.swing.JButton BotonRegistrarReclamo;
    private javax.swing.JButton BotonTransferirReclamo;
    private javax.swing.JLabel LabelMenuPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}