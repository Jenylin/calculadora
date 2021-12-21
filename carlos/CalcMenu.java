package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalcMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int option;
		boolean exit = false;
		int num1, num2, operacion = 0;

		do {
			try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor"));


				num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor"));

				option = Integer.parseInt(JOptionPane.showInputDialog(null, "¿QUÉ DESEA REALIZAR? \n\n"
						+"\t OPCION 1 - DIVISIÓN \n"+
						"\t OPCION 2 - MULTIPLICACIÓN \n" +
						"\t OPCION 3 - RESTA \n" +
						"\t OPCION 4 - SUMA \n" +
						"\t OPCION 5 - TODAS LAS ANTERIORES \n"+
						"\t OPCION 6 - SALIR \n"
						));


				switch(option) {
				case 1:
					operacion = num1 + num2;
					showMessage("El resultado de la división es: ",DivCalc(num1, num2));
					break;
				case 2:
					showMessage("El resultado de la multiplicación es: ",MulCalc(num1, num2));
					break;
				case 3:
					showMessage("El resultado de la resta es: ",SubCalc(num1, num2));
					break;
				case 4:
					showMessage("El resultado de la suma es: ",addCalc(num1, num2));

					break;
				case 5:
					showAllOp(num1, num2);

					break;	
				case 6:
					showMessageError("GRACIAS POR UTILIZAR LA CALCULADORA, HASTA PROXIMAAAA!");
					exit = true;
					break;	
				default:
					showMessageError("Solo numeros del 1 al 6");

				}


			}catch (NumberFormatException e) {
				showMessageError("Debe de insertar un número entero");
			}

		}while(!exit);

	}
	
	//Metodos de operaciones

	public static void showMessageError(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public static void showMessage(String message, double operation) {
		JOptionPane.showMessageDialog(null, message + " "+ operation);
	}
	public static double addCalc(double num1, double num2) {
		return num1 + num2;
	}
	public static double SubCalc(double num1, double num2) {
		return num1 - num2;
	}
	public static double MulCalc(double num1, double num2) {
		return num1 * num2;
	}
	public static double DivCalc(double num1, double num2) {
		return num1 / num2;
	}
	public static void showAllOp(double num1, double num2) {
		JOptionPane.showMessageDialog(null, "Los resultados de la operacíon con los numeros "+num1+" y "+num2+" son: \n\n"+
				"\t\t SUMA -> "+addCalc(num1, num2)+"\n"+
				"\t\t RESTA -> "+SubCalc(num1, num2)+"\n"+
				"\t\t MULTIPLICACIÓN -> "+MulCalc(num1, num2)+"\n"+
				"\t\t DIVISIÓN -> "+DivCalc(num1, num2));
	}

}
