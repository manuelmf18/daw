package ejerciciosVectores;

public class Ejercicio3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int posMax =0;
		int[] vectorNumeros = new int[10];

		for (int i = 0; i < vectorNumeros.length; i++) {
			vectorNumeros[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < vectorNumeros.length; i++) {
			System.out.println("En la posición " + i + " está el vector " + vectorNumeros[i]);		
		}

		for (int i = 0; i < vectorNumeros.length; i++) {
			if (max < vectorNumeros[i]) {
				max = vectorNumeros[i];
				posMax=i;
				
			}
		}

		System.out.println();
		System.out.println("El numero mayor es " + max + " esta en la posicion " +posMax);
	}
}