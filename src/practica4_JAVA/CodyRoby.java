package practica4_JAVA;

public class CodyRoby {

	final static int TAM_TABLERO = 5;
	static int barrera1X = 0, barrera1Y = 0, barrera2X = 0, barrera2Y = 0;
	static int coordXCody = 0, coordYCody = 0, coordXRoby = 0, coordYRoby = 0;
	static String robotJuega = new String("Cody");
	static boolean ganador = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int CarasDado = 0, numAleatorio = 0;

		System.out.println("---------------¡BIENVENIDOS A CODY Y ROBY!---------------");
		System.out.println("¿De cuantas caras es tu dado?");
		CarasDado = Entrada.entero();

		coordXCody = coordenadaAleatoria();
		coordYCody = coordenadaAleatoria();

		coordXRoby = coordenadaAleatoria();
		coordYRoby = coordenadaAleatoria();

		while (coordXCody == coordXRoby && coordYCody == coordYRoby) {
			coordXRoby = coordenadaAleatoria();
			coordYRoby = coordenadaAleatoria();
		}
		asignaValoresBarreras();
		System.out.println("Empezamos");
		mostrarTablero();

		while (!ganador) {
			System.out.println("¡Es el turno de " + robotJuega + "!");

			System.out.println("Pulsa la tecla d para lanzar dado...");
			Entrada.caracter();
			numAleatorio = tirarDado(CarasDado);
			System.out.println("Ha salido " + numAleatorio);

			if (ejecutarJugada(numAleatorio, robotJuega)) {
				System.out.println("Se completó la jugada");
			} else {
				System.out.println("No se pudo completar la jugada, " + robotJuega
						+ " se ha salido del tablero o ha chocado con una barrera");
			}

			if (ganador) {
				System.out.println("Ha ganado " + robotJuega);
			} else {
				mostrarTablero();
				if (robotJuega.equals("Cody")) {
					robotJuega = "Roby";
				} else {
					robotJuega = "Cody";
				}
			}
		}
	}

	public static int coordenadaAleatoria() {
		int coordenada = 2; // un número par cualquiera para que entre
		while (coordenada % 2 == 0) {
			coordenada = (int) Math.round(Math.random() * (TAM_TABLERO * 2));
		}
		return coordenada * 3;
	}

	public static void asignaValoresBarreras() {

		barrera1X = coordenadaAleatoria();
		barrera1Y = coordenadaAleatoria();

		while ((coordXCody == barrera1X && coordYCody == barrera1Y)
				|| (coordXRoby == barrera1X && coordYRoby == barrera1Y)) {
			barrera1X = coordenadaAleatoria();
			barrera1Y = coordenadaAleatoria();
		}

		barrera2X = coordenadaAleatoria();
		barrera2Y = coordenadaAleatoria();

		while ((coordXCody == barrera2X && coordYCody == barrera2Y)
				|| (coordXRoby == barrera2X && coordYRoby == barrera2Y)
				|| (barrera1X == barrera2X && barrera1Y == barrera2Y)) {
			barrera2X = coordenadaAleatoria();
			barrera2Y = coordenadaAleatoria();
		}
	}

	public static void mostrarTablero() {
		int cuadrado = 6; // de 0 a 5
		for (int y = 0; y <= cuadrado * TAM_TABLERO; y++) {

			for (int x = 0; x <= cuadrado * TAM_TABLERO; x++) {
				if (y % cuadrado == 0 || x % cuadrado == 0) {
					System.out.print(" *");
				} else {
					if (x == coordXCody && y == coordYCody) {
						System.out.print(" C");
					} else {
						if (x == coordXRoby && y == coordYRoby) {
							System.out.print(" R");

						} else {
							if (x == barrera1X && y == barrera1Y) {
								System.out.print(" B");

							} else {
								if (x == barrera2X && y == barrera2Y) {
									System.out.print(" B");
								} else {
									System.out.print("  ");
								}
							}
						}
					}
				}

			}
			System.out.println();
		}

	}

	public static int tirarDado(int CarasDado) {
		int numAleatorio = 0, minimo = 1;

		numAleatorio = (int) Math.floor(Math.random() * (CarasDado) + (minimo));
		return numAleatorio;
	}

	public static boolean moverArriba(String robotJuega) {
		boolean esPosible = false;

		if (robotJuega.equals("Cody")) {
			coordYCody = coordYCody - 6;
			if (coordYCody >= 3 && (coordYCody != barrera1Y || coordXCody != barrera1X)
					&& (coordYCody != barrera2Y || coordXCody != barrera2X) && (coordYCody <= (TAM_TABLERO * 6 - 3))) {
				esPosible = true;
			} else {
				esPosible = false;
				coordYCody = coordYCody + 6; // vuelve a su valor
			}
		} else {
			coordYRoby = coordYRoby - 6;
			if (coordYRoby >= 3 && (coordYRoby != barrera1Y || coordXRoby != barrera1X)
					&& (coordYRoby != barrera2Y || coordXRoby != barrera2X) && (coordYRoby <= (TAM_TABLERO * 6 - 3))) {
				esPosible = true;
			} else {
				esPosible = false;
				coordYRoby = coordYRoby + 6;

			}
		}
		return esPosible;
	}

	public static boolean moverAbajo(String robotJuega) {
		boolean esPosible = false;

		if (robotJuega.equals("Cody")) {
			coordYCody = coordYCody + 6;
			if (coordYCody >= 3 && (coordYCody != barrera1Y || coordXCody != barrera1X)
					&& (coordYCody != barrera2Y || coordXCody != barrera2X) && (coordYCody <= (TAM_TABLERO * 6 - 3))) {
				esPosible = true;
			} else {
				esPosible = false;
				coordYCody = coordYCody - 6;
			}
		} else {
			coordYRoby = coordYRoby + 6;
			if (coordYRoby >= 3 && (coordYRoby != barrera1Y || coordXRoby != barrera1X)
					&& (coordYRoby != barrera2Y || coordXRoby != barrera2X) && (coordYRoby <= (TAM_TABLERO * 6 - 3))) {
				esPosible = true;
			} else {
				esPosible = false;
				coordYRoby = coordYRoby - 6;

			}

		}
		return esPosible;
	}

	public static boolean moverDerecha(String robotJuega) {
		boolean esPosible = false;

		if (robotJuega.equals("Cody")) {
			coordXCody = coordXCody + 6;
			if (coordXCody >= 3 && (coordYCody != barrera1Y || coordXCody != barrera1X)
					&& (coordYCody != barrera2Y || coordXCody != barrera2X) && coordXCody <= (TAM_TABLERO * 6 - 3)) {
				esPosible = true;
			} else {
				esPosible = false;
				coordXCody = coordXCody - 6;
			}
		} else {
			coordXRoby = coordXRoby + 6;
			if (coordXRoby >= 3 && (coordYRoby != barrera1Y || coordXRoby != barrera1X)
					&& (coordYRoby != barrera2Y || coordXRoby != barrera2X) && coordXRoby <= (TAM_TABLERO * 6 - 3)) {
				esPosible = true;
			} else {
				esPosible = false;
				coordXRoby = coordXRoby - 6;

			}

		}
		return esPosible;
	}

	public static boolean moverIzquierda(String robotJuega) {
		boolean esPosible = false;

		if (robotJuega.equals("Cody")) {
			coordXCody = coordXCody - 6;
			if (coordXCody >= 3 && (coordYCody != barrera1Y || coordXCody != barrera1X)
					&& (coordYCody != barrera2Y || coordXCody != barrera2X) && coordXCody <= (TAM_TABLERO * 6 - 3)) {
				esPosible = true;
			} else {
				esPosible = false;
				coordXCody = coordXCody + 6;
			}
		} else {
			coordXRoby = coordXRoby - 6;
			if (coordXRoby >= 3 && (coordYRoby != barrera1Y || coordXRoby != barrera1X)
					&& (coordYRoby != barrera2Y || coordXRoby != barrera2X) && coordXRoby <= (TAM_TABLERO * 6 - 3)) {
				esPosible = true;
			} else {
				esPosible = false;
				coordXRoby = coordXRoby + 6;
			}

		}
		return esPosible;
	}

	public static boolean ejecutarJugadaCody(int numAleatorio) {
		boolean ejecucionCody = false;
		String movimiento = new String("ar");

		while (numAleatorio > 0) {
			System.out.println("Indique el movimiento:");
			movimiento = Entrada.cadena();

			if (movimiento.equalsIgnoreCase("ar")) {
				if (moverArriba(robotJuega)) {
					ejecucionCody = true;
				} else {
					ejecucionCody = false;
				}
			} else {
				if (movimiento.equalsIgnoreCase("ab")) {
					if (moverAbajo(robotJuega)) {
						ejecucionCody = true;
					} else {
						ejecucionCody = false;
					}
				} else {
					if (movimiento.equalsIgnoreCase("de")) {
						if (moverDerecha(robotJuega)) {
							ejecucionCody = true;
						} else {
							ejecucionCody = false;
						}
					} else {
						if (movimiento.equalsIgnoreCase("iz")) {
							if (moverIzquierda(robotJuega)) {
								ejecucionCody = true;
							} else {
								ejecucionCody = false;
							}
						} else {
							ejecucionCody = false;
						}
					}
				}
			}
			if (ejecucionCody) {
				if (coordYCody == coordYRoby && coordXCody == coordXRoby) {
					ganador = true;
					numAleatorio = 0;
				}
			} else {
				numAleatorio = 0;
			}
			numAleatorio--;
		}
		return ejecucionCody;
	}

	public static boolean ejecutarJugadaRoby(int numAleatorio) {
		boolean ejecucionRoby = false;
		int movimientoAleatorio = 0;

		while (numAleatorio > 0) {

			movimientoAleatorio = (int) Math.floor((Math.random() * 4) + 1);
			if (movimientoAleatorio == 1) {
				System.out.println("ar");
				if (moverArriba(robotJuega)) {
					ejecucionRoby = true;
				} else {
					ejecucionRoby = false;
				}
			} else {
				if (movimientoAleatorio == 2) {
					System.out.println("ab");
					if (moverAbajo(robotJuega)) {
						ejecucionRoby = true;
					} else {
						ejecucionRoby = false;
					}
				} else {
					if (movimientoAleatorio == 3) {
						System.out.println("de");
						if (moverDerecha(robotJuega)) {
							ejecucionRoby = true;
						} else {
							ejecucionRoby = false;
						}
					} else {
						if (movimientoAleatorio == 4) {
							System.out.println("iz");
							if (moverIzquierda(robotJuega)) {
								ejecucionRoby = true;
							} else {
								ejecucionRoby = false;
							}
						} else {
							ejecucionRoby = false;
						}
					}
				}
			}
			if (ejecucionRoby) {
				if (coordYRoby == coordYCody && coordXRoby == coordXCody) {
					ganador = true;
					numAleatorio = 0;
				}
			} else {
				numAleatorio = 0;
			}
			numAleatorio--;
		}
		return ejecucionRoby;
	}

	public static boolean ejecutarJugadaRobyR(int numAleatorio) {
		boolean ejecucionRoby = false;
		int movimientoAleatorio = 0;

		if (numAleatorio > 0) { //casos base

			movimientoAleatorio = (int) Math.floor((Math.random() * 4) + 1);
			if (movimientoAleatorio == 1) {
				System.out.println("ar");
				if (moverArriba(robotJuega)) {
					ejecucionRoby = true;
				} else {
					ejecucionRoby = false;
				}
			} else {
				if (movimientoAleatorio == 2) {
					System.out.println("ab");
					if (moverAbajo(robotJuega)) {
						ejecucionRoby = true;
					} else {
						ejecucionRoby = false;
					}
				} else {
					if (movimientoAleatorio == 3) {
						System.out.println("de");
						if (moverDerecha(robotJuega)) {
							ejecucionRoby = true;
						} else {
							ejecucionRoby = false;
						}
					} else {
						if (movimientoAleatorio == 4) {
							System.out.println("iz");
							if (moverIzquierda(robotJuega)) {
								ejecucionRoby = true;
							} else {
								ejecucionRoby = false;
							}
						} else {
							ejecucionRoby = false;
						}
					}
				}
			}
			// caso base true
			if (ejecucionRoby) {
				if (coordYRoby == coordYCody && coordXRoby == coordXCody) {
					ganador = true;
					numAleatorio = 0;
				}
			} else { // caso base false
				numAleatorio = 0;
			}

		} else { // caso recursivo
			ejecutarJugadaRobyR(numAleatorio);
		}
		return ejecucionRoby;
	}

	public static boolean ejecutarJugada(int numAleatorio, String robotJuega) {
		boolean ejecucionJugada = false;
		if (robotJuega.equals("Cody")) {
			if (ejecutarJugadaCody(numAleatorio)) {
				ejecucionJugada = true;
			} else {
				ejecucionJugada = false;
			}
		} else {
			if (ejecutarJugadaRobyR(numAleatorio)) {
				ejecucionJugada = true;
			} else {
				ejecucionJugada = false;
			}
		}
		return ejecucionJugada;
	}
}
