package view;

import controller.SaleController;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class FrmShowSales extends javax.swing.JFrame {
   
    DefaultTableModel tableSalesModel;
    private SaleController saleController;
    String[] columns = {"Cedula", "Nombre", "Fecha Inicial", "Fecha Final", "total"};
    
    public FrmShowSales() {
        initComponents();
		saleController = new SaleController();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnGetBackHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		showTable();
    }

    public void showTable() { 
    	Object data[][] = saleController.searchSale("cd");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jScrollPane1.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 15)); // NOI18N

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 347, 751, 464);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("VENTAS FILMEXE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(682, 286, 193, 29);

        btnGetBackHome2.setBackground(new java.awt.Color(255, 255, 255));
        btnGetBackHome2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGetBackHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVolver.png"))); // NOI18N
        btnGetBackHome2.setText("VOLVER");
        btnGetBackHome2.setBorder(null);
        btnGetBackHome2.setContentAreaFilled(false);
        btnGetBackHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBackHome2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGetBackHome2);
        btnGetBackHome2.setBounds(61, 711, 170, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinasCine.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 12, 1160, 268);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PantallaDeInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-60, 0, 1740, 960);

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSales;
    // End of variables declaration//GEN-END:variables
}
