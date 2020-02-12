package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class RegistroReclamo extends javax.swing.JPanel {

    public RegistroReclamo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistroReclamo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextoNumeroCliente = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        ComboServicio = new javax.swing.JComboBox<>();
        TextoDescripcion = new javax.swing.JTextField();
        ComboTipoReclamo = new javax.swing.JComboBox<>();
        ComboClasificación = new javax.swing.JComboBox<>();
        TextoEstado = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();

        PanelRegistroReclamo.setBackground(new java.awt.Color(204, 204, 204));

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
        jLabel1.setText("Registrar un reclamo");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Número cliente:");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Estado:");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Servicio:");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tipo reclamo:");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Descripción:");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Clasificación:");

        TextoNumeroCliente.setBackground(new java.awt.Color(153, 153, 153));
        TextoNumeroCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        BotonBuscar.setBackground(new java.awt.Color(102, 102, 102));
        BotonBuscar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(51, 51, 51));
        BotonBuscar.setText("Buscar");

        ComboServicio.setBackground(new java.awt.Color(153, 153, 153));
        ComboServicio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        TextoDescripcion.setBackground(new java.awt.Color(153, 153, 153));
        TextoDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        ComboTipoReclamo.setBackground(new java.awt.Color(153, 153, 153));
        ComboTipoReclamo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboTipoReclamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        ComboClasificación.setBackground(new java.awt.Color(153, 153, 153));
        ComboClasificación.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboClasificación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Crítico", "Urgente" }));

        TextoEstado.setEditable(false);
        TextoEstado.setBackground(new java.awt.Color(153, 153, 153));
        TextoEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TextoEstado.setText("Alta");

        BotonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        BotonCancelar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(51, 51, 51));
        BotonCancelar.setText("Cancelar");

        BotonAceptar.setBackground(new java.awt.Color(102, 102, 102));
        BotonAceptar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonAceptar.setForeground(new java.awt.Color(51, 51, 51));
        BotonAceptar.setText("Aceptar");

        javax.swing.GroupLayout PanelRegistroReclamoLayout = new javax.swing.GroupLayout(PanelRegistroReclamo);
        PanelRegistroReclamo.setLayout(PanelRegistroReclamoLayout);
        PanelRegistroReclamoLayout.setHorizontalGroup(
            PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroReclamoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(352, 352, 352))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TextoNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(BotonBuscar))
                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroReclamoLayout.createSequentialGroup()
                                .addComponent(BotonCancelar)
                                .addGap(27, 27, 27))
                            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(ComboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboClasificación, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroReclamoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboTipoReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAceptar)
                            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(TextoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        PanelRegistroReclamoLayout.setVerticalGroup(
            PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextoNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ComboTipoReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboClasificación, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(TextoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonAceptar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JComboBox<String> ComboClasificación;
    private javax.swing.JComboBox<String> ComboServicio;
    private javax.swing.JComboBox<String> ComboTipoReclamo;
    private javax.swing.JPanel PanelRegistroReclamo;
    private javax.swing.JTextField TextoDescripcion;
    private javax.swing.JTextField TextoEstado;
    private javax.swing.JTextField TextoNumeroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
