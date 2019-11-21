package ejerciciosJAVAI;

public class CuadradosDerecha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cuadrados = 0, tam = 0;

		System.out.println("Escribe un tamaño para el cuadrado");
		tam = Entrada.entero();
		System.out.println("Escribe un número cuadrados");
		cuadrados = Entrada.entero();
		for (int k = 0; k < tam; k++) {
			for (int j = 0; j < tam*cuadrados ; j++) {
				System.out.print(" *");
				
				if ((j+1) %  tam ==0) { //si inicializo a 1 se le suma a lo contrario
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
