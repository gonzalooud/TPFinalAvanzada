package vista;

import controlador.ControlSistema;

public class TransferenciaReclamo extends javax.swing.JPanel {

    private ControlSistema controlSistema;
    private FramePrincipal vPrincipal;
    private String tipoMenu;
    
    public TransferenciaReclamo(ControlSistema controlSistema, FramePrincipal vPrincipal, String tipoMenu){
        this.controlSistema = controlSistema;
        this.vPrincipal = vPrincipal;
        this.tipoMenu = tipoMenu;
        initComponents();
        LabelEmpleadoAsignado.setVisible(false);
        LabelEstado.setVisible(false);
        LabelDescripcion.setVisible(false);
        TextoDescripcion.setVisible(false);
        jScrollPane1.setVisible(false);
        ComboEmpleadoAsignado.setVisible(false);
        ComboEstado.setVisible(false);
        this.vPrincipal.revalidate();
        this.vPrincipal.repaint();
        this.vPrincipal.pack();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextoNumeroReclamo = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        LabelEmpleadoAsignado = new javax.swing.JLabel();
        LabelEstado = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        LabelDescripcion = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        ComboEmpleadoAsignado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoDescripcion = new javax.swing.JTextArea();

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Transferir un reclamo");

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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Número reclamo:");

        TextoNumeroReclamo.setBackground(new java.awt.Color(153, 153, 153));
        TextoNumeroReclamo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        BotonBuscar.setBackground(new java.awt.Color(102, 102, 102));
        BotonBuscar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(51, 51, 51));
        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        LabelEmpleadoAsignado.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        LabelEmpleadoAsignado.setForeground(new java.awt.Color(51, 51, 51));
        LabelEmpleadoAsignado.setText("<html>Número empleado<p>asignado:<html>");

        LabelEstado.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LabelEstado.setForeground(new java.awt.Color(51, 51, 51));
        LabelEstado.setText("Estado:");

        ComboEstado.setBackground(new java.awt.Color(153, 153, 153));
        ComboEstado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Alta", "En evaluacion", "En proceso", " " }));

        LabelDescripcion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LabelDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        LabelDescripcion.setText("Descripción:");

        BotonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        BotonCancelar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(51, 51, 51));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonAceptar.setBackground(new java.awt.Color(102, 102, 102));
        BotonAceptar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonAceptar.setForeground(new java.awt.Color(51, 51, 51));
        BotonAceptar.setText("Aceptar");

        ComboEmpleadoAsignado.setBackground(new java.awt.Color(153, 153, 153));
        ComboEmpleadoAsignado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboEmpleadoAsignado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        TextoDescripcion.setBackground(new java.awt.Color(153, 153, 153));
        TextoDescripcion.setColumns(20);
        TextoDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TextoDescripcion.setLineWrap(true);
        TextoDescripcion.setRows(5);
        TextoDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TextoDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(341, 341, 341))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCancelar)
                .addGap(105, 105, 105)
                .addComponent(BotonAceptar)
                .addGap(307, 307, 307))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelEstado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LabelEmpleadoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComboEmpleadoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelDescripcion)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(TextoNumeroReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BotonBuscar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNumeroReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BotonBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEmpleadoAsignado)
                            .addComponent(ComboEmpleadoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(LabelDescripcion)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEstado)
                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonAceptar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
         if(tipoMenu.equalsIgnoreCase("Supervisor")){
            this.vPrincipal.atrasTransferenciaSupervisor();
        }else{
            this.vPrincipal.atrasTransferenciaEmpleado();
        }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        int numeroReclamo;
        
    }//GEN-LAST:event_BotonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JComboBox<String> ComboEmpleadoAsignado;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelEmpleadoAsignado;
    private javax.swing.JLabel LabelEstado;
    private javax.swing.JTextArea TextoDescripcion;
    private javax.swing.JTextField TextoNumeroReclamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
