package ejerciciosRepetitiva;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nos dan numeros positivos que debemos ir sumando, en el momento en el que den
		// uno negativo, se para
		int num = 0, suma = 0;

		while (num >= 0) {
			suma = suma + num;
			System.out.println("Escribe un número positivo para sumar. Si introduces uno negativo, paramos:");
			num = Entrada.entero();
		}

		System.out.println("La suma de los números introducidos ha sido: " + suma);

	}

}
