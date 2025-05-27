package view;

import controller.PersonController;
import controller.SaleController;
import controller.SeatController;
import controller.SeatSaleController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.Sale;
import model.Seat;

public class FrmSelling extends javax.swing.JFrame {

    private ArrayList<String> seatNames;
    private PersonController personController;
	private SeatController seatController;
	private SaleController saleController;
	private int[] idSeats;
	private SeatSaleController seatSaleController;
	private Person persons;
	private Sale sales;
	private ArrayList<Seat> seats;
	
    public FrmSelling(ArrayList<String> seatNames) {

        initComponents();
		pnlReceipt.setVisible(false);
        personController = new PersonController();
		seatController = new SeatController();
		saleController = new SaleController();
		seatSaleController = new SeatSaleController();
        this.seatNames = seatNames;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        btnGetBackHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOutClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		txtChairPrice.setText("20000");
		showSelectedSeats();
		getIdSeats();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSell = new javax.swing.JButton();
        btnGetBackHome = new javax.swing.JButton();
        btnLogOutClient = new javax.swing.JButton();
        btnSearchClient = new javax.swing.JButton();
        txtClientCCSearching = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSelectedSeats = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtChairPrice = new javax.swing.JTextField();
        txtChairName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        txtStardDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtChairDiscount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClientCC = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        txtClientLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClientPhone = new javax.swing.JTextField();
        txtClientAddress = new javax.swing.JTextField();
        txtClientEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlReceipt = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        btnSell.setBackground(new java.awt.Color(0, 0, 0));
        btnSell.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVender.png"))); // NOI18N
        btnSell.setText("VENDER");
        btnSell.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        btnSell.setContentAreaFilled(false);
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });
        getContentPane().add(btnSell);
        btnSell.setBounds(690, 800, 160, 102);

        btnGetBackHome.setBackground(new java.awt.Color(255, 255, 255));
        btnGetBackHome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnGetBackHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVolver.png"))); // NOI18N
        btnGetBackHome.setText("VOLVER");
        btnGetBackHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGetBackHome.setContentAreaFilled(false);
        btnGetBackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBackHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnGetBackHome);
        btnGetBackHome.setBounds(70, 870, 170, 102);

        btnLogOutClient.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnLogOutClient.setText("Registrar Cliente");
        btnLogOutClient.setContentAreaFilled(false);
        btnLogOutClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOutClient);
        btnLogOutClient.setBounds(1150, 670, 150, 23);

        btnSearchClient.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSearchClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoLupa.png"))); // NOI18N
        btnSearchClient.setText("Buscar");
        btnSearchClient.setContentAreaFilled(false);
        btnSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchClient);
        btnSearchClient.setBounds(1170, 430, 150, 50);
        getContentPane().add(txtClientCCSearching);
        txtClientCCSearching.setBounds(1150, 390, 189, 23);

        jLabel7.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel7.setText("Ingresa la cedula del cliente");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1140, 340, 260, 23);

        listSelectedSeats.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(listSelectedSeats);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 450, 78, 157);

        jLabel8.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel8.setText("Asientos Seleccionados");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 370, 220, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoGrande.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Impact", 3, 20)); // NOI18N
        jLabel2.setText("Silla Solicitada");

        txtChairPrice.setEnabled(false);

        txtChairName.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel6.setText("Datos silla solicitada");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Descuento");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Precio Base");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Fecha Inicial");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Fecha Final");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtChairPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChairName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtChairDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(txtChairName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChairPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtChairDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStardDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 160, 310, 530);

        jLabel3.setFont(new java.awt.Font("Impact", 3, 20)); // NOI18N
        jLabel3.setText("Datos cliente");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoPersona.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel5.setText("Ingrese los datos del cliente");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("CC");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nombre");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Apellido");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Telefono");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Direccion");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClientCC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel16)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtClientPhone)
                                    .addComponent(txtClientLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientCC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(700, 180, 400, 560);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(340, 400, 32, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoPersona.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(1170, 560, 100, 100);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralIzquierda.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(-90, 0, 370, 910);

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setText("Cliente:");

        jLabel23.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 14)); // NOI18N
        jLabel23.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setText("Cedula");

        jLabel25.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 14)); // NOI18N
        jLabel25.setText("jLabel25");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setText("Email:");

        jLabel27.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 14)); // NOI18N
        jLabel27.setText("jLabel27");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setText("Total");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setText("Fecha Inicio:");

        jLabel30.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 14)); // NOI18N
        jLabel30.setText("jLabel30");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setText("Fecha Fin:");

        jLabel32.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 14)); // NOI18N
        jLabel32.setText("jLabel32");

        jLabel33.setFont(new java.awt.Font("CaskaydiaCove NF", 0, 14)); // NOI18N
        jLabel33.setText("jLabel33");

        jLabel34.setFont(new java.awt.Font("CaskaydiaCove NF", 1, 24)); // NOI18N
        jLabel34.setText("ASIENTOS COMPRADOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jLabel35.setFont(new java.awt.Font("CaskaydiaCove NF", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 204, 0));
        jLabel35.setText("RECIBO FILMEXE");

        javax.swing.GroupLayout pnlReceiptLayout = new javax.swing.GroupLayout(pnlReceipt);
        pnlReceipt.setLayout(pnlReceiptLayout);
        pnlReceiptLayout.setHorizontalGroup(
            pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceiptLayout.createSequentialGroup()
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReceiptLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(pnlReceiptLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReceiptLayout.createSequentialGroup()
                                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addGroup(pnlReceiptLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel28))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)))))
                    .addGroup(pnlReceiptLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlReceiptLayout.setVerticalGroup(
            pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReceiptLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(26, 26, 26)
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(26, 26, 26)
                .addGroup(pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel33))
                .addGap(36, 36, 36)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(pnlReceipt);
        pnlReceipt.setBounds(1350, 150, 380, 559);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralDerecha.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(1520, 0, 430, 900);

        jLabel37.setFont(new java.awt.Font("CaskaydiaCove NF", 3, 40)); // NOI18N
        jLabel37.setText("VENTA DE ASIENTOS PARA LA FUNCION");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(540, 30, 780, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetBackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBackHomeActionPerformed
        FrmCinemaManagement home = new FrmCinemaManagement();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGetBackHomeActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        if (Validator.isEmpty(txtClientCC.getText()) || Validator.isEmpty(txtClientName.getText())
                || Validator.isEmpty(txtClientLastName.getText()) || Validator.isEmpty(txtClientPhone.getText())
                || Validator.isEmpty(txtClientAddress.getText()) || Validator.isEmpty(txtClientEmail.getText()) || Validator.isEmpty(txtChairDiscount.getText())) {
            JOptionPane.showMessageDialog(this, "Llena todos los campos del cliente para realizar la venta");
            return;
        }
        if (!Validator.lengthBetween(txtClientCC.getText(), 8, 10) || !Validator.lengthBetween(txtClientName.getText(), 4, 15)
                || !Validator.lengthBetween(txtClientLastName.getText(), 4, 20) || !Validator.lengthBetween(txtClientPhone.getText(), 10, 15)
                || !Validator.lengthBetween(txtClientAddress.getText(), 10, 200) || !Validator.lengthBetween(txtClientEmail.getText(), 10, 255)) {
            JOptionPane.showMessageDialog(this, "Verifique la longitud de los datos");
            return;
       	}
        if(!Validator.isNumber(txtChairPrice.getText()) && !Validator.isNumberPositive(txtChairPrice.getText())){
            JOptionPane.showMessageDialog(this, "Ingresa datos validos");
            return;
        }

		makeSeal();
		makeSaleSeat();
		updateSaleTotal();
		showReceipt();

        //FrmReceipt receipt = new FrmReceipt();
        //receipt.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnSellActionPerformed

	private void makeSeal(){

		Person person = searchPerson();

		if(person == null) return;	

		System.out.println("el id es " + person.getId());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		boolean checkSale = saleController.makeSale(new Sale(0, LocalDateTime.parse(txtStardDate.getText(), formatter), 
				LocalDateTime.parse(txtEndDate.getText(), formatter)), person.getId());

		if(checkSale) System.out.println("Venta realizada");
	}

	private double calculateTotalSaleSeat(){	
		
		try {
			double discount = Double.parseDouble(txtChairDiscount.getText());
			return searchSeats().get(0).getPrice() - discount;
		} 
		catch (Exception e) {
		}
		return 20000;
	}	

	private void updateSaleTotal(){
		saleController.updateSaleTotal(searchSale().getId());
	}

	//metodo que se va usar, tenerl en cuenta
	private double calculateTotalSaleSeats(){	
		ArrayList<Seat> seats = searchSeats();

		double total = 0;
		for(Seat seat : seats){
			total = total + seat.getPrice();
		}
		return total;
	}	

	private void makeSaleSeat(){
		Sale sale = searchSale();

		if(sale == null) {
			System.out.println("No se encontro la venta con esa cedula del cliente");
			return;
		}

		boolean checkSeatSale = seatSaleController.insertSeatSale(sale.getId(), idSeats, calculateTotalSaleSeat());

		if(checkSeatSale) System.out.println("Venta Asiento realizada");
	}

    private void btnLogOutClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutClientActionPerformed
        FrmLogOutClient logOut = new FrmLogOutClient();
        logOut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutClientActionPerformed

    private void btnSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientActionPerformed
        if(txtClientCCSearching.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Llene el campo con los datos del cliente");
            return;
        }

        Person person = searchPerson();

        if(person == null){
            int option = JOptionPane.showConfirmDialog(this, "Persona no registrada con esa identificacion, ¿Desea registrarlo?");

            if(option == 0){
                FrmLogOutClient register = new FrmLogOutClient();
                register.setVisible(true);
                this.dispose();
            }
            return;
        }
        txtClientCC.setText(person.getCc());
        txtClientName.setText(person.getName());
        txtClientLastName.setText(person.getLastName());
        txtClientPhone.setText(person.getPhone());
        txtClientAddress.setText(person.getAdress());
        txtClientEmail.setText(person.getEmail());
    }//GEN-LAST:event_btnSearchClientActionPerformed

	private Person searchPerson(){
		persons = personController.searchPerson(txtClientCCSearching.getText()); 
		return persons; 
	}

	private Sale searchSale(){	
		sales = saleController.searchSales(searchPerson().getId()); 
		System.out.println("valor de la venta " + sales.getTotal());
		return sales;
	}

	private void showSelectedSeats(){
		String[] names = new String[seatNames.size()];
		String concat = "";

		for(int i = 0; i < seatNames.size(); i++){
			names[i] = seatNames.get(i);
			concat += names[i] + ", ";	
		}

		listSelectedSeats.setListData(names);
		txtChairName.setText(concat);
	}

	private ArrayList<Seat> searchSeats(){	
		seats = seatController.searchSeats(seatNames);
		return seats;
	}
	private void getIdSeats(){

		ArrayList<Seat> seats = searchSeats();
		idSeats = new int[seats.size()];

		for(int i = 0; i < seats.size(); i++){		
			
			if(seats.get(i) == null) continue;
			idSeats[i] = seats.get(i).getId();
			System.out.println("asiento encontrado" + idSeats[i]);
		}
	}

	private void showReceipt(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		jLabel23.setText(persons.getName());
		jLabel25.setText(persons.getCc());
		jLabel27.setText(persons.getEmail());
		jLabel30.setText(sales.getStar_date().format(formatter));
		jLabel32.setText(sales.getEnd_date().format(formatter));
		jLabel33.setText(String.valueOf(searchSale().getTotal()));
		tableSeats();
		pnlReceipt.setVisible(true);
		JOptionPane.showConfirmDialog(this, pnlReceipt);
	}

	private void tableSeats(){
		String[] columnNames = {"Nombre", "Precio"};
		Object[][] data = new Object[seats.size()][2];
		int i = 0;
		for(Seat seat : seats){
			data[i][0] = seat.getName();
			data[i][1] = seat.getPrice();
			i++;
		}
		DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnNames);
		jTable1.setModel(defaultTableModel);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetBackHome;
    private javax.swing.JButton btnLogOutClient;
    private javax.swing.JButton btnSearchClient;
    private javax.swing.JButton btnSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listSelectedSeats;
    private javax.swing.JPanel pnlReceipt;
    private javax.swing.JTextField txtChairDiscount;
    private javax.swing.JTextField txtChairName;
    private javax.swing.JTextField txtChairPrice;
    private javax.swing.JTextField txtClientAddress;
    private javax.swing.JTextField txtClientCC;
    private javax.swing.JTextField txtClientCCSearching;
    private javax.swing.JTextField txtClientEmail;
    private javax.swing.JTextField txtClientLastName;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientPhone;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtStardDate;
    // End of variables declaration//GEN-END:variables
}
