import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {

		/*Sobrecarga la función del ejercicio anterior para que se pueda operar con enteros y con 
decimales. Haz un programa que utilice las dos funciones, con enteros y con decimales. */
		
		Scanner keyboard = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		double n1 = 0, n2 = 0;
		char operation = 0;
		boolean error;
		
		
		System.out.println("CALCULADORA ENTERA.");
		do {
			try {
				error = false;
				System.out.println("¿Que operacion desea realizar?\nsuma: + \nresta: - \nmultiplicacion: * \ndivision: /");
				operation = keyboard.next().charAt(0);
				System.out.println("Numero 1: ");
				number1 = keyboard.nextInt();
				System.out.println("Numero 2: ");
				number2 = keyboard.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error en la introduccion de uno de los numeros");
				error = true;
				keyboard.nextLine();//limpiamos el buffer para que no salte directamente a pedir el numero1
			}
			
			
		}while(operation != '*' && operation != '+' && operation != '-' && operation != '/' || error);
		
		System.out.println(calculadora(number1, number2, operation));
		
		
		System.out.println("CALCULADORA DECIMAL");
		
		do {
			try {
				error = false;
				System.out.println("¿Que operacion desea realizar?\nsuma: + \nresta: - \nmultiplicacion: * \ndivision: /");
				operation = keyboard.next().charAt(0);
				System.out.println("Numero 1: ");
				n1 = keyboard.nextDouble();
				System.out.println("Numero 2: ");
				n2 = keyboard.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Error en la introduccion de uno de los numeros");
				error = true;
				keyboard.nextLine();//limpiamos el buffer para que no salte directamente a pedir el numero1
			}
			
			
		}while(operation != '*' && operation != '+' && operation != '-' && operation != '/' || error);
		keyboard.close();
		System.out.println(calculadora(n1, n2, operation));
		
		
		
		
	}

	
	public static int calculadora(int n1, int n2, char operacion) {
		int resultado = 0;
		
		switch(operacion) {
		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			resultado = n1 / n2;
			break;
		}
		
		
		return resultado;
	}
	
	
	public static double calculadora(double n1, double n2, char operacion) {
		double resultado = 0;
		
		switch(operacion) {
		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			resultado = n1 / n2;
			break;
		}
		
		
		return resultado;
	}
	
}
