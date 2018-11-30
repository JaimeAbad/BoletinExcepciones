
public class Ej04 {

	public static void main(String[] args) {

		/*1. pedimos un numero entero
		 * 2. este numero lo dividiremos entre los numeros primos que den un resultado exacto empezando por el 2
		 * por lo que recorreremos desde el 2 hasta el numero hasta que el resultado de exacto
		*/
		int numero,i=2;
		numero = Teclado.leerEntero("Introduce un numero entero para descomponerlo en factores primos: ");

		System.out.printf("Numero -- %d = ", numero);
		do {
			if(esPrimo(i) && numero %i == 0) {

				if(numero/i != 1) {
					System.out.printf(" %d *",i);
					
				}else {
					System.out.printf(" %d ",i);
				}
				
				numero = numero/i;
				i=2;
				
			}else {
				i++;
			}
			
			
			
			
		}while(i<=numero);

		
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
