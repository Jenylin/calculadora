package domain;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    String productos [] = {"Naranja","Manzana","Platanos","Lechuga"
            ,"Tomates","Leche","Queso","Huevos","Pollo"
            ,"Jamon","Jugo de manzana","Café","Té","Pan de caja","Galletas saladas",
            "Helado","Galletas","Servilletas"};
    
    double precios [] = {50,45,37,25,19,21.95,38.40,35,92,46.35,26.20,28.25,15,39.24,17.40,35.80,20.35,25.25};
    double precio;
    int cantidad=0;
    
    //Modificador de la tabla
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList <Venta> listaVentas = new ArrayList<Venta>();
    
    public Main() {
        initComponents();
        this.setTitle("Tiendita");
        this.setLocationRelativeTo(null);
        calcularPrecio();
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        modelo.addColumn("Precio");
        modelo.addColumn("Precio U");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        actualizarTabla();
        this.jCProducto.setModel(comboModel);
        calcularPrecio();
    }
    
    public void calcularPrecio(){
        precio=precios[jCProducto.getSelectedIndex()];
        cantidad=Integer.parseInt(jSpinner1.getValue().toString());
        jLPrecio.setText(aMoneda(precio));
        jLImporte.setText(aMoneda(precio*cantidad));
    }
    
    public String aMoneda(double precio){
        return "$ "+Math.round(precio*100.0)/100.0+" MXN";
        
    }
    
    public void actualizarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        double subtotal=0;
        for (Venta v : listaVentas){
            Object x []= new Object[4];
            x[0]=v.getDescripcio();
            x[1]=aMoneda(v.getPrecio());
            x[2]=v.getCantidad();
            x[3]=aMoneda(v.getImporte());
            subtotal+=v.getImporte();
            modelo.addRow(x);
        }
        
        double descuento=0;
        double total=0;
        if (subtotal<=150){
            descuento=subtotal*0.03;
            total = subtotal-descuento;
        }else if (subtotal >=151 && subtotal <=300){
            descuento=subtotal*0.05;
            total = subtotal-descuento;
        }else if (subtotal >=301 && subtotal <=450){
            descuento=subtotal*0.10;
            total = subtotal-descuento;
        }else if (subtotal >=451){
            descuento=subtotal*0.15;
            total = subtotal-descuento;
        }
        jLSubtotal.setText(aMoneda(subtotal));
        jLDescuento.setText(aMoneda(descuento));
        jLTotal.setText(aMoneda(total));
        jTable.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLImporte = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLProducto = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jCProducto = new javax.swing.JComboBox<>();
        jLPrecio = new javax.swing.JLabel();
        jL5 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLCantidad1 = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jL4 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jLSubtotal = new javax.swing.JLabel();
        jLDescuento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLImporte.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLImporte.setText("$0.00 mxn");
        jPanel1.add(jLImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 100, 20));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("Lista de compras");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        jLProducto.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLProducto.setText("Producto");
        jPanel1.add(jLProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jL1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jL1.setText("precio");
        jPanel1.add(jL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 60, 20));

        jCProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jCProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLPrecio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLPrecio.setText("$0.00 mxn");
        jPanel1.add(jLPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 100, 20));

        jL5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jL5.setText("Total");
        jPanel1.add(jL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 80, -1));

        jL2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jL2.setText("Impiorte");
        jPanel1.add(jL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 20));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 80, 60));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 50, 30));

        jLCantidad1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLCantidad1.setText("Cantidad");
        jPanel1.add(jLCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jLTotal.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotal.setText("$0.00 mxn");
        jPanel1.add(jLTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 80, -1));

        jL4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jL4.setText("descuento");
        jPanel1.add(jL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 90, -1));

        jL3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jL3.setText("Subtotal");
        jPanel1.add(jL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 80, -1));

        jLSubtotal.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSubtotal.setText("$0.00 mxn");
        jPanel1.add(jLSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 80, -1));

        jLDescuento.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLDescuento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLDescuento.setText("$0.00 mxn");
        jPanel1.add(jLDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 80, -1));

        jTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 540, 200));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        calcularPrecio();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jCProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProductoActionPerformed
        // TODO add your handling code here:
        calcularPrecio();
    }//GEN-LAST:event_jCProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Venta venta= new Venta ();
        venta.setId(jCProducto.getSelectedIndex());
        venta.setDescripcio(jCProducto.getSelectedItem().toString());
        venta.setPrecio(this.precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if(!buscarVenta(venta)){
            listaVentas.add(venta);
        }
        
       // listaVentas.add(venta);
        actualizarTabla();
        borrarVenta();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "El totalde la compra es \n"
                + this.jLTotal.getText()+"\nVuelva pronto");
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean buscarVenta(Venta nueva){
        for (Venta v : listaVentas){
            if (v.getId()==nueva.getId()){
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    
    public void borrarVenta(){
        precio=0;
        cantidad=1;
        //jLPrecio.setText(aMoneda(0));
        //jLImporte.setText(aMoneda(0));
        jCProducto.setSelectedIndex(0);
        jSpinner1.setValue(1);
        calcularPrecio();
        
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCProducto;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jLCantidad1;
    private javax.swing.JLabel jLDescuento;
    private javax.swing.JLabel jLImporte;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLProducto;
    private javax.swing.JLabel jLSubtotal;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
