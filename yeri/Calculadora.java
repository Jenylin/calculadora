import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1, num2, suma, resta, mult, div, mod, res;
		int operacion;
		;
		System.out.println("******** Bienvenido a tu calculadora *********\n");
		System.out.println("¿Que operación deseas realizar?\n");
		System.out.println("\n1. Suma" + "\n2. Resta" + "\n3. Multiplicación" + "\n4. División" + "\n5. Módulo");
		operacion = sc.nextInt();
		System.out.println("Ingrese primer número:\t");
		num1 = sc.nextInt();
		System.out.println("Ingrese segundo número:\t");
		num2 = sc.nextInt();

		switch (operacion) {

		case 1:
			suma = num1 + num2;
			System.out.println("La suma es: " +suma);
			break;
			
		case 2:
			resta = num1 - num2;
			System.out.println("La resta es: "+resta);
			break;
			
		case 3:
			mult = num1 * num2;
			System.out.println("La multiplicación es: "+mult);
			break;
			
		case 4:
			div = num1/num2;
			System.out.println("La división es: "+div);
			break;
			
		case 5:
			mod = num1 % num2;
			System.out.println("El módulo es: "+mod);
			break;
			
		default:
			System.out.println("Ingrese una opción válida");
			break;

		}
		while(operacion!=5);
		System.out.println("Programa finalizado");

	}

}
