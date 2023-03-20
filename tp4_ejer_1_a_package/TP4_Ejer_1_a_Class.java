package tp4_ejer_1_a_package;

public class TP4_Ejer_1_a_Class {
	

	public static void main(String[] args) {
		/* a.
		*	haga un main, donde por parámetro ponga 3 números y 
		*	una letra que represente
		*	ascendente o descendente y los muestre ordenados por tal criterio
		*
		* Lo hé resuleto con un metodo porque haciendolo en el 
		* main el pc deja de funcionar
		* 
		* OrdenarAscDesc(36, 65, 5, a);
		*/
		
		
		if(args.length == 4) {
			int num1 = Integer.valueOf(args[0]);
			int num2 = Integer.valueOf(args[1]);
			int num3 = Integer.valueOf(args[2]);
			char orden = args[3].charAt(0);
			OrdenarAscDesc(num1, num2, num3, orden);
		}else {
			System.out.println("No se detectaron parametros en el metodo 'main'");
			System.out.println("La cantidad de parametros no son lo permitido");
			System.out.println("Ingrese 4 parametros unicamente.");
			System.out.println("Los cuales deben ser:");
			System.out.println("3 numeros y una letra (a || d)");
			System.out.println("Ejemplo: 36, 65, 5, a");
			System.out.println("==========================================");
			System.out.println("Ejecutando ejemplo --> OrdenarAscDesc(36, 65, 5, a); ");
			OrdenarAscDesc(36, 65, 5, 'a');
			
		}
		
		
		
		
		
	}
	
	private  static void OrdenarAscDesc(int num1, int num2, int num3, char orden) {
		int [] numerosOrdenados = new int[] {num1, num2, num3};
		
		if(orden == 'd') {
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] < numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		if(orden == 'a') {
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] > numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		
		for(int i = 0; i < numerosOrdenados.length; i++) {
			System.out.println(numerosOrdenados[i]);
		}
	}

}
