package ejerciciosJAVAI;

public class PruebaCuadrados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int cuadrados = 0, fila = 0, colum=0;

		System.out.println("Escribe un tamaño para el cuadrado");
		fila = Entrada.entero();
		System.out.println("Escribe un tamaño para el cuadrado");
		colum = Entrada.entero();
		System.out.println("Escribe un número cuadrados");
		cuadrados = Entrada.entero();
		for (int k = 0; k < fila; k++) {
			for (int i = 0; i < cuadrados; i++) {
				for (int j = 0; j < colum; j++) {
					System.out.print(" *");
				}
				System.out.print("  ");
			}
			System.out.println("");
		}

	}

}
