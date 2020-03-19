package ejerciciosMatrices;

public class Golpistas {
	static final int GOLFISTAS = 5;
	static final int JORNADAS = 4;
	public static int[][] golfistas_jornadas = { { 10, 12, 10, 14 }, { 11, 9, 13, 14 }, { 12, 11, 10, 14 },
			{ 10, 13, 10, 10 }, { 10, 15, 12, 12 } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		rellenaMatriz();
		muestraResultados();
		
	}

	public static void rellenaMatriz() {
		for (int i = 0; i < GOLFISTAS; i++) {
			System.out.println("Jugador " + i + ":");
			for (int j = 0; j < JORNADAS; j++) {
				System.out.println("Introduzca el número de golpes de la jornada " + j + ":");
				golfistas_jornadas[i][j] = Entrada.entero();
			}
		}
	}

	public static void muestraResultados() {
		for (int i = 0; i <= GOLFISTAS; i++) {
			for (int j = 0; j <= JORNADAS; j++) {
				if (i == 0) {
					if (j == 0) {
						System.out.print("Jornadas:\t");
					}
					if (j != JORNADAS) {
						System.out.print((j + 1) + "\t");
					}
				} else {
					if (j == 0) {
						System.out.print("Juagador " + i + "\t");
					} else {
						System.out.print(golfistas_jornadas[i - 1][j - 1] + "\t");
					}
				}
			}
			System.out.println("");
		}
	}
	
	public static void calculaPuntosDeJornada(int [] punt_golf) {
		
		
		
	}
	public static void calculaMejoresRegistros () {
		int [] [] golfistas_jornadas_ordenados= new int [golfistas_jornadas.length] [golfistas_jornadas[1].length]; //clonar
				
				
	}
}
