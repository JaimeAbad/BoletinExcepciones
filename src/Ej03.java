public class Ej03 {

	public static void main(String[] args) {

		
		/*Se dice que un número entero es primo si sólo es divisible entre 1 y entre sí mismo. Por 
ejemplo, 2, 3, 5 y 7 son primos, pero 4, 6, 8 y 9 no lo son. 
a)
Escribe una función que determine si un número es primo o no.
b)
Utiliza esta función en un programa que muestre todos los números primos entre 1 y 
10.000. */
		
		/*para saber si un numero es primo, lo dividimos desde el 2 hasta n-1,
		 * si nigun cociente de esas divisiones da exacto (exacto  = que el resto sea 0), el numero es primo
		 * 
		 * */
		//Scanner keyboard = new Scanner(System.in);
		final int VALOR = 10000;
		//float numero;
		boolean ser;
		
//		System.out.println("Introduce el numero que quieres comprobar si es primo: ");
//		numero = keyboard.nextFloat();
//		keyboard.close();
//		ser = esPrimo(numero);
//		
//		if(ser == true) {
//			System.out.println("Este numero es primo");
//		}
//		else {
//			System.out.println("Este numero no es primo");
//		}
		
		//no empieza desde el 1 pq la consola tiene un tamaño maximo
		for(int j = 1 ;j <=VALOR;j++) {
			ser = esPrimo(j);
			
			System.out.print(j);
			if(ser) {
				System.out.println("Este numero es primo");
			}
			else {
				System.out.println("Este numero no es primo");
			}
		}
		
		
	}
	
	
	public static boolean esPrimo(float numero) {
		boolean primo = true;
		float i;
		
		for(i = 2.0f; i<numero ; i ++) {
			
			if(numero%i == 0) {
				i = numero;
				primo = false;
			}
			
		}

		
		return primo;
	}

}
