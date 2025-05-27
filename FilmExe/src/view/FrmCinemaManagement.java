package view;

import controller.SeatController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Seat;

public class FrmCinemaManagement extends javax.swing.JFrame {

    private ArrayList<String> seatNames = new ArrayList<>();
    private int i = 0;
	private SeatController seatController;	

    public FrmCinemaManagement() {
        initComponents();
		seatController = new SeatController();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnSelling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seatSelection();
        btnAddSeatsFromHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		disabledButtons();
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
        btn1AChair = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnShowSales = new javax.swing.JButton();
        btnAddSeatsFromHome = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        btn1BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1BChair.setName("B1"); // NOI18N
        getContentPane().add(btn1BChair);
        btn1BChair.setBounds(740, 500, 38, 38);

        btn1CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1CChair.setName("C1"); // NOI18N
        getContentPane().add(btn1CChair);
        btn1CChair.setBounds(830, 500, 38, 38);

        btn1DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1DChair.setName("D1"); // NOI18N
        getContentPane().add(btn1DChair);
        btn1DChair.setBounds(920, 500, 38, 38);

        btn1EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1EChair.setName("E1"); // NOI18N
        getContentPane().add(btn1EChair);
        btn1EChair.setBounds(1010, 500, 38, 38);

        btn1FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1FChair.setName("F1"); // NOI18N
        getContentPane().add(btn1FChair);
        btn1FChair.setBounds(1100, 500, 38, 38);

        btn1GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1GChair.setName("G1"); // NOI18N
        getContentPane().add(btn1GChair);
        btn1GChair.setBounds(1190, 500, 38, 38);

        btn2AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2AChair.setName("A2"); // NOI18N
        getContentPane().add(btn2AChair);
        btn2AChair.setBounds(650, 560, 38, 38);

        btn2BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2BChair.setName("B2"); // NOI18N
        getContentPane().add(btn2BChair);
        btn2BChair.setBounds(740, 560, 38, 38);

        btn2CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2CChair.setName("C2"); // NOI18N
        getContentPane().add(btn2CChair);
        btn2CChair.setBounds(830, 560, 38, 38);

        btn2DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2DChair.setName("D2"); // NOI18N
        getContentPane().add(btn2DChair);
        btn2DChair.setBounds(920, 560, 38, 38);

        btn2EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2EChair.setName("E2"); // NOI18N
        getContentPane().add(btn2EChair);
        btn2EChair.setBounds(1010, 560, 38, 38);

        btn2FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2FChair.setName("F2"); // NOI18N
        getContentPane().add(btn2FChair);
        btn2FChair.setBounds(1100, 560, 38, 38);

        btn2GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2GChair.setName("G2"); // NOI18N
        getContentPane().add(btn2GChair);
        btn2GChair.setBounds(1190, 560, 38, 38);

        btn3EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3EChair.setName("E3"); // NOI18N
        getContentPane().add(btn3EChair);
        btn3EChair.setBounds(1010, 620, 38, 38);

        btn3FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3FChair.setName("F3"); // NOI18N
        getContentPane().add(btn3FChair);
        btn3FChair.setBounds(1100, 620, 38, 38);

        btn3GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3GChair.setName("G3"); // NOI18N
        getContentPane().add(btn3GChair);
        btn3GChair.setBounds(1190, 620, 38, 38);

        btn3AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3AChair.setName("A3"); // NOI18N
        getContentPane().add(btn3AChair);
        btn3AChair.setBounds(650, 620, 38, 38);

        btn3BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3BChair.setName("B3"); // NOI18N
        getContentPane().add(btn3BChair);
        btn3BChair.setBounds(740, 620, 38, 38);

        btn3CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3CChair.setName("C3"); // NOI18N
        getContentPane().add(btn3CChair);
        btn3CChair.setBounds(830, 620, 38, 38);

        btn3DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3DChair.setName("D3"); // NOI18N
        getContentPane().add(btn3DChair);
        btn3DChair.setBounds(920, 620, 38, 38);

        btn4EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4EChair.setName("E4"); // NOI18N
        getContentPane().add(btn4EChair);
        btn4EChair.setBounds(1010, 680, 38, 38);

        btn4GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4GChair.setName("G4"); // NOI18N
        getContentPane().add(btn4GChair);
        btn4GChair.setBounds(1190, 680, 38, 38);

        btn4FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4FChair.setName("F4"); // NOI18N
        getContentPane().add(btn4FChair);
        btn4FChair.setBounds(1100, 680, 38, 38);

        btn4DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4DChair.setName("D4"); // NOI18N
        getContentPane().add(btn4DChair);
        btn4DChair.setBounds(920, 680, 38, 38);

        btn4AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4AChair.setName("A4"); // NOI18N
        getContentPane().add(btn4AChair);
        btn4AChair.setBounds(650, 680, 38, 38);

        btn4BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4BChair.setName("B4"); // NOI18N
        getContentPane().add(btn4BChair);
        btn4BChair.setBounds(740, 680, 38, 38);

        btn4CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4CChair.setName("C4"); // NOI18N
        getContentPane().add(btn4CChair);
        btn4CChair.setBounds(830, 680, 38, 38);

        btn5FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5FChair.setName("F5"); // NOI18N
        getContentPane().add(btn5FChair);
        btn5FChair.setBounds(1100, 740, 38, 38);

        btn5EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5EChair.setName("E5"); // NOI18N
        getContentPane().add(btn5EChair);
        btn5EChair.setBounds(1010, 740, 38, 38);

        btn5GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5GChair.setName("G5"); // NOI18N
        getContentPane().add(btn5GChair);
        btn5GChair.setBounds(1190, 740, 38, 38);

        btn5DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5DChair.setName("D5"); // NOI18N
        getContentPane().add(btn5DChair);
        btn5DChair.setBounds(920, 740, 38, 38);

        btn5AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5AChair.setName("A5"); // NOI18N
        getContentPane().add(btn5AChair);
        btn5AChair.setBounds(650, 740, 38, 38);

        btn5BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5BChair.setName("B5"); // NOI18N
        getContentPane().add(btn5BChair);
        btn5BChair.setBounds(740, 740, 38, 38);

        btn5CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5CChair.setName("C5"); // NOI18N
        getContentPane().add(btn5CChair);
        btn5CChair.setBounds(830, 740, 38, 38);

        btn6FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6FChair.setName("F6"); // NOI18N
        getContentPane().add(btn6FChair);
        btn6FChair.setBounds(1100, 800, 38, 38);

        btn6EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6EChair.setName("E6"); // NOI18N
        getContentPane().add(btn6EChair);
        btn6EChair.setBounds(1010, 800, 38, 38);

        btn6GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6GChair.setName("G6"); // NOI18N
        getContentPane().add(btn6GChair);
        btn6GChair.setBounds(1190, 800, 38, 38);

        btn6DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6DChair.setName("D6"); // NOI18N
        getContentPane().add(btn6DChair);
        btn6DChair.setBounds(920, 800, 38, 38);

        btn6AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6AChair.setName("A6"); // NOI18N
        getContentPane().add(btn6AChair);
        btn6AChair.setBounds(650, 800, 38, 38);

        btn6BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6BChair.setName("B6"); // NOI18N
        getContentPane().add(btn6BChair);
        btn6BChair.setBounds(740, 800, 38, 38);

        btn6CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6CChair.setName("C6"); // NOI18N
        getContentPane().add(btn6CChair);
        btn6CChair.setBounds(830, 800, 38, 38);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("A");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 470, 12, 26);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("B");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 470, 12, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("C");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(840, 470, 11, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("D");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(930, 470, 13, 26);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("E");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1020, 470, 20, 26);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("F");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1110, 470, 9, 26);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("G");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1200, 470, 20, 26);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(610, 510, 10, 26);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("2");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(610, 570, 10, 26);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("3");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(610, 630, 10, 26);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("4");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(610, 690, 10, 26);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("5");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(610, 750, 10, 26);

        btnSelling.setBackground(new java.awt.Color(255, 255, 255));
        btnSelling.setForeground(new java.awt.Color(0, 0, 0));
        btnSelling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVender.png"))); // NOI18N
        btnSelling.setText("HACER VENTA");
        btnSelling.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSelling.setContentAreaFilled(false);
        btnSelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellingActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelling);
        btnSelling.setBounds(1330, 670, 212, 123);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonSalir.png"))); // NOI18N
        btnExit.setText("SALIR");
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(300, 680, 212, 123);

        btn1AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1AChair.setName("A1"); // NOI18N
        getContentPane().add(btn1AChair);
        btn1AChair.setBounds(648, 500, 40, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("6");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(610, 810, 10, 26);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PANTALLA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(840, 170, 200, 60);

        btnShowSales.setBackground(new java.awt.Color(255, 255, 255));
        btnShowSales.setForeground(new java.awt.Color(0, 0, 0));
        btnShowSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TablaVentas.png"))); // NOI18N
        btnShowSales.setText("VENTAS");
        btnShowSales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnShowSales.setContentAreaFilled(false);
        btnShowSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSalesActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowSales);
        btnShowSales.setBounds(1320, 500, 212, 123);

        btnAddSeatsFromHome.setBackground(new java.awt.Color(255, 255, 255));
        btnAddSeatsFromHome.setForeground(new java.awt.Color(0, 0, 0));
        btnAddSeatsFromHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoGrande.png"))); // NOI18N
        btnAddSeatsFromHome.setText("ASIENTOS Y CLIENTES");
        btnAddSeatsFromHome.setBorder(null);
        btnAddSeatsFromHome.setContentAreaFilled(false);
        btnAddSeatsFromHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSeatsFromHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddSeatsFromHome);
        btnAddSeatsFromHome.setBounds(330, 520, 250, 120);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pantalla.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(570, 10, 770, 450);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralIzquierda.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-80, -20, 360, 920);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralDerecha.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1520, 0, 400, 930);

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

	private void disabledButtons(){

		JButton[] buttonss = {btn1AChair, btn1BChair, btn1CChair, btn1DChair, btn1EChair, btn1FChair, btn1GChair,
            btn2AChair, btn2BChair, btn2CChair, btn2DChair, btn2EChair, btn2FChair, btn2GChair,
            btn3AChair, btn3BChair, btn3CChair, btn3DChair, btn3EChair, btn3FChair, btn3GChair,
            btn4AChair, btn4BChair, btn4CChair, btn4DChair, btn4EChair, btn4FChair, btn4GChair,
            btn5AChair, btn5BChair, btn5CChair, btn5DChair, btn5EChair, btn5FChair, btn5GChair,
            btn6AChair, btn6BChair, btn6CChair, btn6DChair, btn6EChair, btn6FChair, btn6GChair};

		ArrayList<Seat> seatDisable = seatController.seatDisponibles();

		if(seatDisable == null || seatDisable.isEmpty()){
			return;
		}

		for (JButton button : buttonss) {
			String buttonName = button.getName(); 

			for (Seat seat : seatDisable) {
				if (buttonName.equalsIgnoreCase(seat.getName())) {
					button.setEnabled(false);
					break;
				}
			}
		}
	}

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
                        seatNames.add(button.getName());
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
    private javax.swing.JButton btnSelling;
    private javax.swing.JButton btnShowSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
