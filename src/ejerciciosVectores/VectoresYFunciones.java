package ejerciciosVectores;

public class VectoresYFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamano = 0, num = 0, multiplicador = 0;

		System.out.println("¿De cuántas posiciones quieres que sea el vector?");
		tamano = Entrada.entero();

		int[] vector = new int[tamano];

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Dame un valor para la posición " + i);
			vector[i] = Entrada.entero();
		}

		muestraValoresVector(vector);

		System.out.println("Introduce un número");
		num = Entrada.entero();

		System.out.println("El número introducido está en la posición " + devuelvePosicion(vector, num));

		multiplicaPropioVector(vector, multiplicador);

		muestraValoresVector(vector);

		multiplicaVectorEnOtro(vector, multiplicador);
		valoresPares(vector);

	}

	public static void muestraValoresVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("En la posición " + i + " está el " + vector[i]);
		}
	}

	public static int devuelvePosicion(int[] vector, int num) {
		int posicion = -1;
		for (int i = vector.length - 1; i >= 0; i--) {
			if (vector[i] == num) {
				posicion = i;
			}
		}
		return posicion;
	}

	public static void multiplicaPropioVector(int[] vector, int multiplicador) {

		for (int i = 0; i < vector.length; i++) {
			vector[i] = vector[i] * multiplicador;
		}

	}

	public static int[] multiplicaVectorEnOtro(int[] vector, int multiplicador) {
		int[] vector1 = vector.clone();
		for (int i = 0; i < vector.length; i++) {
			vector1[i] = vector[i] * multiplicador;
		}
		return vector1;
	}

	public static int[] sumaVectores(int[] vector, int[] vector1) {
		int[] vector2 = new int[vector.length];
		;
		for (int i = 0; i < vector.length; i++) {
			vector2[i] = vector[i] + vector1[i];
		}
		return vector2;
	}

	public static int[] valoresPares(int[] vector) {
		int pares = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				pares++;
			}
		}

		int[] vector3 = new int[pares];
		int j = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				vector3[j] = vector[i];
				j++;
			}
		}
		return vector3;
	}

	public static int[] devuelvePosiciones(int[] vector, int num) {

		int[] array = null;
		int cont = 0;

		for (int i = 0; i < vector.length; i++) {

			if (vector[i] == num) {
				cont++;
			}
		}
		array = new int[cont];
		return array;
	}

	public static int[] generaVectorAleatorio(int min, int tam, int max) {

		int[] vector = new int[tam];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		}

		return vector;

	}
}
