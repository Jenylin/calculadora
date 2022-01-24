      /*if(n1<= 150 ) 3% 
      if(151<=300)  5%
      if(301<=450)  10 */ 
package paquetestodos;


public class venta_secun {
    
    
    public double r;
    
    public void descuento(double n2){
       
      if(n2>= 10 && n2 <= 150 ){
          r=n2-(n2*0.03);
          
      }
      else if (n2 > 151 && n2 <= 300){
          
           r=n2-(n2*0.03);
          
      }     
      else if (n2 > 301 && n2<= 450 ){
          
          r=n2-(n2*0.1); 
      }
      else{
          
          r=n2;
      };
    }
}
