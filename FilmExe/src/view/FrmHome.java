package view;

import javax.swing.JFrame;

public class FrmHome extends javax.swing.JFrame {

    public FrmHome() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHomeTitle = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        labelHomeTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelHomeTitle.setText(" Bienvenido a FilmExe");

        btnLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonEntrarSistema.png"))); // NOI18N
        btnLogIn.setText("INICIAR");
        btnLogIn.setBorder(null);
        btnLogIn.setContentAreaFilled(false);
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(663, 663, 663)
                        .addComponent(btnLogIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(635, 635, 635)
                        .addComponent(labelHomeTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(labelHomeTitle)
                .addGap(123, 123, 123)
                .addComponent(btnLogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        FrmCinemaManagement logIn = new FrmCinemaManagement();
        logIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogInActionPerformed
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel labelHomeTitle;
    // End of variables declaration//GEN-END:variables
}
