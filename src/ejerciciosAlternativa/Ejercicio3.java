package ejerciciosAlternativa;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir al usuario dos numeros enteros y mostrar por pantalla si el primer
		// numero es múltiplo del segundo numero

		int numA = 0, numB = 0;
		System.out.println("Introduzca el primer número entero");
		numA = Entrada.entero();
		System.out.println("Introduzca el segundo número entero");
		numB = Entrada.entero();
		if (numA % numB == 0) {
			System.out.println("El primer número es múltiplo del segundo número");
		}
	}

}
