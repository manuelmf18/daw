package ejerciciosJAVAI;

public class RectangulosDerecha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rectangulos = 0, ancho = 0, alto=0;

		System.out.println("Escribe un ancho para el rectangulo");
		ancho = Entrada.entero();
		System.out.println("Escribe un alto para el rectangulo");
		alto = Entrada.entero();
		System.out.println("Escribe un número de rectangulos");
		rectangulos = Entrada.entero();
		for (int k = 0; k < alto; k++) {
			for (int j = 0; j < ancho*rectangulos ; j++) {
				System.out.print(" *");
				if ((j+1) % ancho ==0) { //si inicializo a 1 se le suma a lo contrario
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
