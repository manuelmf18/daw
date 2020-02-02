package ejerciciosVectores;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosOrdenados = new int[10];

		for (int i = 0; i < numerosOrdenados.length; i++) {
			numerosOrdenados[i] = (int) Math.round(Math.random() * (50 - 1 + 1));
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					while (numerosOrdenados[i] < numerosOrdenados[j]) {
						numerosOrdenados[i] = (int) Math.round(Math.random() * (50 - 1 + 1));
						j=0;
					}
				}
			}
			System.out.println("En la posición " + i + " está el " + numerosOrdenados[i]);
		}

	}

}
