
package com.mycompany.prueba2interfas;

import operaciones.operaciones;//se envian paqueterias de la otra clase

public class ventana extends javax.swing.JFrame {

   //creacion de obj para acceder a los otros paquetes 
   operaciones opera =new operaciones(); // aqui debe ir el objeto
    
    public ventana() {
        initComponents();
        
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        b1D = new javax.swing.JButton();
        b2P = new javax.swing.JButton();
        b3E = new javax.swing.JButton();
        campo1 = new javax.swing.JTextField();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setText("divisas");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 20, 130, -1));

        b1D.setText("dolar");
        b1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1DActionPerformed(evt);
            }
        });
        jPanel1.add(b1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        b2P.setText("peso");
        b2P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2PActionPerformed(evt);
            }
        });
        jPanel1.add(b2P, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        b3E.setText("euro");
        b3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3EActionPerformed(evt);
            }
        });
        jPanel1.add(b3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, -1));
        jPanel1.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  //este es metodo de boton dolar
    private void b1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1DActionPerformed
     
       double num1=Double.parseDouble(campo1.getText()); //para capturar lo que escribira en el recuadro
       opera.dolar(num1);
       
       //mostrar resultado
       result.setText(String.valueOf(opera.resultn));
    }//GEN-LAST:event_b1DActionPerformed

    private void b2PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2PActionPerformed
        
         double num1=Double.parseDouble(campo1.getText()); //para capturar lo que escribira en el recuadro
       opera.euro(num1);
       
       //mostrar resultado
       result.setText(String.valueOf(opera.resultn));
        
    }//GEN-LAST:event_b2PActionPerformed

    private void b3EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3EActionPerformed
     
         double num1=Double.parseDouble(campo1.getText()); //para capturar lo que escribira en el recuadro
       opera.peso(num1);
       
       //mostrar resultado
       result.setText(String.valueOf(opera.resultn));
    }//GEN-LAST:event_b3EActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1D;
    private javax.swing.JButton b2P;
    private javax.swing.JButton b3E;
    private javax.swing.JTextField campo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
