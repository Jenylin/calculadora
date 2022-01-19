/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FibonacciP1;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Facundo
 */
public class SerieDeFibonnaci extends javax.swing.JFrame {

    /**
     * Creates new form SerieDeFibonnaci
     */
    public SerieDeFibonnaci() {
	initComponents();
	//this.setTitle("Serie de Fibonacci");
	
	//Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/plus1.png"));
	//this.setIconImage(icono);
	//this.setLocationRelativeTo(null);
	this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtTerminos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtArea = new javax.swing.JTextArea();
        jbtnAceptar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("FIBONACCI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ingrese un número:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 40));

        jtxtTerminos.setEditable(false);
        jtxtTerminos.setBackground(new java.awt.Color(102, 102, 102));
        jtxtTerminos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtTerminos.setForeground(new java.awt.Color(204, 204, 204));
        jtxtTerminos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtxtTerminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, 40));

        jtxtArea.setEditable(false);
        jtxtArea.setBackground(new java.awt.Color(102, 102, 102));
        jtxtArea.setColumns(20);
        jtxtArea.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jtxtArea.setForeground(new java.awt.Color(204, 204, 204));
        jtxtArea.setRows(5);
        jScrollPane1.setViewportView(jtxtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 230, 120));

        jbtnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setEnabled(false);
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 100, 30));

        jbtnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/florian-6.gif"))); // NOI18N
        jLabel1.setToolTipText("Ingrese valores numericos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed



    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
	habilitaControles(true);
	limpiaControles();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        try {
	    int a=1,b=0,c=0,n;
	    int k =0;
	    n=Integer.parseInt(jtxtTerminos.getText());

	    do{
		a=a+b;
		b=c;
		c=a;
		k++;
	    }while(a<=n);
	    
	    
	    a=1;    b=0;c=0;

		for (int i = 2; i <= k; i++) {
		a=a+b;
		b=c;
		c=a;
		
		
		if (i<k) {
		    jtxtArea.append(c+"   ,");
		}else{
		    jtxtArea.append(c+". \nSon los terminos \nde la sucesion \nanteriores o igual a: "+n);
		}
	    }

	    habilitaControles(false);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(rootPane, e);

	}




	/*
	try {
	    int a=1,b=0,c=0,n;
	    n=Integer.parseInt(jtxtTerminos.getText());
	    for (int i = 1; i <= n; i++) {
		a=a+b;
		b=c;
		c=a;
		jtxtArea.append(c+"   ,");
		
	    }

	    habilitaControles(false);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(rootPane, e);

	}
	*/

    }//GEN-LAST:event_jbtnAceptarActionPerformed

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
	    java.util.logging.Logger.getLogger(SerieDeFibonnaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(SerieDeFibonnaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(SerieDeFibonnaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(SerieDeFibonnaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new SerieDeFibonnaci().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTextArea jtxtArea;
    private javax.swing.JTextField jtxtTerminos;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
	jtxtTerminos.setEditable(b);
	jtxtArea.setEditable(b);
	jbtnAceptar.setEnabled(b);
	jbtnNuevo.setEnabled(!b);
	jtxtTerminos.grabFocus();
	
	
    }

    private void limpiaControles() {
	jtxtArea.setText(null);
	jtxtTerminos.setText(null);
    }
}
