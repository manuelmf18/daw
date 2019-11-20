package ejerciciosAlternativa;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// algoritmo que pida al usuario un número real y muestre por pantalla la nota
		// del alumno

		double num = 0;
		System.out.println("Introduce un número real");
		num = Entrada.real();
		if (num >= 0 && num < 5) {
			System.out.println("Introduce un número real");
		}
		if (num >= 5 && num < 6) {
			System.out.println("La nota del alumno es: " + num + "SUFICIENTE");
		}
		if (num >= 6 && num < 7) {
			System.out.println("La nota del alumno es: " + num + " BIEN");
		}
		if (num >= 7 && num < 9) {
			System.out.println("La nota del alumno es: " + num + " NOTABLE");
		}
		if (num >= 9 && num <= 10) {
			System.out.println("La nota del alumno es: " + num + "SOBRESALIENTE");
		}

	}

}
