package ejerciciosAlternativa;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Decir si un número es positivo, negativo o cero
		double num1 = 0;

		System.out.println("Dame un número real");
		num1 = Entrada.real();
		if (num1 == 0) {
			System.out.println("El número ni es positivo ni negativo, es cero");
		} else {
			if (num1 > 0) {
				System.out.println("El número es positivo");
			} else {
				System.out.println("El número es negativo");

			}
		}

	}

}
