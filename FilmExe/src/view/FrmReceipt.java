package view;

import javax.swing.JFrame;

public class FrmReceipt extends javax.swing.JFrame {

    public FrmReceipt() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnGetBackHome3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelReceiptTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelReceiptChairTitle = new javax.swing.JLabel();
        labelReceiptClientTitle = new javax.swing.JLabel();
        txtReceiptChairName = new javax.swing.JTextField();
        txtReceiptChairPrice = new javax.swing.JTextField();
        txtReceiptClientCC = new javax.swing.JTextField();
        txtReceiptClientName = new javax.swing.JTextField();
        txtReceiptClientLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtReceiptClientAddress = new javax.swing.JTextField();
        txtReceiptClientEmail = new javax.swing.JTextField();
        txtReceiptClientPhone = new javax.swing.JTextField();
        btnGetBackHome3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        labelReceiptTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelReceiptTitle.setText("Recibo de compra");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoGrande.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoPersona.png"))); // NOI18N

        labelReceiptChairTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelReceiptChairTitle.setText("Silla");

        labelReceiptClientTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelReceiptClientTitle.setText("Cliente");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("GRACIAS POR COMPRAR EN FILMEX");

        btnGetBackHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVolver.png"))); // NOI18N
        btnGetBackHome3.setText("VOLVER");
        btnGetBackHome3.setBorder(null);
        btnGetBackHome3.setContentAreaFilled(false);
        btnGetBackHome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBackHome3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(619, 619, 619)
                        .addComponent(labelReceiptChairTitle)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(868, 868, 868)
                        .addComponent(labelReceiptClientTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(labelReceiptTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(819, 819, 819)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtReceiptClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReceiptClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReceiptClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(txtReceiptClientCC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtReceiptChairPrice)
                                    .addComponent(txtReceiptChairName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addComponent(txtReceiptClientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnGetBackHome3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiptClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(943, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGetBackHome3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelReceiptTitle)
                        .addGap(49, 49, 49)
                        .addComponent(labelReceiptClientTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(txtReceiptClientCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelReceiptChairTitle)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)))
                        .addComponent(txtReceiptClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txtReceiptClientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtReceiptChairName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtReceiptChairPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(txtReceiptClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtReceiptClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtReceiptClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)))
                .addContainerGap(299, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetBackHome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBackHome3ActionPerformed
        FrmCinemaManagement home = new FrmCinemaManagement();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGetBackHome3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetBackHome3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelReceiptChairTitle;
    private javax.swing.JLabel labelReceiptClientTitle;
    private javax.swing.JLabel labelReceiptTitle;
    private javax.swing.JTextField txtReceiptChairName;
    private javax.swing.JTextField txtReceiptChairPrice;
    private javax.swing.JTextField txtReceiptClientAddress;
    private javax.swing.JTextField txtReceiptClientCC;
    private javax.swing.JTextField txtReceiptClientEmail;
    private javax.swing.JTextField txtReceiptClientLastName;
    private javax.swing.JTextField txtReceiptClientName;
    private javax.swing.JTextField txtReceiptClientPhone;
    // End of variables declaration//GEN-END:variables
}
