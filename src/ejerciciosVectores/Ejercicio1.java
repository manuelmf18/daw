package ejerciciosVectores;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorAleatorio = new int[10];
		int numPares=0, numImpares=0;
		
		for (int i = 0; i < vectorAleatorio.length; i++) {
			vectorAleatorio[i] =  (int) Math.round(Math.random()*20);
		}
		
		for (int i = 0; i < vectorAleatorio.length; i++) {
			if (vectorAleatorio[i] % 2 == 0) {
				numPares++;
			} else {
				numImpares++;
			}
		}
		System.out.println("Hay " + numPares + " números pares y " + numImpares+" números impares");
		
		for (int i = 0; i < vectorAleatorio.length; i++) {
			System.out.println("En la posición " + i + " está el " + vectorAleatorio[i]);
		}
	}

}
