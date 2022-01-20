/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package secuenciafibonacci;

import javax.swing.JOptionPane;
public class JFrameFibonacci extends javax.swing.JFrame {


    public JFrameFibonacci() {
        initComponents();
        jTxtArea.setEditable(false);
        setSize(200, 200);              
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea = new javax.swing.JTextArea();
        lblDatos = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fibonacci");
        setMinimumSize(new java.awt.Dimension(400, 400));
        setName("SERIE FIBONACCI"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ingresa el número  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, -1));

        jTxtArea.setColumns(20);
        jTxtArea.setRows(5);
        jScrollPane1.setViewportView(jTxtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 220, 40));

        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 28));
        getContentPane().add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, -1));

        jLabel1.setText("DATOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int n = 0, total = 0, a = 0, b = 1, detener=0;
        n=Integer.parseInt(txtN.getText());
         txtN.setText(null);
         jTxtArea.setText(null);
         String[] opciones = {
            "Normal",
            "Detener"
        };
         
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opción para generar la serie",
                "Carrera", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        
  
        if (resp.equals("Normal")) {
            for (int i = 0; i < n; i++) {
                    jTxtArea.append(String.valueOf(a)+"    ");
                    total = a + b;
                    a = b;
                    b = total;
                }
        }else if (resp.equals("Detener")) {
            detener=n;
            for (int i = 0; i < n; i++) {
                jTxtArea.append(String.valueOf(a)+"    ");
                    total = a + b;
                    a = b;
                    b = total;
                    if ( a>=detener){
                    break;
                }
                    
                }
             
        }
        
        if (detener==0) {
            detener=n;
            lblDatos.setText(" # Serie : "+n);
        }else{
            
            lblDatos.setText(" # a detener : "+detener);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFibonacci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtArea;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
