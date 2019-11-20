package ejerciciosRepetitiva;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El algoritmo contara cuántos números positivos introduce el usuario, y
		// mostrará cuántos han sido cuando introduzca un número negativo
		int num1 = 0, cont = 0;

		while (num1 >= 0) {
			System.out.println("Dame un número entero positivo");
			num1 = Entrada.entero();

			if (num1 >= 0) {
				cont++;
			}
		}
		System.out.println("Has introducido " + cont + " números");
	}

}
