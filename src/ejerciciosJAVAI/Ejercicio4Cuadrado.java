package ejerciciosJAVAI;

public class Ejercicio4Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, i = 0, j = 0;
		System.out.println("Introduce un numero");
		num = Entrada.entero();

		//while para formar el cuadrado MAL
		while (i < num) {
			j = 0;
			while (j <num) {
					System.out.printf("*");
			}
			
			System.out.printf("\n");
			i++;
		}
		
		
		//Ejercicio 4 de Ejercicios JAVA I
		/*while (i < num) {
			j = 0;
			while (j <num) {
				if(j<=i)
					System.out.printf("*");
				else
					System.out.print(" ");
				j++;
			}
			System.out.printf("\n");
			i++;
		}*/
		
		/* cuadrado 
		 * for (int i = 0; i < num; i++) {
		
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} */
	}

}
