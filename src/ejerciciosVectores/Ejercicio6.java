package ejerciciosVectores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosSinRepetir = new int[10];
		int j=0;
		
		for (int i = 0; i < numerosSinRepetir.length; i++) {
			numerosSinRepetir[i] = (int) Math.round(Math.random() * (50 -1 +1));
			if (i > 0) {
				while (j < i) {
					while (numerosSinRepetir[i] == numerosSinRepetir[j]) {
						numerosSinRepetir[i] = (int) Math.round(Math.random() * (50 -1 +1));
						j=0;
					}
				}
			}
			System.out.println("En la posición " + i + " está el " + numerosSinRepetir[i]);
		}
	}

}
