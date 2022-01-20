/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author jenylin
 */
public class PruebaFibonacci {
    public static void main(String[] args) {
        int n = 4;
        int resultado = 0;
        int aux = 1;
        
        do{     
            int k = aux + resultado;
            System.out.println("k = "+k);
            if(k < n){
                resultado = resultado + aux;
                System.out.println(Integer.toString(resultado)+" ");;
                k = aux + resultado;
                if(k < n) {
                aux = aux + resultado;
                System.out.println(Integer.toString(aux)+" ");
                }
            }else if(k >= n){
                break;
            }
            System.out.println("resultado = "+resultado);
            System.out.println("aux = "+aux);
        }while(aux <= n && resultado <= n);
    }                       
    }
    
}
