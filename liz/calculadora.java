package proyecto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 , numero2,opcion,resultado;
		double resultado1;
		
		 Scanner sc = new Scanner (System.in);
		
		System.out.println("VIENVENIDO A CALCULADORA :)");
		System.out.println("¿que operacion deseas realizar?");
		System.out.println(" 1.SUMA     2.-RESTA     3.-MULTIPLICACION    4.-DIVISION  ");
        opcion=sc.nextInt();
        
        switch(opcion) {
        case 1:
        	
        	System.out.println("introduce el primer numero: ");
        	numero1=sc.nextInt();
        	System.out.println("introduce el segundo numero: ");
        	numero2=sc.nextInt();
        	resultado=numero1+numero2;
        	System.out.println("EL RESULTADO DE LA SUMA ES: " +resultado);
        	
            break;
        	
        case 2:
        	System.out.println("introduce el primer numero: ");
        	numero1=sc.nextInt();
        	System.out.println("introduce el segundo numero: ");
        	numero2=sc.nextInt();
        	resultado=numero1-numero2;
        	System.out.println("EL RESULTADO DE LA RESTA ES: " +resultado);
        	break;
        	
        case 3:
        	System.out.println("introduce el primer numero: ");
        	numero1=sc.nextInt();
        	System.out.println("introduce el segundo numero: ");
        	numero2=sc.nextInt();
        	resultado=numero1*numero2;
        	System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " +resultado);
        	break;
        	
        case 4:
        	System.out.println("introduce el primer numero: ");
        	numero1=sc.nextInt();
        	System.out.println("introduce el segundo numero: ");
        	numero2=sc.nextInt();
        	resultado1=numero1/numero2;
        	System.out.println("EL RESULTADO DE LA DIVICION ES: " +resultado1);
        	break;
        	
        
        	
        }
      

	}

}
