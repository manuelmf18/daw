package ejerciciosRepetitiva;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// este algoritmo sirve para multiplicar desde 1 hasta 20 todos los n�meros
		int num = 0;
		long resultado = 1;

		System.out.println("Se multiplicar�n todos los n�meros desde el 1 hasta el 5");

		for (num = 1; num <= 5; num++) {
			resultado = resultado * num;
		}
		System.out.println("La multiplicaci�n de todos los n�meros desde 1 hasta 5 es " + resultado);

	}

}
