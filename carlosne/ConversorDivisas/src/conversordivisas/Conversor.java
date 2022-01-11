/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordivisas;

/**
 *
 * @author AriesCool Vj
 */
public class Conversor extends javax.swing.JFrame {

    /**
     * Creates new form Conversor
     */
    public Conversor() {
        initComponents();
    }
   double cantidad=0,conversion=0;
   String de="USD",a="USD";
   
   public void convertir(){
       cantidad= Double.parseDouble(txtCantidad.getText());
        switch(de)
            {
               case "USD" :
                   if (a.equals("EUR")) {
                       conversion=cantidad*0.88;
                   }else if (a.equals("MNX")) {
                       conversion=cantidad*20.36;
                   }else{
                       conversion=cantidad;
                   }
                
                  break; 

               case "EUR" :
                   if (a.equals("USD")) {
                       conversion=cantidad*1.14;
                   }else if (a.equals("MNX")) {
                       conversion=cantidad*23.14;
                   }else{
                       conversion=cantidad;
                   }
                  break; 
                  
              case "MNX" :
                  if (a.equals("USD")) {
                       conversion=cantidad*0.049;
                   }else if (a.equals("EUR")) {
                       conversion=cantidad*0.043;
                   }else{
                       conversion=cantidad;
                   }
                  break; // break es opcional

            }

    lblResultado.setText("La conversion es :"+String.valueOf(conversion));
}
        
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cboDe = new javax.swing.JComboBox<>();
        cboA = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel1.setText("Cantidad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("De");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setText("A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        cboDe.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "MNX" }));
        cboDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDeActionPerformed(evt);
            }
        });
        getContentPane().add(cboDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        cboA.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "MNX" }));
        cboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAActionPerformed(evt);
            }
        });
        getContentPane().add(cboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        btnConvertir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblResultado.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        
        convertir();
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void cboDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDeActionPerformed
        de=cboDe.getSelectedItem().toString();
    }//GEN-LAST:event_cboDeActionPerformed

    private void cboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAActionPerformed
        a=cboA.getSelectedItem().toString();
    }//GEN-LAST:event_cboAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
        
      
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cboA;
    private javax.swing.JComboBox<String> cboDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
