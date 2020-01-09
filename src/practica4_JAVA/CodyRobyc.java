package practica4_JAVA;

public class CodyRobyc {

	public static int barrera1X = 0, barrera1Y = 0, barrera2X = 0, barrera2Y = 0;
	public static int coordXCody = 0, coordYCody = 0, coordXRoby = 0, coordYRoby = 0;
	public final static int TAM_TABLERO = 4;
	public static boolean ganador = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String robotJuega = new String("Cody");
		int numMovimientos = 0, numCaras = 0;

		System.out.println("-------------¡BIENVENIDOS A CODY Y ROBY!-------------");
		System.out.println("¿De cuantas caras es tu dado?");
		numCaras = Entrada.entero();

		System.out.println("\nEmpezamos\n");

		coordXCody = coordenadaAleatoria();
		coordYCody = coordenadaAleatoria();

		while ((coordXRoby == 0 && coordYRoby == 0) || (coordXCody == coordXRoby && coordYCody == coordYRoby)) {
			coordXRoby = coordenadaAleatoria();
			coordYRoby = coordenadaAleatoria();
		}

		asignaValoresBarreras();
		mostrarTablero();

		while (!ganador) {
			System.out.println("¡Es el turno de " + robotJuega + "!\n");
			System.out.println("Pulsa la tecla d para lanzar dado...");
			Entrada.caracter();
			numMovimientos = tirarDado(numCaras);
			System.out.println("Ha salido " + numMovimientos);

			if (ejecutarJugada(numMovimientos, robotJuega))
				System.out.println("Se completó la jugada");
			else
				System.out.println("No se pudo completar la jugada, " + robotJuega
						+ " se ha salido del tablero o ha chocado con una barrera");

			if (ganador)
				System.out.println("Ha ganado " + robotJuega);
			else {
				mostrarTablero();
				if (robotJuega.equals("Cody"))
					robotJuega = "Roby";
				else
					robotJuega = "Cody";
			}
		}
	}

	public static int coordenadaAleatoria() {
		int valor = 0;

		while (valor % 2 == 0)
			valor = (int) Math.round(Math.random() * TAM_TABLERO * 2);

		return valor * 3;
	}

	public static void asignaValoresBarreras() {
		while ((barrera1X == 0 && barrera1Y == 0) || (barrera1X == coordXCody && barrera1Y == coordYCody)
				|| (barrera1X == coordXRoby && barrera1Y == coordYRoby)) {
			barrera1X = coordenadaAleatoria();
			barrera1Y = coordenadaAleatoria();
		}

		while ((barrera1X == barrera2X && barrera1Y == barrera2Y) || (barrera2X == 0 && barrera2Y == 0)
				|| (barrera2X == coordXCody && barrera2Y == coordYCody)
				|| (barrera2X == coordXRoby && barrera2Y == coordYRoby)) {
			barrera2X = coordenadaAleatoria();
			barrera2Y = coordenadaAleatoria();
		}
	}

	public static void mostrarTablero() {
		for (int i = 0; i <= 6 * TAM_TABLERO; i++) {
			for (int j = 0; j <= 6 * TAM_TABLERO; j++) {
				if (i % 6 == 0 || j % 6 == 0)
					System.out.print("* ");
				else if ((barrera1X == j && barrera1Y == i) || (barrera2X == j && barrera2Y == i))
					System.out.print("B ");
				else if (coordXCody == j && coordYCody == i)
					System.out.print("C ");
				else if (coordXRoby == j && coordYRoby == i)
					System.out.print("R ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static int tirarDado(int numMayor) {
		return (int) (Math.round(Math.random() * (numMayor - 1) + 1));
	}

	public static boolean moverArriba(String robot) {
		if (robot.equals("Cody") && coordYCody - 6 >= 3 && (coordXCody != barrera1X || coordYCody - 6 != barrera1Y)
				&& (coordXCody != barrera2X || coordYCody - 6 != barrera2Y)) {
			coordYCody = coordYCody - 6;
			return true;
		} else if (robot.equals("Roby") && coordYRoby - 6 >= 3
				&& (coordXRoby != barrera1X || coordYRoby - 6 != barrera1Y)
				&& (coordXRoby != barrera2X || coordYRoby - 6 != barrera2Y)) {
			coordYRoby = coordYRoby - 6;
			return true;
		} else
			return false;
	}

	public static boolean moverAbajo(String robot) {
		if (robot.equals("Cody") && coordYCody + 6 <= TAM_TABLERO * 6 - 3
				&& (coordXCody != barrera1X || coordYCody + 6 != barrera1Y)
				&& (coordXCody != barrera2X || coordYCody + 6 != barrera2Y)) {
			coordYCody = coordYCody + 6;
			return true;
		} else if (robot.equals("Roby") && coordYRoby + 6 <= TAM_TABLERO * 6 - 3
				&& (coordXRoby != barrera1X || coordYRoby + 6 != barrera1Y)
				&& (coordXRoby != barrera2X || coordYRoby + 6 != barrera2Y)) {
			coordYRoby = coordYRoby + 6;
			return true;
		} else
			return false;
	}

	public static boolean moverDerecha(String robot) {
		if (robot.equals("Cody") && coordXCody + 6 <= TAM_TABLERO * 6 - 3
				&& (coordXCody + 6 != barrera1X || coordYCody != barrera1Y)
				&& (coordXCody + 6 != barrera2X || coordYCody != barrera2Y)) {
			coordXCody = coordXCody + 6;
			return true;
		} else if (robot.equals("Roby") && coordXRoby + 6 <= TAM_TABLERO * 6 - 3
				&& (coordXRoby + 6 != barrera1X || coordYRoby != barrera1Y)
				&& (coordXRoby + 6 != barrera2X || coordYRoby != barrera2Y)) {
			coordXRoby = coordXRoby + 6;
			return true;
		} else
			return false;
	}

	public static boolean moverIzquierda(String robot) {
		if (robot.equals("Cody") && coordXCody - 6 >= 3 && (coordXCody - 6 != barrera1X || coordYCody != barrera1Y)
				&& (coordXCody - 6 != barrera2X || coordYCody != barrera2Y)) {
			coordXCody = coordXCody - 6;
			return true;
		} else if (robot.equals("Roby") && coordXRoby - 6 >= 3
				&& (coordXRoby - 6 != barrera1X || coordYRoby != barrera1Y)
				&& (coordXRoby - 6 != barrera2X || coordYRoby != barrera2Y)) {
			coordXRoby = coordXRoby - 6;
			return true;
		} else
			return false;
	}

	public static boolean ejecutarJugada(int numMovimientos, String robot) {
		if (robot.equals("Cody"))
			return ejecutarJugadaCody(numMovimientos);
		else if (robot.equals("Roby"))
			return ejecutarJugadaRobyRec(numMovimientos);
		else
			return false;
	}

	public static boolean ejecutarJugadaCody(int numMovimientos) {
		String mov = new String("");

		while (numMovimientos > 0) {
			System.out.println("Indique el movimiento: ");
			mov = Entrada.cadena().toLowerCase();

			switch (mov) {
			case "ar":
				if (moverArriba("Cody")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					numMovimientos--;
				} else {
					return false;
				}
				break;
			case "ab":
				if (moverAbajo("Cody")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					numMovimientos--;
				} else
					return false;
				break;
			case "de":
				if (moverDerecha("Cody")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					numMovimientos--;
				} else
					return false;
				break;
			case "iz":
				if (moverIzquierda("Cody")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					numMovimientos--;
				} else
					return false;
				break;
			}
		}
		return true;
	}

	public static boolean ejecutarJugadaRobyRec(int numMovimientos) {
		int mov = 0;

		if (numMovimientos == 0)
			return true;
		else {
			mov = (int) Math.round(Math.random() * (4 - 1) + 1);

			switch (mov) {
			case 1:
				System.out.println("ar");
				if (moverArriba("Roby")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					return ejecutarJugadaRobyRec(numMovimientos - 1);
				} else {
					return false;
				}
			case 2:
				System.out.println("ab");
				if (moverAbajo("Roby")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					return ejecutarJugadaRobyRec(numMovimientos - 1);
				} else
					return false;
			case 3:
				System.out.println("de");
				if (moverDerecha("Roby")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					return ejecutarJugadaRobyRec(numMovimientos - 1);
				} else
					return false;

			case 4:
				System.out.println("iz");
				if (moverIzquierda("Roby")) {
					if (coordXRoby == coordXCody && coordYRoby == coordYCody) {
						ganador = true;
						return true;
					}
					return ejecutarJugadaRobyRec(numMovimientos - 1);
				} else
					return false;
			}
		}

		return true;
	}

	public static boolean ejecutarJugadaRoby(int numMovimientos) {
		int mov = 0;

		while (numMovimientos > 0) {
			mov = (int) Math.round(Math.random() * (4 - 1) + 1);

			switch (mov) {
			case 1:
				if (moverArriba("Roby"))
					numMovimientos--;
				else {
					return false;
				}
				break;
			case 2:
				if (moverAbajo("Roby"))
					numMovimientos--;
				else
					return false;
				break;
			case 3:
				if (moverDerecha("Roby"))
					numMovimientos--;
				else
					return false;
				break;
			case 4:
				if (moverIzquierda("Roby"))
					numMovimientos--;
				else
					return false;
				break;
			}
		}

		return true;
	}
}