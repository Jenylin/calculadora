package tienda;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameTienda extends javax.swing.JFrame {

    double precio = 0;
    int cantidad = 0;
    double subtotal = 0;
    double descuento = 0;
    double total = 0;
    String productos[] = {"Manzana", "Naranja", "Platanos", "Lechuga", "Tomates", "Leche", "Queso", "Huevos", "Pollo",
         "Jamon", "Jugo de manzana", "Café", "Té", "Pan de caja", "Galletas saladas", "Helado", "Galletas", "Servilletas"};
    double precios[] = {45, 50, 37, 25, 19, 21.95, 38.40, 35, 92, 46.35, 26.20, 28.25, 15, 39.24, 17.40, 35.80, 20.35, 25.25};
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Tienda> listaVentas = new ArrayList<Tienda>();

    public JFrameTienda() {
        initComponents();
        this.setTitle("Venta de productos");
        DefaultComboBoxModel items = new DefaultComboBoxModel(productos);
        cboproductos.setModel(items);
        
        txtCantidad.setText("0");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        actualizarTabla();

    }
    
    public void limpiarCampo(){
        lblPrecio.setText("0");
        txtCantidad.setText("0");
        cboproductos.setSelectedIndex(0);
    }

    public void precio() {
        precio = precios[cboproductos.getSelectedIndex()];
      //  cantidad=Integer.parseInt(txtCantidad.getText());
        lblPrecio.setText(moneda(precio));
    }

    public void actualizarTabla() {
      
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        subtotal=0;
        for (Tienda v : listaVentas) {
            Object p[] = new Object[4];
            p[0] = v.getDescripcion();
            p[1] = v.getPrecio();
            p[2] = v.getCantidad();
            p[3] = v.getImporte();
         
            subtotal+=v.getImporte();
            modelo.addRow(p);
        }
        porcentaje();
        lblSubtotal.setText(moneda(subtotal));
        lblDescuento.setText(moneda(descuento));
        lblTotal.setText(moneda(total));
        jTable1.setModel(modelo);
    }

    public String moneda(double precio) {
        return "$ " + Math.round(precio * 100.0) / 100.0 + " MXN";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboproductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setPreferredSize(new java.awt.Dimension(450, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 420, 120));

        jLabel5.setText("Subtotal :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 20));

        jLabel7.setText("Total :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 40, -1));
        getContentPane().add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 80, 20));
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 90, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel1.setText("Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cboproductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        cboproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproductosActionPerformed(evt);
            }
        });
        jPanel1.add(cboproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Precio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        lblPrecio.setText("0");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 80, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 70, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 110));

        jLabel11.setText("Descuento :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        precio();
        
        if (txtCantidad.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Ingresa una Cantidad");   
        }else{
            cantidad = Integer.parseInt(txtCantidad.getText());
            Tienda venta = new Tienda();
            venta.setId(cboproductos.getSelectedIndex());
            venta.setDescripcion((String) cboproductos.getSelectedItem());
            venta.setPrecio(precio);
            venta.setCantidad(cantidad);
            venta.setImporte(precio * cantidad);
            
            if(!nuevaVenta(venta)){
            listaVentas.add(venta);
            }
            actualizarTabla();
            limpiarCampo();
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    private void cboproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproductosActionPerformed
        precio();
       
    }//GEN-LAST:event_cboproductosActionPerformed
    
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      int row = jTable1.getSelectedRow();
      String dato=String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),3));
      
     
     subtotal= subtotal- Double.parseDouble(dato);
     porcentaje();
      lblSubtotal.setText(moneda(subtotal));
      lblDescuento.setText(moneda(descuento));
      lblTotal.setText(moneda(total));

      modelo.removeRow(row);
    
    }//GEN-LAST:event_btnEliminarActionPerformed

    public boolean nuevaVenta(Tienda n){   
       for (Tienda v : listaVentas){
            if (v.getId()==n.getId()){
                int nuevaCantidad=v.getCantidad()+n.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
        
    }
    
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
       
        double dineroRecibido=Double.parseDouble(JOptionPane.showInputDialog("Dinero que recibe"));
        double cambio=dineroRecibido-total;
        JOptionPane.showConfirmDialog(rootPane,"Cambio : " + Math.round(cambio * 100.0) / 100.0 + "    GRACIAS POR SU COMPRA");
    }//GEN-LAST:event_btnPagarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cboproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

    private void porcentaje() {
       if (subtotal <= 150) {
            descuento = subtotal * 0.03;
            total = subtotal - descuento;
        } else if (subtotal >= 151 && subtotal <= 300) {
            descuento = subtotal * 0.05;
            total = subtotal - descuento;
        } else if (subtotal >= 301 && subtotal <= 450) {
            descuento = subtotal * 0.10;
            total = subtotal - descuento;
        } else if (subtotal >= 451) {
            descuento = subtotal * 0.15;
            total = subtotal - descuento;
        }
    }
}
