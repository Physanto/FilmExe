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
        btn1BChair.setBounds(540, 470, 38, 39);

        btn1CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1CChair.setName("C1"); // NOI18N
        getContentPane().add(btn1CChair);
        btn1CChair.setBounds(620, 470, 38, 39);

        btn1DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1DChair.setName("D1"); // NOI18N
        getContentPane().add(btn1DChair);
        btn1DChair.setBounds(700, 470, 38, 39);

        btn1EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1EChair.setName("E1"); // NOI18N
        getContentPane().add(btn1EChair);
        btn1EChair.setBounds(780, 470, 38, 39);

        btn1FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1FChair.setName("F1"); // NOI18N
        getContentPane().add(btn1FChair);
        btn1FChair.setBounds(870, 470, 38, 39);

        btn1GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1GChair.setName("G1"); // NOI18N
        getContentPane().add(btn1GChair);
        btn1GChair.setBounds(970, 470, 38, 39);

        btn2AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2AChair.setName("A2"); // NOI18N
        getContentPane().add(btn2AChair);
        btn2AChair.setBounds(450, 530, 38, 39);

        btn2BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2BChair.setName("B2"); // NOI18N
        getContentPane().add(btn2BChair);
        btn2BChair.setBounds(540, 530, 38, 39);

        btn2CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2CChair.setName("C2"); // NOI18N
        getContentPane().add(btn2CChair);
        btn2CChair.setBounds(620, 530, 38, 39);

        btn2DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2DChair.setName("D2"); // NOI18N
        getContentPane().add(btn2DChair);
        btn2DChair.setBounds(700, 530, 38, 39);

        btn2EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2EChair.setName("E2"); // NOI18N
        getContentPane().add(btn2EChair);
        btn2EChair.setBounds(780, 530, 38, 39);

        btn2FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2FChair.setName("F2"); // NOI18N
        getContentPane().add(btn2FChair);
        btn2FChair.setBounds(870, 530, 38, 39);

        btn2GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn2GChair.setName("G2"); // NOI18N
        getContentPane().add(btn2GChair);
        btn2GChair.setBounds(970, 530, 38, 39);

        btn3EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3EChair.setName("E3"); // NOI18N
        getContentPane().add(btn3EChair);
        btn3EChair.setBounds(780, 590, 38, 39);

        btn3FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3FChair.setName("F3"); // NOI18N
        getContentPane().add(btn3FChair);
        btn3FChair.setBounds(870, 590, 38, 39);

        btn3GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3GChair.setName("G3"); // NOI18N
        getContentPane().add(btn3GChair);
        btn3GChair.setBounds(970, 590, 38, 39);

        btn3AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3AChair.setName("A3"); // NOI18N
        getContentPane().add(btn3AChair);
        btn3AChair.setBounds(450, 590, 38, 39);

        btn3BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3BChair.setName("B3"); // NOI18N
        getContentPane().add(btn3BChair);
        btn3BChair.setBounds(540, 590, 38, 39);

        btn3CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3CChair.setName("C3"); // NOI18N
        getContentPane().add(btn3CChair);
        btn3CChair.setBounds(620, 590, 38, 39);

        btn3DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn3DChair.setName("D3"); // NOI18N
        getContentPane().add(btn3DChair);
        btn3DChair.setBounds(700, 590, 38, 39);

        btn4EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4EChair.setName("E4"); // NOI18N
        getContentPane().add(btn4EChair);
        btn4EChair.setBounds(780, 640, 38, 39);

        btn4GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4GChair.setName("G4"); // NOI18N
        getContentPane().add(btn4GChair);
        btn4GChair.setBounds(970, 640, 38, 39);

        btn4FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4FChair.setName("F4"); // NOI18N
        getContentPane().add(btn4FChair);
        btn4FChair.setBounds(870, 640, 38, 39);

        btn4DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4DChair.setName("D4"); // NOI18N
        getContentPane().add(btn4DChair);
        btn4DChair.setBounds(700, 640, 38, 39);

        btn4AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4AChair.setName("A4"); // NOI18N
        getContentPane().add(btn4AChair);
        btn4AChair.setBounds(450, 640, 38, 39);

        btn4BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4BChair.setName("B4"); // NOI18N
        getContentPane().add(btn4BChair);
        btn4BChair.setBounds(540, 640, 38, 39);

        btn4CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn4CChair.setName("C4"); // NOI18N
        getContentPane().add(btn4CChair);
        btn4CChair.setBounds(620, 640, 38, 39);

        btn5FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5FChair.setName("F5"); // NOI18N
        getContentPane().add(btn5FChair);
        btn5FChair.setBounds(870, 700, 38, 39);

        btn5EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5EChair.setName("E5"); // NOI18N
        getContentPane().add(btn5EChair);
        btn5EChair.setBounds(780, 700, 38, 39);

        btn5GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5GChair.setName("G5"); // NOI18N
        getContentPane().add(btn5GChair);
        btn5GChair.setBounds(970, 700, 38, 39);

        btn5DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5DChair.setName("D5"); // NOI18N
        getContentPane().add(btn5DChair);
        btn5DChair.setBounds(700, 700, 38, 39);

        btn5AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5AChair.setName("A5"); // NOI18N
        getContentPane().add(btn5AChair);
        btn5AChair.setBounds(450, 700, 38, 39);

        btn5BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5BChair.setName("B5"); // NOI18N
        getContentPane().add(btn5BChair);
        btn5BChair.setBounds(540, 700, 38, 39);

        btn5CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn5CChair.setName("C5"); // NOI18N
        getContentPane().add(btn5CChair);
        btn5CChair.setBounds(620, 700, 38, 39);

        btn6FChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6FChair.setName("F6"); // NOI18N
        getContentPane().add(btn6FChair);
        btn6FChair.setBounds(870, 760, 38, 39);

        btn6EChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6EChair.setName("E6"); // NOI18N
        getContentPane().add(btn6EChair);
        btn6EChair.setBounds(780, 760, 38, 39);

        btn6GChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6GChair.setName("G6"); // NOI18N
        getContentPane().add(btn6GChair);
        btn6GChair.setBounds(970, 760, 38, 39);

        btn6DChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6DChair.setName("D6"); // NOI18N
        getContentPane().add(btn6DChair);
        btn6DChair.setBounds(700, 760, 38, 39);

        btn6AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6AChair.setName("A6"); // NOI18N
        getContentPane().add(btn6AChair);
        btn6AChair.setBounds(450, 760, 38, 39);

        btn6BChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6BChair.setName("B6"); // NOI18N
        getContentPane().add(btn6BChair);
        btn6BChair.setBounds(540, 760, 38, 39);

        btn6CChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn6CChair.setName("C6"); // NOI18N
        getContentPane().add(btn6CChair);
        btn6CChair.setBounds(620, 760, 38, 39);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("A");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 440, 12, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("B");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 440, 10, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("C");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 440, 11, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("D");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(700, 440, 13, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("E");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 440, 20, 25);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("F");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(870, 440, 9, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("G");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(970, 440, 20, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 470, 10, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("2");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 530, 10, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("3");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(410, 590, 10, 25);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("4");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(410, 640, 10, 25);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("5");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 700, 10, 25);

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
        btnSelling.setBounds(1070, 660, 212, 123);

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
        btnExit.setBounds(130, 680, 212, 123);

        btn1AChair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        btn1AChair.setName("A1"); // NOI18N
        getContentPane().add(btn1AChair);
        btn1AChair.setBounds(450, 470, 38, 39);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("6");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(410, 760, 10, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PANTALLA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(680, 200, 100, 25);

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
        btnShowSales.setBounds(1060, 490, 212, 123);

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
        btnAddSeatsFromHome.setBounds(120, 510, 250, 120);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pantalla.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(370, 10, 730, 420);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralIzquierda.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-80, -20, 360, 920);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralDerecha.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1200, -10, 400, 930);

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
