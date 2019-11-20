package ejerciciosJAVAI;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Algoritmo que pide dos números, dice si ambos números son primos gemelos o no
		// (Dos números son primos gemelos si son primos y solo existe un número entre
		// ellos). El usuario introducirá siempre primero el menor número y luego el
		// mayor
		int num1 = 0, num2 = 0, cont = 1;

		System.out.println("Introduce un número");
		num1 = Entrada.entero();
		System.out.println("Introduce otro número");
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
							System.out.println("El segundo número introducido no es primo");
						}
					}
				} else {
					System.out.println("El primer número introducido no es primo");
				}
			}
		} else {
			System.out.println("No son primos gemelos");
		}
	}
}
