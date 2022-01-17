
package apoyoescolar;

import javax.swing.JInternalFrame;

public class apoyoEscuela extends javax.swing.JFrame {

    /**
     * Creates new form apoyoEscuela
     */
    public apoyoEscuela() {
        initComponents();
        internalJFTablas.setVisible(false);
        jInternalFrame1.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        lblSumatoria = new javax.swing.JLabel();
        lblTablas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        internalJFTablas = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMostrarTabla = new javax.swing.JTextArea();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSum = new javax.swing.JTextArea();
        txtNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(612, 525));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelMenu.setBackground(new java.awt.Color(102, 102, 102));
        panelMenu.setMaximumSize(new java.awt.Dimension(600, 600));
        panelMenu.setMinimumSize(new java.awt.Dimension(0, 35));
        panelMenu.setPreferredSize(new java.awt.Dimension(85, 25));
        panelMenu.setRequestFocusEnabled(false);

        lblSumatoria.setForeground(new java.awt.Color(255, 255, 255));
        lblSumatoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumatoria.setText("SUMATORIA");
        lblSumatoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSumatoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSumatoriaMouseClicked(evt);
            }
        });

        lblTablas.setForeground(new java.awt.Color(255, 255, 255));
        lblTablas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTablas.setText("TABLAS");
        lblTablas.setToolTipText("");
        lblTablas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblTablas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTablasMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apoyoescolar/Iconos/estudiante.png"))); // NOI18N

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSumatoria, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblTablas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(86, 86, 86)
                .addComponent(lblSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMenuLayout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(lblTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );

        getContentPane().add(panelMenu);

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedor.setPreferredSize(new java.awt.Dimension(550, 4543));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apoyoescolar/Iconos/libros (1).png"))); // NOI18N

        internalJFTablas.setClosable(true);
        internalJFTablas.setTitle("TABALAS DE MULTIPLICAR");
        internalJFTablas.setToolTipText("");
        internalJFTablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        internalJFTablas.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        internalJFTablas.setMinimumSize(new java.awt.Dimension(91, 33));
        internalJFTablas.setNormalBounds(new java.awt.Rectangle(0, 0, 91, 0));
        internalJFTablas.setPreferredSize(new java.awt.Dimension(592, 4491));
        internalJFTablas.setVisible(true);

        jLabel3.setText("Nùmero a multiplicar");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtAreaMostrarTabla.setColumns(5);
        txtAreaMostrarTabla.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        txtAreaMostrarTabla.setForeground(new java.awt.Color(0, 51, 204));
        txtAreaMostrarTabla.setRows(10);
        jScrollPane1.setViewportView(txtAreaMostrarTabla);

        javax.swing.GroupLayout internalJFTablasLayout = new javax.swing.GroupLayout(internalJFTablas.getContentPane());
        internalJFTablas.getContentPane().setLayout(internalJFTablasLayout);
        internalJFTablasLayout.setHorizontalGroup(
            internalJFTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalJFTablasLayout.createSequentialGroup()
                .addGroup(internalJFTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalJFTablasLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(internalJFTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(internalJFTablasLayout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(internalJFTablasLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        internalJFTablasLayout.setVerticalGroup(
            internalJFTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalJFTablasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(internalJFTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 4384, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("SUMATORIA");
        jInternalFrame1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jInternalFrame1.setVisible(true);

        jLabel4.setText("Nùmero a sumar");

        btnSumar.setText("SUMAR");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        txtAreaSum.setColumns(20);
        txtAreaSum.setRows(5);
        jScrollPane2.setViewportView(txtAreaSum);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESULTADO");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(146, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumar))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(4185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(internalJFTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(0, 211, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 211, Short.MAX_VALUE)))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(internalJFTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 4521, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(0, 2207, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 2208, Short.MAX_VALUE)))
        );

        getContentPane().add(panelContenedor);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
           int numero= Integer.parseInt(txtNumero.getText());
           txtAreaMostrarTabla .setText(null);
        for (int i = 1; i < 11; i++) {
            txtAreaMostrarTabla.append("\t"+ numero+" X "+ i + " = " + numero*i + "\n" );
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        int numero= Integer.parseInt(txtNum.getText());
        int suma=0;
        txtAreaSum.setText(null);
        for (int i = 1; i < numero+1; i++) {
            
            suma= suma+i;
            System.out.println(suma);
            txtAreaSum.append(i+"+");
            jLabel2.setText("Total de la suma : "+String.valueOf(suma));
        }
        
    }//GEN-LAST:event_btnSumarActionPerformed

    private void lblTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTablasMouseClicked
       internalJFTablas.setVisible(true);
      
    }//GEN-LAST:event_lblTablasMouseClicked

    private void lblSumatoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSumatoriaMouseClicked
         jInternalFrame1.setVisible(true);
       
    }//GEN-LAST:event_lblSumatoriaMouseClicked

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
            java.util.logging.Logger.getLogger(apoyoEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apoyoEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apoyoEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apoyoEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apoyoEscuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSumar;
    private javax.swing.JInternalFrame internalJFTablas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSumatoria;
    private javax.swing.JLabel lblTablas;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextArea txtAreaMostrarTabla;
    private javax.swing.JTextArea txtAreaSum;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
