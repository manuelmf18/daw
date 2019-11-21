package ejerciciosJAVAI;

public class RectangulosDerecha2contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rectangulos = 0, ancho = 0, alto=0, i=0;

		System.out.println("Escribe un ancho para el rectangulo");
		ancho = Entrada.entero();
		System.out.println("Escribe un alto para el rectangulo");
		alto = Entrada.entero();
		System.out.println("Escribe un número de rectangulos");
		rectangulos = Entrada.entero();
		for (int k = 0; k < alto; k++) {
			for (int j = 0; j < ancho*rectangulos ; j++) {
				System.out.print(" *");
				i++;
				if (i==ancho) {
				System.out.print(" ");
				i=0;
				}
			}
			System.out.println("");
		}
	}

}
