package ejerciciosAlternativa;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		System.out.println("Introduzca un n�mero");
		numero = Entrada.entero();
		if (numero >= 0 && numero < 10) {
			System.out.println("el numero tiene 1 cifra");
		}
		if (numero >= 10 && numero < 100) {
			System.out.println("el n�mero tiene 2 cifras");
		}
		if (numero >= 100 && numero < 1000) {
			System.out.println("el n�mero tiene 3 cifras");
		}
		if (numero >= 1000 && numero < 10000) {
			System.out.println("el n�mero tiene 4 cifras");
		}
	}

}
