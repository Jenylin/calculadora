
package apoyoescolar;
import calculadora.Calculadora;
import conversordivisas.Conversor;
import fibonacci.JFrameFibonacci;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;

import tienda.JFrameTienda;

public class apoyoEscuela extends javax.swing.JFrame {
    
    public apoyoEscuela() {
        initComponents();
        internalJFTablas.setVisible(false);
        jInternalFrame1.setVisible(false);
        txtAreaSum.setEditable(false);
        txtAreaMostrarTabla.setEditable(false);
              
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apoyoEscolar1 = new apoyoescolar.ApoyoEscolar();
        panelMenu = new javax.swing.JPanel();
        lblSumatoria = new javax.swing.JLabel();
        lblTablas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblConversor = new javax.swing.JLabel();
        lblFibonacci1 = new javax.swing.JLabel();
        lblTienda1 = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(612, 580));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelMenu.setBackground(new java.awt.Color(102, 102, 102));
        panelMenu.setMaximumSize(new java.awt.Dimension(600, 600));
        panelMenu.setMinimumSize(new java.awt.Dimension(0, 35));
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
        lblTablas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblTablasMouseMoved(evt);
            }
        });
        lblTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTablasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTablasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTablasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTablasMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apoyoescolar/Iconos/estudiante.png"))); // NOI18N

        lblConversor.setForeground(new java.awt.Color(255, 255, 255));
        lblConversor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConversor.setText("CONVERSOR");
        lblConversor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConversor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConversorMouseClicked(evt);
            }
        });

        lblFibonacci1.setForeground(new java.awt.Color(255, 255, 255));
        lblFibonacci1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFibonacci1.setText("FIBONACCI");
        lblFibonacci1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFibonacci1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFibonacci1MouseClicked(evt);
            }
        });

        lblTienda1.setForeground(new java.awt.Color(255, 255, 255));
        lblTienda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienda1.setText("TIENDA");
        lblTienda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTienda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTienda1MouseClicked(evt);
            }
        });

        lblCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        lblCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalculadora.setText("CALCULADORA");
        lblCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCalculadoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(lblConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFibonacci1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTienda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblSumatoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFibonacci1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu);

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedor.setPreferredSize(new java.awt.Dimension(550, 445));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apoyoescolar/Iconos/libros (1).png"))); // NOI18N

        internalJFTablas.setClosable(true);
        internalJFTablas.setTitle("TABLAS DE MULTIPLICAR");
        internalJFTablas.setToolTipText("");
        internalJFTablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        internalJFTablas.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        internalJFTablas.setPreferredSize(new java.awt.Dimension(550, 598));
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
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(internalJFTablasLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(internalJFTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(internalJFTablasLayout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
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
        txtAreaSum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaSum.setForeground(new java.awt.Color(0, 51, 153));
        txtAreaSum.setRows(5);
        jScrollPane2.setViewportView(txtAreaSum);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                        .addContainerGap(150, Short.MAX_VALUE))))
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
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addComponent(internalJFTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(internalJFTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(0, 194, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 194, Short.MAX_VALUE)))
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

    private void lblTablasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTablasMousePressed
       
    }//GEN-LAST:event_lblTablasMousePressed

    private void lblTablasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTablasMouseEntered
        
    }//GEN-LAST:event_lblTablasMouseEntered

    private void lblTablasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTablasMouseExited
        
    }//GEN-LAST:event_lblTablasMouseExited

    private void lblTablasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTablasMouseMoved

    }//GEN-LAST:event_lblTablasMouseMoved

    private void lblConversorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConversorMouseClicked
        Conversor ver=new Conversor(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         ver.setVisible(true); 
         ver.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         ver.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_lblConversorMouseClicked

    private void lblFibonacci1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFibonacci1MouseClicked
        JFrameFibonacci ver=new JFrameFibonacci(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         ver.setVisible(true); 
         ver.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         ver.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblFibonacci1MouseClicked

    private void lblTienda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienda1MouseClicked
        JFrameTienda ver=new JFrameTienda(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         ver.setVisible(true); 
         ver.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         ver.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblTienda1MouseClicked

    private void lblCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalculadoraMouseClicked
        Calculadora ver=new Calculadora(); 
         //línea 2-hacemos visible el formulario que queremos llamar 
         ver.setVisible(true); 
         ver.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         ver.setLocationRelativeTo(null);
         lblCalculadora.setOpaque(true);
         lblCalculadora.repaint();
    }//GEN-LAST:event_lblCalculadoraMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apoyoEscuela().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private apoyoescolar.ApoyoEscolar apoyoEscolar1;
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
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JLabel lblConversor;
    private javax.swing.JLabel lblFibonacci1;
    private javax.swing.JLabel lblSumatoria;
    private javax.swing.JLabel lblTablas;
    private javax.swing.JLabel lblTienda1;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextArea txtAreaMostrarTabla;
    private javax.swing.JTextArea txtAreaSum;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
