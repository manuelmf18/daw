package ejerciciosJAVAI;

public class CuadradosDerecha2contadorFran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cuadrados = 0, tam = 0, i=0;

		System.out.println("Escribe un tamaño para el cuadrado");
		tam = Entrada.entero();
		System.out.println("Escribe un número cuadrados");
		cuadrados = Entrada.entero();
		for (int k = 0; k < tam; k++) {
			i=1;
			for (int j = 0; j < tam ; j++) {
				System.out.print(" *");
				if (j==tam-1 && i<cuadrados) {
				System.out.print(" ");
				i++;
				j=-1;
				}
			}
			System.out.println("");
		}
	}

}
