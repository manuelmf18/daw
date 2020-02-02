package ejerciciosVectores;

public class Ejercicio1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorAleatorio = new int[10];
		int cuentaPares = 0, cuentaImpares = 0;

		for (int i = 0; i < vectorAleatorio.length; i++) {
			vectorAleatorio[i] = (int) Math.floor(Math.random() * 20) + 1;
		}
		
		for (int i = 0; i < vectorAleatorio.length; i++) {
			System.out.println("En la posición " + i + " está el valor " + vectorAleatorio[i] + "\n");
		}
		
		for (int i = 0; i < vectorAleatorio.length; i++) {
			if (vectorAleatorio[i] % 2 == 0) {
				System.out.println("En la posición " + i + " está el valor " + vectorAleatorio[i] + ", que es par");
				cuentaPares++;

			} else {
				System.out.println("En la posición " + i + " está el valor " + vectorAleatorio[i] + ", que es impar");
				cuentaImpares++;
			}

		}
		System.out.println("En el vector hay " + cuentaPares + " números pares y " + cuentaImpares + " números impares.");

	}
}
