/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package convertidordedivisas;
import java.awt.Image;

import java.awt.Toolkit;

/**
 *
 * @author Facundo
 */
public class ConversorDivisas extends javax.swing.JFrame {
    int cantidad = 0;
    double conversion=0;
    String de= "EUR";
    String a = "EUR";


    public ConversorDivisas() {
	
	initComponents();
/*
	this.setTitle("Conversor de Divisas");
	Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/divisas.png"));
	this.setIconImage(icono);
*/
	this.setLocationRelativeTo(null);
    }

    public String aMoneda (double cantidad, String moneda){
	return "$ "+ Math.round(cantidad*100.0)/100.0+" "+moneda;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSlider();
        lblCantidad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDe = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboA = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CANTIDAD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spnCantidad.setMajorTickSpacing(1);
        spnCantidad.setMinimum(1);
        spnCantidad.setPaintTicks(true);
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 530, 40));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCantidad.setText("1");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 50, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        cboDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "MX" }));
        cboDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDeActionPerformed(evt);
            }
        });
        getContentPane().add(cboDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("A");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        cboA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "MX" }));
        cboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAActionPerformed(evt);
            }
        });
        getContentPane().add(cboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 100, 50));

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 540, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDeActionPerformed
        de=cboDe.getSelectedItem().toString();
	convertir();
    }//GEN-LAST:event_cboDeActionPerformed

    private void cboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAActionPerformed
        de=cboA.getSelectedItem().toString();
	convertir();
    }//GEN-LAST:event_cboAActionPerformed

    public void convertir(){
	switch (de) {
	    case "EUR":
		    if (a.equals("USD")) {
			conversion=cantidad*1.16;
		}
		else if (a.equals("MXN")){
			conversion=cantidad*23.59;
		}else {
			conversion=cantidad;
			
		}
	    break;

	    case "USD":
		    if (a.equals("EUR")) {
			conversion=cantidad*0.86;
		}
		else if (a.equals("MXN")){
			conversion=cantidad*20.34;
		}else {
			conversion=cantidad;
			
		}
	    break;
	     
	    case "MXN":
		 if (a.equals("EUR")) {
			conversion=cantidad*0.042;
		}
		else if (a.equals("USD")){
			conversion=cantidad*0.049;
		}else { //mxn
			conversion=cantidad;
		}
	    break;
	}
	    lblResultado.setText(aMoneda(cantidad,de)+ "--->"+ aMoneda (conversion, a));
    }



    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        cantidad = spnCantidad.getValue();
	lblCantidad.setText(""+cantidad);
	convertir();

	



    }//GEN-LAST:event_spnCantidadStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(ConversorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new ConversorDivisas().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboA;
    private javax.swing.JComboBox<String> cboDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSlider spnCantidad;
    // End of variables declaration//GEN-END:variables
}
