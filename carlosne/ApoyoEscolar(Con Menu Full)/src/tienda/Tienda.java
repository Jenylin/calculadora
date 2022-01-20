package tienda;

import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Tienda { 
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
   UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
      // UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\AriesCool Vj\\Documents\\NetBeansProjects\\Librerias\\Chocolate.theme"));
       JFrameTienda lib =new JFrameTienda();
       lib.setLocationRelativeTo(null);
       lib.setVisible(true);
    
    }
    
   int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String descripcion;
    int cantidad;
    double precio,importe;
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
