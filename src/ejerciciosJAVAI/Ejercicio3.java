package ejerciciosJAVAI;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Programa que te dice si el numero introducido es Armstrong
		int num = 1;
		int temp = num;
		int r, sum = 0;

		System.out.println("Introduce un número de 3 cifras");
		num = Entrada.entero();

		while (num > 0) {

			r = num % 10;
			num = num / 10;
			sum = sum + r * r * r;

		}
		if (temp == sum)
			System.out.println("Es amstrong");

		else

			System.out.println("No Es amstrong");

	}

}
