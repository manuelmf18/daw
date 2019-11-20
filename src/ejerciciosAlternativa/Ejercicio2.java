package ejerciciosAlternativa;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 0;

		System.out.println("Introduce un número entero");
		num1 = Entrada.entero();
		System.out.println("Introduce otro número entero");
		num2 = Entrada.entero();
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
		if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		}
		if (num1 == num2) {
			System.out.println(num1 + " es igual que " + num2);
		}
	}
}
