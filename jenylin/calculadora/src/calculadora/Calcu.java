package calculadora;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		double res;
		int opcion = 0;
		int opcion2;
		
		do {
			System.out.println("******Calculadora******");
			System.out.println("Seleccione una opción:");
			System.out.println("1. Continuar");
			System.out.println("2. Apagar calculadora");
			opcion2 = sc.nextInt();

			if(opcion2 == 1) {
			
				System.out.println("Ingrese el primer número: ");
				num1 = sc.nextDouble();
				System.out.println("Ingrese el segundo número: ");
				num2 = sc.nextDouble();
				System.out.println("Seleccione la operación a realizar");
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Producto");
				System.out.println("4. División");
				System.out.println("5. Apagar calculadora");
				opcion = sc.nextInt();
			
				switch(opcion) {	
				case 1:
					res = num1 + num2;
					System.out.println("La suma es: "+ res);
					break;
				case 2:
					res = num1-num2;
					System.out.println("La resta es: "+ res);
					break;
				case 3:
					res = num1*num2;
					System.out.println("El  producto es: "+ res);
					break;
				case 4:
					res = num1/num2;
					System.out.println("El cociente es: "+ res);
					break;
				default:
					System.out.println(" ");
					break;
				}

			}else if(opcion2 == 2) {
				break;
			}
				
			}while(opcion != 5);
			System.out.println("Good-bye!");
		


}
}
