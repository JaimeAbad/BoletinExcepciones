
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej05b {

	public static void main(String[] args) {
		
		
		/*Hacemos lo mismo que en el ejercicio anterior, pero en este caso, si el numero es perfecto mostraremos
		 * los factores de este
		 * 2. Para mostrar los factores los introducimos en una cadena separados por "+", y luego esa cadena la metemos
		 * en otra donde quitaremos el ultimo*/
		
		int num = 0;
		boolean error=false;
		String factores="",factoresCopia="";
		Scanner keyboard=new Scanner(System.in);
		// Pedimos al usuario el numero entero positivo
		do {
			try {
				error=false;
				System.out.println("Introduzca un numero:");
				num = keyboard.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error, introduce un numero entero positivo");
				error=true;
				keyboard.next();
			}
		} while (error || num<1);
		//Comprobamos si es perfecto y si lo es lo mostramos, y tambien sus factores
		factores=Perfecto(num);
		if(factores=="0"){
			System.out.printf("El numero %d no es perfecto",num);
		}else{
			//hacemos una copia de la cadena para quitarle el ultimo +
			for(int i=0;i<factores.length()-2;i++){
				factoresCopia+=factores.charAt(i);
			}
		
			System.out.println(factoresCopia);
		}
		keyboard.close();

	}
	
	public static String Perfecto(int numero){
		int divisorSuma=1;
		
		String cadena=numero+" = 1 + ";
		for(int i=2;i<numero;i++){
			if(numero%i==0){
			divisorSuma+=i;
			cadena+=i+" + ";
			}
		}
		if(divisorSuma==numero){
			return cadena;
		}else{
			return "0";
		}
	}


}
