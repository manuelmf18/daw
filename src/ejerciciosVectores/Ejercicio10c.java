package ejerciciosVectores;

public class Ejercicio10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorInicial = new int[10];
		boolean pedirposicion = true;
		int posicion1 = 0, posicion2 = 0;		
		char respuesta = ' ';
		int temp = 0;

		for (int i = 0; i < vectorInicial.length; i++) {
			System.out.println("Indica el valor para la posici�n " + i + " del vector inicial");
			vectorInicial[i] = Entrada.entero();
		}

		for (int i = 0; i < vectorInicial.length; i++) {
			System.out.println("El valor de la posici�n " + i + " del vector inicial es: " + vectorInicial[i]);

		}

		while (pedirposicion) {
			System.out.println("�Cual es la primera posicion a trasponer?");
			posicion1 = Entrada.entero();

			System.out.println("�Cual es la segunda posici�n?");
			posicion2 = Entrada.entero();

			temp = vectorInicial[posicion1];
			vectorInicial[posicion1] = vectorInicial[posicion2];
			vectorInicial[posicion2] = temp;

			for (int i = 0; i < vectorInicial.length; i++) {
				System.out.println("El valor para la posicion " + i + " del vector Inicial es:" + vectorInicial[i]);

			}

			System.out.println("Quiere trasponer m�s posiciones? 'S' para SI, o pulse otra tecla para salir");
			respuesta = Entrada.caracter();
			if (respuesta == 'S') {
				pedirposicion = true;
			} else {
				System.out.println("Fin");
				pedirposicion = false;
			}

		}
	}

}