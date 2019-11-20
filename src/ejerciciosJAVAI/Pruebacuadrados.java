package ejerciciosJAVAI;

public class Pruebacuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int cuadrados = 0, tam = 0;

		System.out.println("Escribe un tamaño para el cuadrado");
		tam = Entrada.entero();
		System.out.println("Escribe un número cuadrados");
		cuadrados = Entrada.entero();
		for (int k = 0; k < tam; k++) {
			for (int i = 0; i < cuadrados; i++) {
				for (int j = 0; j < tam; j++) {
					System.out.print(" *");
				}
				System.out.print("  ");
			}
			System.out.println("");
		}
		
	}
}
