package view;

import controller.PersonController;
import controller.SaleController;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class FrmShowSales extends javax.swing.JFrame {
   
    DefaultTableModel tableSalesModel;
    private SaleController saleController;
    String[] columns = {"Total", "Fecha compra", "Fecha funcion", "Id Cliente"};
    Object data[][];
    
    public FrmShowSales() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnGetBackHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    public void showTable() {
		
        
        if(data == null){
            System.out.println("vacio");
        }
        tableSalesModel = new DefaultTableModel(data, columns);
        tableSales.setModel(tableSalesModel);
        tableSales.validate();
        tableSales.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnGetBackHome2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        tableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableSales);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("VENTAS FILMEXE");

        btnGetBackHome2.setBackground(new java.awt.Color(255, 255, 255));
        btnGetBackHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVolver.png"))); // NOI18N
        btnGetBackHome2.setText("VOLVER");
        btnGetBackHome2.setBorder(null);
        btnGetBackHome2.setContentAreaFilled(false);
        btnGetBackHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBackHome2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnGetBackHome2)
                .addGap(155, 155, 155)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1069, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(657, 657, 657))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGetBackHome2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetBackHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBackHome2ActionPerformed
        FrmCinemaManagement home = new FrmCinemaManagement();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGetBackHome2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetBackHome2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSales;
    // End of variables declaration//GEN-END:variables
}
