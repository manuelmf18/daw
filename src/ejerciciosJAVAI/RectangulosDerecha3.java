package ejerciciosJAVAI;

public class RectangulosDerecha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int rectangulos = 0, ancho = 0, alto=0;

		System.out.println("Escribe un ancho para el rectangulo");
		ancho = Entrada.entero();
		System.out.println("Escribe un alto para el rectangulo");
		alto = Entrada.entero();
		System.out.println("Escribe un número de rectangulos");
		rectangulos = Entrada.entero();
		for (int k = 0; k < ancho; k++) {
			for (int i = 0; i < rectangulos; i++) {
				for (int j = 0; j < alto; j++) {
					System.out.print(" *");
				}
				System.out.print("  ");
			}
			System.out.println("");
		}

	}

}
