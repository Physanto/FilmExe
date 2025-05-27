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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        labelHomeTitle.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        labelHomeTitle.setForeground(new java.awt.Color(0, 0, 0));
        labelHomeTitle.setText(" Bienvenido a FilmExe");
        getContentPane().add(labelHomeTitle);
        labelHomeTitle.setBounds(600, 290, 347, 45);

        btnLogIn.setForeground(new java.awt.Color(0, 0, 0));
        btnLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonEntrarSistema.png"))); // NOI18N
        btnLogIn.setText("INICIAR");
        btnLogIn.setBorder(null);
        btnLogIn.setContentAreaFilled(false);
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogIn);
        btnLogIn.setBounds(680, 370, 180, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PantallaDeInicio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-80, -60, 1770, 1100);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHomeTitle;
    // End of variables declaration//GEN-END:variables
}
