
package domain;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    KeyListener teclado = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
            
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            
        }
    };
            
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnPorsentaje = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnBorraUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperacion.setPreferredSize(new java.awt.Dimension(65, 25));
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 30));

        txtResultado.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setPreferredSize(new java.awt.Dimension(65, 25));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUno.setBackground(new java.awt.Color(249, 248, 248));
        btnUno.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnUno.setForeground(new java.awt.Color(102, 102, 102));
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 50));

        btnDos.setBackground(new java.awt.Color(249, 248, 248));
        btnDos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDos.setForeground(new java.awt.Color(102, 102, 102));
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, 50));

        btnTres.setBackground(new java.awt.Color(249, 248, 248));
        btnTres.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnTres.setForeground(new java.awt.Color(102, 102, 102));
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 50, 50));

        btnDivision.setBackground(new java.awt.Color(249, 248, 248));
        btnDivision.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(102, 102, 102));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, 50));

        btnCuatro.setBackground(new java.awt.Color(249, 248, 248));
        btnCuatro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(102, 102, 102));
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 50));

        btnCinco.setBackground(new java.awt.Color(249, 248, 248));
        btnCinco.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(102, 102, 102));
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, 50));

        btnSeis.setBackground(new java.awt.Color(249, 248, 248));
        btnSeis.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(102, 102, 102));
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, 50));

        btnMult.setBackground(new java.awt.Color(249, 248, 248));
        btnMult.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMult.setForeground(new java.awt.Color(102, 102, 102));
        btnMult.setText("X");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        jPanel2.add(btnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, 50));

        btnSiete.setBackground(new java.awt.Color(249, 248, 248));
        btnSiete.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(102, 102, 102));
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        btnOcho.setBackground(new java.awt.Color(249, 248, 248));
        btnOcho.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(102, 102, 102));
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 50));

        btnNueve.setBackground(new java.awt.Color(249, 248, 248));
        btnNueve.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(102, 102, 102));
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, 50));

        btnMenos.setBackground(new java.awt.Color(249, 248, 248));
        btnMenos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(102, 102, 102));
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 50, 50));

        btnCero.setBackground(new java.awt.Color(249, 248, 248));
        btnCero.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCero.setForeground(new java.awt.Color(102, 102, 102));
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 50));

        btnPunto.setBackground(new java.awt.Color(249, 248, 248));
        btnPunto.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(102, 102, 102));
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, 50));

        btnPorsentaje.setBackground(new java.awt.Color(249, 248, 248));
        btnPorsentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPorsentaje.setForeground(new java.awt.Color(102, 102, 102));
        btnPorsentaje.setText("%");
        btnPorsentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorsentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorsentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 50));

        btnMas.setBackground(new java.awt.Color(249, 248, 248));
        btnMas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMas.setForeground(new java.awt.Color(102, 102, 102));
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel2.add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 50, 50));

        btnResultado.setBackground(new java.awt.Color(102, 255, 102));
        btnResultado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(248, 244, 244));
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 50));

        btnBorrar.setBackground(new java.awt.Color(249, 248, 248));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(102, 102, 102));
        btnBorrar.setText("C");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        btnBorraUltimo.setBackground(new java.awt.Color(249, 248, 248));
        btnBorraUltimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorraUltimo.setForeground(new java.awt.Color(102, 102, 102));
        btnBorraUltimo.setText("<-");
        btnBorraUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorraUltimoActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorraUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        this.addNumber("8");
        btnResultado.doClick();
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        this.addNumber("1");
        btnResultado.doClick();
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        addNumber("2");
        btnResultado.doClick();
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        this.addNumber("3");
        btnResultado.doClick();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
       this.addNumber("4");
       btnResultado.doClick();
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
       this.addNumber("5");
       btnResultado.doClick();
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        this.addNumber("6");
        btnResultado.doClick();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        this.addNumber("*");
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        this.addNumber("7");
        btnResultado.doClick();
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        this.addNumber("9");
        btnResultado.doClick();
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
       this.addNumber("-");
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        this.addNumber("0");
        btnResultado.doClick();
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        this.addNumber(".");
        btnResultado.doClick();
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnPorsentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorsentajeActionPerformed
        this.addNumber("%");
    }//GEN-LAST:event_btnPorsentajeActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        this.addNumber("+");
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (ScriptException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            btnBorrar.doClick();
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.txtOperacion.setText("");
        this.txtResultado.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        this.addNumber("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnBorraUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorraUltimoActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btnResultado.doClick();
    }//GEN-LAST:event_btnBorraUltimoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void addNumber(String digito){
        this.txtOperacion.setText(this.txtOperacion.getText()+digito);
    }

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorraUltimo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorsentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
