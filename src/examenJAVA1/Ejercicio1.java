package examenJAVA1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 0;
		String romper= new String("");

		System.out.println("Introduce el tamaño de tu ventana");
		tam = Entrada.entero();

		while (tam < 10 || tam % 2 == 0) {
			System.out.println("Introduce el tamaño de tu ventana");
			tam = Entrada.entero();
		}
		System.out.println("Elige cuadrante a romper :");
		romper = Entrada.cadena();

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j <tam ; j++) {
				
				
				System.out.print(" *");
				i++;
				if (i == tam) {
					System.out.print(" ");
					i = 0;
				}
			}
			System.out.println("");
		}
	}
}
