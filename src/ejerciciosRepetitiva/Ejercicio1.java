package ejerciciosRepetitiva;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, cont = 0;

		System.out.println("Introduzca un n�mero");
		num = Entrada.entero();

		while (cont <= num) {
			System.out.println("N�mero: " + cont);
			cont++;
		}

	}

}
