package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmCinemaManagement extends javax.swing.JFrame {

    private String[] seatNames = new String[42];
    private int i = 0;

    public FrmCinemaManagement() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnSelling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seatSelection();
        btnAddSeatsFromHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1BChair = new javax.swing.JButton();
        btn1CChair = new javax.swing.JButton();
        btn1DChair = new javax.swing.JButton();
        btn1EChair = new javax.swing.JButton();
        btn1FChair = new javax.swing.JButton();
        btn1GChair = new javax.swing.JButton();
        btn2AChair = new javax.swing.JButton();
        btn2BChair = new javax.swing.JButton();
        btn2CChair = new javax.swing.JButton();
        btn2DChair = new javax.swing.JButton();
        btn2EChair = new javax.swing.JButton();
        btn2FChair = new javax.swing.JButton();
        btn2GChair = new javax.swing.JButton();
        btn3EChair = new javax.swing.JButton();
        btn3FChair = new javax.swing.JButton();
        btn3GChair = new javax.swing.JButton();
        btn3AChair = new javax.swing.JButton();
        btn3BChair = new javax.swing.JButton();
        btn3CChair = new javax.swing.JButton();
        btn3DChair = new javax.swing.JButton();
        btn4EChair = new javax.swing.JButton();
        btn4GChair = new javax.swing.JButton();
        btn4FChair = new javax.swing.JButton();
        btn4DChair = new javax.swing.JButton();
        btn4AChair = new javax.swing.JButton();
        btn4BChair = new javax.swing.JButton();
        btn4CChair = new javax.swing.JButton();
        btn5FChair = new javax.swing.JButton();
        btn5EChair = new javax.swing.JButton();
        btn5GChair = new javax.swing.JButton();
        btn5DChair = new javax.swing.JButton();
        btn5AChair = new javax.swing.JButton();
        btn5BChair = new javax.swing.JButton();
        btn5CChair = new javax.swing.JButton();
        btn6FChair = new javax.swing.JButton();
        btn6EChair = new javax.swing.JButton();
        btn6GChair = new javax.swing.JButton();
        btn6DChair = new javax.swing.JButton();
        btn6AChair = new javax.swing.JButton();
        btn6BChair = new javax.swing.JButton();
        btn6CChair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSelling = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btn1AChair = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnShowSales = new javax.swing.JButton();
        btnAddSeatsFromHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        btn1BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1BChair.setName("B1"); // NOI18N

        btn1CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1CChair.setName("C1"); // NOI18N

        btn1DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1DChair.setName("D1"); // NOI18N

        btn1EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1EChair.setName("E1"); // NOI18N

        btn1FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1FChair.setName("F1"); // NOI18N

        btn1GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1GChair.setName("G1"); // NOI18N

        btn2AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2AChair.setName("A2"); // NOI18N

        btn2BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2BChair.setName("B2"); // NOI18N

        btn2CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2CChair.setName("C2"); // NOI18N

        btn2DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2DChair.setName("D2"); // NOI18N

        btn2EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2EChair.setName("E2"); // NOI18N

        btn2FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2FChair.setName("F2"); // NOI18N

        btn2GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2GChair.setName("G2"); // NOI18N

        btn3EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3EChair.setName("E3"); // NOI18N

        btn3FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3FChair.setName("F3"); // NOI18N

        btn3GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3GChair.setName("G3"); // NOI18N

        btn3AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3AChair.setName("A3"); // NOI18N

        btn3BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3BChair.setName("B3"); // NOI18N

        btn3CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3CChair.setName("C3"); // NOI18N

        btn3DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3DChair.setName("D3"); // NOI18N

        btn4EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4EChair.setName("E4"); // NOI18N

        btn4GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4GChair.setName("G4"); // NOI18N

        btn4FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4FChair.setName("F4"); // NOI18N

        btn4DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4DChair.setName("D4"); // NOI18N

        btn4AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4AChair.setName("A4"); // NOI18N

        btn4BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4BChair.setName("B4"); // NOI18N

        btn4CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4CChair.setName("C4"); // NOI18N

        btn5FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5FChair.setName("F5"); // NOI18N

        btn5EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5EChair.setName("E5"); // NOI18N

        btn5GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5GChair.setName("G5"); // NOI18N

        btn5DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5DChair.setName("D5"); // NOI18N

        btn5AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5AChair.setName("A5"); // NOI18N

        btn5BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5BChair.setName("B5"); // NOI18N

        btn5CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5CChair.setName("C5"); // NOI18N

        btn6FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6FChair.setName("F6"); // NOI18N

        btn6EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6EChair.setName("E6"); // NOI18N

        btn6GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6GChair.setName("G6"); // NOI18N

        btn6DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6DChair.setName("D6"); // NOI18N

        btn6AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6AChair.setName("A6"); // NOI18N

        btn6BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6BChair.setName("B6"); // NOI18N

        btn6CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6CChair.setName("C6"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("A");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("B");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("C");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("D");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("E");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("F");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("G");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("1");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("2");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("3");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("4");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("5");

        btnSelling.setBackground(new java.awt.Color(255, 255, 255));
        btnSelling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVender.png"))); // NOI18N
        btnSelling.setText("HACER VENTA");
        btnSelling.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSelling.setContentAreaFilled(false);
        btnSelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellingActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonSalir.png"))); // NOI18N
        btnExit.setText("SALIR");
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(255, 255, 255));
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonEditar.png"))); // NOI18N
        btnModify.setText("MODIFICAR");
        btnModify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModify.setContentAreaFilled(false);

        btn1AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1AChair.setName("A1"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("6");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pantalla.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("PANTALLA");

        btnShowSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TablaVentas.png"))); // NOI18N
        btnShowSales.setText("VENTAS");
        btnShowSales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnShowSales.setContentAreaFilled(false);
        btnShowSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSalesActionPerformed(evt);
            }
        });

        btnAddSeatsFromHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoGrande.png"))); // NOI18N
        btnAddSeatsFromHome.setText("AGR. ASIENTOS");
        btnAddSeatsFromHome.setBorder(null);
        btnAddSeatsFromHome.setContentAreaFilled(false);
        btnAddSeatsFromHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSeatsFromHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(727, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn3AChair)
                                        .addGap(47, 47, 47)
                                        .addComponent(btn3BChair))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn4AChair)
                                        .addGap(47, 47, 47)
                                        .addComponent(btn4BChair))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn5AChair)
                                        .addGap(47, 47, 47)
                                        .addComponent(btn5BChair))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn6AChair)
                                        .addGap(47, 47, 47)
                                        .addComponent(btn6BChair))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(btn2AChair))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(btn1AChair))))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2BChair, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn1BChair, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn2CChair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn2DChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn3CChair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3DChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4CChair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn4DChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5CChair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn5DChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn6CChair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn6DChair))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1CChair)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1DChair)
                                    .addComponent(jLabel5))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2EChair, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn1EChair)
                                    .addComponent(jLabel6))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2FChair, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn1FChair))
                                    .addComponent(jLabel7))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6GChair)
                                    .addComponent(btn5GChair)
                                    .addComponent(btn3GChair)
                                    .addComponent(btn4GChair)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btn2GChair)
                                            .addComponent(btn1GChair, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn6EChair)
                                .addGap(47, 47, 47)
                                .addComponent(btn6FChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5EChair)
                                .addGap(47, 47, 47)
                                .addComponent(btn5FChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn3EChair)
                                .addGap(47, 47, 47)
                                .addComponent(btn3FChair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4EChair)
                                .addGap(47, 47, 47)
                                .addComponent(btn4FChair)))))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSelling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnShowSales, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSeatsFromHome)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1BChair)
                                        .addComponent(btn1CChair, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1DChair)
                                        .addComponent(btn1EChair, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn1FChair, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(btn1AChair))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn2AChair)
                                            .addComponent(btn2BChair, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn2CChair)
                                            .addComponent(btn2DChair)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2EChair)
                                        .addComponent(btn2FChair, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn3AChair)
                                            .addComponent(btn3BChair, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn3CChair)
                                            .addComponent(btn3DChair)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn3EChair)
                                        .addComponent(btn3FChair, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4AChair)
                                    .addComponent(btn4BChair, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4CChair)
                                    .addComponent(btn4DChair)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn4EChair)
                                .addComponent(btn4FChair, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn5AChair)
                                    .addComponent(btn5BChair, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn5CChair)
                                    .addComponent(btn5DChair)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn5EChair)
                                .addComponent(btn5FChair, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6AChair)
                                    .addComponent(btn6BChair, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6CChair)
                                    .addComponent(btn6DChair)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn6EChair)
                                .addComponent(btn6FChair, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1GChair)
                        .addGap(18, 18, 18)
                        .addComponent(btn2GChair)
                        .addGap(18, 18, 18)
                        .addComponent(btn3GChair)
                        .addGap(18, 18, 18)
                        .addComponent(btn4GChair)
                        .addGap(18, 18, 18)
                        .addComponent(btn5GChair)
                        .addGap(18, 18, 18)
                        .addComponent(btn6GChair)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnShowSales, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAddSeatsFromHome)
                .addGap(30, 30, 30)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellingActionPerformed
        FrmSelling selling = new FrmSelling(seatNames);
        selling.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSellingActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showMessageDialog(this, "Hasta luego");
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnShowSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSalesActionPerformed
        FrmShowSales sales = new FrmShowSales();
        sales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowSalesActionPerformed

    private void btnAddSeatsFromHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSeatsFromHomeActionPerformed
        FrmLogOutClient addSeats = new FrmLogOutClient();
        addSeats.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddSeatsFromHomeActionPerformed

    private void seatSelection() {

        JButton[] buttonss = {btn1AChair, btn1BChair, btn1CChair, btn1DChair, btn1EChair, btn1FChair, btn1GChair,
            btn2AChair, btn2BChair, btn2CChair, btn2DChair, btn2EChair, btn2FChair, btn2GChair,
            btn3AChair, btn3BChair, btn3CChair, btn3DChair, btn3EChair, btn3FChair, btn3GChair,
            btn4AChair, btn4BChair, btn4CChair, btn4DChair, btn4EChair, btn4FChair, btn4GChair,
            btn5AChair, btn5BChair, btn5CChair, btn5DChair, btn5EChair, btn5FChair, btn5GChair,
            btn6AChair, btn6BChair, btn6CChair, btn6DChair, btn6EChair, btn6FChair, btn6GChair};

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Object btnSource = event.getSource();

                for (JButton button : buttonss) {
                    if ((JButton) btnSource == button) {
                        seatNames[i] = button.getName();
                        i++;
                    }
                }
                System.out.println(btnSource.toString());
            }
        };
        fillActionListenerButtons(buttonss, actionListener);
    }

    private void fillActionListenerButtons(JButton[] buttons, ActionListener actionListener) {
        for (JButton button : buttons) {
            button.addActionListener(actionListener);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1AChair;
    private javax.swing.JButton btn1BChair;
    private javax.swing.JButton btn1CChair;
    private javax.swing.JButton btn1DChair;
    private javax.swing.JButton btn1EChair;
    private javax.swing.JButton btn1FChair;
    private javax.swing.JButton btn1GChair;
    private javax.swing.JButton btn2AChair;
    private javax.swing.JButton btn2BChair;
    private javax.swing.JButton btn2CChair;
    private javax.swing.JButton btn2DChair;
    private javax.swing.JButton btn2EChair;
    private javax.swing.JButton btn2FChair;
    private javax.swing.JButton btn2GChair;
    private javax.swing.JButton btn3AChair;
    private javax.swing.JButton btn3BChair;
    private javax.swing.JButton btn3CChair;
    private javax.swing.JButton btn3DChair;
    private javax.swing.JButton btn3EChair;
    private javax.swing.JButton btn3FChair;
    private javax.swing.JButton btn3GChair;
    private javax.swing.JButton btn4AChair;
    private javax.swing.JButton btn4BChair;
    private javax.swing.JButton btn4CChair;
    private javax.swing.JButton btn4DChair;
    private javax.swing.JButton btn4EChair;
    private javax.swing.JButton btn4FChair;
    private javax.swing.JButton btn4GChair;
    private javax.swing.JButton btn5AChair;
    private javax.swing.JButton btn5BChair;
    private javax.swing.JButton btn5CChair;
    private javax.swing.JButton btn5DChair;
    private javax.swing.JButton btn5EChair;
    private javax.swing.JButton btn5FChair;
    private javax.swing.JButton btn5GChair;
    private javax.swing.JButton btn6AChair;
    private javax.swing.JButton btn6BChair;
    private javax.swing.JButton btn6CChair;
    private javax.swing.JButton btn6DChair;
    private javax.swing.JButton btn6EChair;
    private javax.swing.JButton btn6FChair;
    private javax.swing.JButton btn6GChair;
    private javax.swing.JButton btnAddSeatsFromHome;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSelling;
    private javax.swing.JButton btnShowSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
