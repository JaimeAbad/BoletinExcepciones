

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int number1 =0 , number2 = 0;
		char operation = 0;
		boolean error = false;
		
		System.out.println("BIENVENIDO A LA CALCULADORA");
		do {
			//el try catch iria dentro del bucle dowhile
			
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
		
		
		
		keyboard.close();
		System.out.println(calculadora(number1, number2, operation));
	}
	/*1.
	Escribe una función que tome 3 parámetros: dos de tipo entero y uno de tipo carácter. La 
	función deberá sumar, restar, multiplicar o dividir los valores de los dos primeros parámetros
	dependiendo de la operación indicada en el tercer parámetro, y devolver el resultado
	*/
	
	
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
}
