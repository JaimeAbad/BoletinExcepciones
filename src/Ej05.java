
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		
		/* 5. Se dice que un número entero es un número perfecto si la suma de sus divisores propios
			(incluyendo el 1 y sin incluirse él mismo) da como resultado el mismo número. Así, 6 es un
			número perfecto, porque sus divisores propios son 1, 2 y 3; y 6 = 1 + 2 + 3. Los siguientes
			números perfectos son 28, 496 y 8128.
				a) Escribe una función llamada perfecto que determine si el parámetro es perfecto o no.
				b) Realiza otra función que dado un número perfecto, imprima los factores para
					confirmar que el número es perfecto. Si no lo es, que no haga nada.
				c) Utiliza estas funciones en un programa que muestre todos los números perfectos
					entre 1 y 10.000 con sus correspondientes factores.
		 
		 */
		
		/*1. Creamos una funcion que determine si un numero es perfecto, es decir que la suma de sus divisores enteros
		 * sea el propio numero
		 * 2. la funcion recorre desde 1 hasta el numero y obtiene los numeros que divididos entre el numero den exacto
		 * 3. una vez obtenido estos numeros se suman y se comprueba que el resultado de esta sea el propio numero
		 * 4. terminada la funcion, comprobamos con excepciones que el usuario introduzca un numero entero , si
		 * 		no es un numero entero lo que introduce se lo volveremos a pedir
		 * 5. una vez comprobado que introduce un entero, usamos la funcion anteriormente creada y averiguamos si es
		 * 		un numero perfecto*/
		
		Scanner keyboard = new Scanner (System.in);
		boolean num_perf=false, error;
		int number=0;
		
		do {
			try {
				error=false;
				System.out.println("Introduce un numero entero: ");
				number=keyboard.nextInt();
			}catch (InputMismatchException e) {
					System.out.println("Error, introduce un numero entero");
					error=true;
					keyboard.next();
			}
		}while(error);
		
		num_perf=perfecto(number);
		if (num_perf) {
			System.out.printf("El numero %d es perfecto",number);
		}else {
			System.out.printf("El numero %d no es perfecto",number);
		}
		
		keyboard.close();	
	}
		
		

	
	
	public static boolean perfecto(int numero) {
		int divisorSuma=1;

		for(int i=2;i<numero;i++){
			if(numero%i==0){
				divisorSuma+=i;
			}
		}
		
		if(divisorSuma==numero){
			return true;
		}else{
			return false;
		}
		
		
		
	}

}
