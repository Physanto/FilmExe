
package view;

import controller.PersonController;

/**
 *
 * @author initmanfig
 */
public class FrmMain extends javax.swing.JFrame {


	public FrmMain() {
		initComponents();
	}


	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertPerson = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setName("FrmMain"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        btnInsertPerson.setText("jButton1");
        btnInsertPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(699, Short.MAX_VALUE)
                .addComponent(btnInsertPerson)
                .addGap(571, 571, 571))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnInsertPerson)
                .addContainerGap(700, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertPersonActionPerformed
		PersonController personController = new PersonController();
		personController.iew Person(txtId.getText(), txnsertPerson(new Person(txtId.getText(), tx));
    }//GEN-LAST:event_btnInsertPersonActionPerformed

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrmMain().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertPerson;
    // End of variables declaration//GEN-END:variables
}
