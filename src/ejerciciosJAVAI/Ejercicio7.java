package ejerciciosJAVAI;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pide dos números al usuario e imprime si el número más pequeño está contenido
		// en el número más grande
		int num1 = 0, cifras_num1=0, num2 = 0, cont_num1 = 0, div = 0, prueba = 0;

		System.out.println("Introduce un número");
		num1 = Entrada.entero();
		System.out.println("Introduce otro número");
		num2 = Entrada.entero();

		cifras_num1 = num1;
		while (cifras_num1 > 0) {
			cifras_num1 = cifras_num1 / 10;
			cont_num1++;
		}
		while (num2 > 0) {
			div = 10 ^ cont_num1;
			prueba = num2 % div;
			
			if (prueba == num1) {
				System.out.println("Verdadero");
			} else {
				System.out.println("Falso");

			}
			num2 = num2 / 10;
		}
	}
}
