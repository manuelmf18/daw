package ejerciciosJAVAI;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Algoritmo que pide dos n�meros, dice si ambos n�meros son primos gemelos o no
		// (Dos n�meros son primos gemelos si son primos y solo existe un n�mero entre
		// ellos). El usuario introducir� siempre primero el menor n�mero y luego el
		// mayor
		int num1 = 0, num2 = 0, cont = 1;

		System.out.println("Introduce un n�mero");
		num1 = Entrada.entero();
		System.out.println("Introduce otro n�mero");
		num2 = Entrada.entero();

		if (num2 - num1 == 2) {

			while ((num1 % cont != 0) && (cont <= num1)) {
				cont++;
				if (cont >= num1) {
					while ((num2 % cont != 0) && (cont <= num2)) {
						cont++;

						if (cont >= num2) {
							System.out.println("Son primos gemelos");
						}

						else {
							System.out.println("El segundo n�mero introducido no es primo");
						}
					}
				} else {
					System.out.println("El primer n�mero introducido no es primo");
				}
			}
		} else {
			System.out.println("No son primos gemelos");
		}
	}
}
