package ejerciciosJAVAI;

public class Ejercicio4C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, i = 0, j = 0;
		System.out.println("Introduce un numero");
		num = Entrada.entero();

		while (i < num) {
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
		}
		
	}

}
