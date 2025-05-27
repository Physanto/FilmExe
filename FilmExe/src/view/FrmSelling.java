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

    public FrmSelling(ArrayList<String> seatNames) {

        initComponents();
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
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        btnSell.setBackground(new java.awt.Color(0, 0, 0));
        btnSell.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoBotonVender.png"))); // NOI18N
        btnSell.setText("VENDER");
        btnSell.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnSell.setContentAreaFilled(false);
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });
        getContentPane().add(btnSell);
        btnSell.setBounds(670, 716, 160, 102);

        btnGetBackHome.setBackground(new java.awt.Color(255, 255, 255));
        btnGetBackHome.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
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
        btnGetBackHome.setBounds(100, 680, 170, 102);

        btnLogOutClient.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnLogOutClient.setText("Registrar Cliente");
        btnLogOutClient.setContentAreaFilled(false);
        btnLogOutClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOutClient);
        btnLogOutClient.setBounds(1110, 570, 150, 23);

        btnSearchClient.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnSearchClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoLupa.png"))); // NOI18N
        btnSearchClient.setText("Buscar");
        btnSearchClient.setContentAreaFilled(false);
        btnSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchClient);
        btnSearchClient.setBounds(1110, 340, 140, 39);
        getContentPane().add(txtClientCCSearching);
        txtClientCCSearching.setBounds(1100, 300, 189, 22);

        jLabel7.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel7.setText("Ingresa la cedula del cliente");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1080, 270, 260, 23);

        jScrollPane1.setViewportView(listSelectedSeats);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 360, 78, 157);

        jLabel8.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel8.setText("Asientos Seleccionados");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 280, 220, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoGrande.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(txtChairPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtChairDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(txtStardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChairName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addComponent(txtChairName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtChairPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtChairDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtStardDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 70, 310, 530);

        jLabel3.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
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
                                .addGap(108, 108, 108)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtClientCC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel14)
                                .addGap(24, 24, 24)
                                .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtClientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(jLabel16)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
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
        jPanel2.setBounds(650, 90, 400, 560);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoAsientoPequeño.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(290, 310, 32, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoPersona.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(1140, 460, 100, 100);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralIzquierda.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(-90, 0, 370, 910);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CortinaLateralDerecha.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(1220, -20, 390, 910);

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
		return searchSeats().get(0).getPrice()- Double.parseDouble(txtChairPrice.getText());
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
		return personController.searchPerson(txtClientCCSearching.getText());
	}

	private Sale searchSale(){	
		return saleController.searchSale(searchPerson().getId());
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
		return seatController.searchSeats(seatNames);
	}

	/**
	 * method that search in the list seats y return all id for are compared with the sale
	 */
	private void getIdSeats(){

		ArrayList<Seat> seats = searchSeats();
		idSeats = new int[seats.size()];

		for(int i = 0; i < seats.size(); i++){		
			
			if(seats.get(i) == null) continue;
			idSeats[i] = seats.get(i).getId();
			System.out.println("asiento encontrado" + idSeats[i]);
		}
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listSelectedSeats;
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
