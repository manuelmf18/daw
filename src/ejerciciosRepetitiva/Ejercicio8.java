package ejerciciosRepetitiva;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El algoritmo contara cu�ntos n�meros positivos introduce el usuario, y
		// mostrar� cu�ntos han sido cuando introduzca un n�mero negativo
		int num1 = 0, cont = 0;

		while (num1 >= 0) {
			System.out.println("Dame un n�mero entero positivo");
			num1 = Entrada.entero();

			if (num1 >= 0) {
				cont++;
			}
		}
		System.out.println("Has introducido " + cont + " n�meros");
	}

}
