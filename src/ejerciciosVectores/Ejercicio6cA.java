package ejerciciosVectores;

public class Ejercicio6cA {
	public static void main(String[] args) {
		// VARIABLES
		int vectorAleatorio[] = new int[10];
		int numAleatorio = 0;

		boolean numeroRepetido = true;

		// INICIO
		for (int i = 0; i < vectorAleatorio.length; i++) {
			
			numeroRepetido=true;
			
			while (numeroRepetido) {	
				numAleatorio = (int) (10 * Math.random() + 1);
				numeroRepetido=false;

				for (int j = 0; j <= i; j++) {
					if (numAleatorio == vectorAleatorio[j])
						numeroRepetido = true;
				}
			}

			vectorAleatorio[i] = numAleatorio;
		}

		System.out.print("El vector es: [");
		for (int i = 0; i < vectorAleatorio.length; i++) {
			System.out.print(vectorAleatorio[i]);
			if (i != vectorAleatorio.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

	}
}