package ejerciciosAlternativa;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un algoritmo que pida al usuario tres n�meros enteros, y que muestre
		// por pantalla si la suma de dos de esos n�meros da como resultado el otro
		// n�mero.
		int num1 = 0, num2 = 0, num3 = 0;

		System.out.println("Introduzca un n�mero");
		num1 = Entrada.entero();
		System.out.println("Introduzca otro n�mero");
		num2 = Entrada.entero();
		System.out.println("Introduzca otro n�mero");
		num3 = Entrada.entero();

		if (num1 + num2 == num3) {
			System.out.println(num1 + "+" + num2 + " es igual a " + num3);
		}
		if (num1 + num3 == num2) {
			System.out.println(num1 + "+" + num3 + " es igual a " + num2);
		}
		if (num2 + num3 == num1) {
			System.out.println(num2 + "+" + num3 + " es igual a " + num1);
		}
	}

}