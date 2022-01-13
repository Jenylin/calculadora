/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liiz
 */
public class Tienda {
    
    String producto,Precio,Cantidad;

    public Tienda(String producto, String Precio, String Cantidad) {
        this.producto = producto;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
       
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    

    
     
    
}
