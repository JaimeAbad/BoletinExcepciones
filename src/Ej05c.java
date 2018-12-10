
public class Ej05c {

	public static void main(String[] args) {
		
		
		
		/*Hacemos un recorrido entre 10.000 numeros y usando la funcion anteriormente creada mostraremos 
		 * los numeros perfectos*/
		int limite = 10000;
		boolean perfecto;

		System.out.printf("Los numeros perfectos menores a %d son: \n",limite);
		for(int i=2;i<limite;i++){
			perfecto=Perfecto(i);
			if(perfecto){
				System.out.println(i);
			}
		}


	}
	
	public static boolean Perfecto(int numero){
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
