package ejerciciosMatrices;

public class DosCorredores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] tiempos = { { 9.98, 11.40, 8.39, 9.90, 10.13 }, { 9.98, 11.45, 9.39, 9.72, 9.97 } };
		int[] posicion = new int[2];
		int numCorredor = 1, masRapido = 0;

		System.out.println("¿Añade los tiempos al corredor "+numCorredor);
		pideTiempos(tiempos, numCorredor);

		numCorredor++;
		System.out.println("¿Añade los tiempos al corredor "+numCorredor);
		pideTiempos(tiempos, numCorredor);

		posicion = calculaPuntos(tiempos);

		System.out.println("Puntuación: ");
		for (int i = 0; i < posicion.length; i++) {
			System.out.println("El corredor " + (i + 1) + " tiene: " + posicion[i] + " puntos");
		}

		if (posicion[0] == posicion[1]) {
			System.out.println("Hay empate de puntos");
			masRapido = corredorConMenorTiempo(tiempos);
			System.out.println("El corredor que ha hecho la carrera más rápida es el " + (masRapido + 1)
					+ " y por lo tanto él es el ganador");
		} else {
			System.out.println("Ha ganado " + numCorredor);
		}

	}

	public static void pideTiempos(double[][] tiempos, int numCorredor) {
		int fila=numCorredor-1;
		for (int j = 0; j < tiempos[fila].length; j++) {
			System.out.println("Introduce el tiempo de la carrera " + (j+1));
			tiempos[fila][j] = Entrada.real();
		}
	}

	public static int[] calculaPuntos(double[][] tiempos) {
		int[] resultado = new int[2];

		for (int i = 0; i < tiempos.length; i++) {
			for (int j = 0; j < tiempos[i].length; j++) {
				if (tiempos[0][j] > tiempos[1][j]) {
					resultado[0] += 3;
					resultado[1] += 1;
				} else {
					if (tiempos[0][j] < tiempos[1][j]) {
						resultado[0] += 1;
						resultado[1] += 3;
					} else {
						resultado[0] += 2;
						resultado[1] += 2;
					}
				}
			}
		}
		return resultado;
	}

	public static int corredorConMenorTiempo(double[][] tiempos) {
		int corredor = 0;
		double menorTiempo = tiempos[0][0];

		for (int i = 0; i < tiempos.length; i++) {
			for (int j = 0; j < tiempos[i].length; j++) {
				if (tiempos[i][j] < menorTiempo) {
					menorTiempo = tiempos[i][j];
					corredor = i + 1;
				}
			}
		}
		return corredor;
	}
}