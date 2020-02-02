package ejerciciosMasFuncionesJAVA;

public class EjerciciosDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Ejercicio
		int num = 0;

		System.out.println("Introduzca un número");
		num = Entrada.entero();
		factorial(num);

		// 2 Ejercicio
		int[][] matriz = new int[2][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = (int) Math.floor(Math.random() * 100);

			}
		}

		// 3 Ejercicio
		int num1 = 0, numCopia = 0, cont = 2;

		System.out.println("Introduzca un número");
		num = Entrada.entero();

		numCopia = num;

		while (numCopia != 0) {
			if (!esPrimo(cont)) {
				cont++;
			} else {
				if (numCopia % cont == 0) {

					if (numCopia == cont)
						System.out.print(cont);
					else
						System.out.print(cont + "*");

					numCopia = numCopia / cont;
				} else {
					cont++;
				}
			}
		}
	}

	public static void factorial(int num) {
		int factorial = 1, i = 2;
		while (i <= num) {
			factorial = factorial * i;
			i++;
		}

	}

	public static boolean esPrimo(int num) {
		int cont = 2;

		if (num == 0)
			return false;

		while (cont < num) {
			if (num % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;
	}
}
