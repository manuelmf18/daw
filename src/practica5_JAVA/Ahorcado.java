package practica5_JAVA;

public class Ahorcado {
	static final int NUM_FILAS = 10, NUM_COL = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matrizJuego = { { "el", "perro", "tiende", "peras" }, { "su", "niño", "coge", "curvas" },
				{ "tu", "algodon", "engaña", "a los pajaros" }, { "un", null, "come", "hierba" },
				{ "mi", null, null, "aristas" }, { null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, { null, null, null, null } };

		// String[][] matrizJuego = new String[NUM_FILAS][NUM_COL];
		String[] vectorFraseSecreta = new String[4];
		char[] vecCarac = new char[5]; // vacio { 'a', 'c', 'b', 'f', '|' };

		int numColumna = 0, menu = 0, menuJugando = 0, intentos = 5; // reutilizo numColumna, menu y cad, carac ?
		String columna = new String("");
		String cad = new String("");
		String nombreColumna = new String("");
		String muestraAvance = new String("");
		char carac;
		boolean acierto = false, fin = false;
		String pista;

		while (fin == false) {
			System.out.println("\n¿Qué quiere hacer?" + "\n1.Crear matriz de juego"
					+ "\n2.Mostrar matriz de juego ordenada" + "\n3.Añadir a matriz de juego"
					+ "\n4.Buscar cadena en matriz de juego" + "\n5.Jugar" + "\n6.Salir");
			menu = Entrada.entero();

			switch (menu) {
			case 1:
				matrizJuego = creaMatrizConCadenas();
				break;
			case 2:
				System.out.println("Mostrando matriz de juego. . .");
				ordenarMatrizPorColumnas(matrizJuego);
				mostrarMatriz(matrizJuego);
				break;
			case 3:
				System.out.println("Añadir matriz de juego. . .");
				System.out.println("¿Qué quieres añadir? Articulodet/sujeto/verbo/predicado");
				nombreColumna = Entrada.cadena();

				System.out.println("Escriba la cadena a añadir:");
				cad = Entrada.cadena();

				if (anyadeCadenaAMatriz(matrizJuego, cad, nombreColumna)) {
					System.out.println("Cadena añadida con éxito");
				} else {
					System.out.println("La cadena no se ha podido añadir");
				}
				break;
			case 4:
				System.out.println("Buscar cadena en matriz de juego. . .");
				System.out.println("¿Qué cadena quieres buscar?");
				cad = Entrada.cadena();

				System.out.println("introduce columna"); // en el debug del pdf no lo pide
				numColumna = Entrada.entero();

				if (existeCadenaEnColumna(matrizJuego, cad, numColumna)) {
					System.out.println("Existe " + cad + " en la matriz de juego");
				} else {
					System.out.println("No existe " + cad + " en la matriz de juego");
				}
				break;
			case 5:
				System.out.println("-----A JUGAARRRRR-----");
				vectorFraseSecreta = generaVectorJuego(matrizJuego);
				System.out.println("¡Puede pedir hasta 5 letras para resolver la frase y puede usar pistas!");
				
				for(int i=0; i<vectorFraseSecreta.length; i++) { //comprobar si es así
				System.out.print(escondePalabra(vecCarac, vectorFraseSecreta[i]));
				}
				
				while (acierto == false && intentos != 0) {
					System.out.println("Pide letra: ");
					carac = Entrada.caracter();

					if (insertaLetraOrdenadaEnVector(vecCarac, carac)) {
						System.out.println("Se ha añadido");
						intentos--;
					} else {
						System.out.println("Esa letra ya ha sido probada"); // en esta clase es absurdo comprobar si hay
																			// hueco porque hay 5 intentos
					}
					
					for(int i=0; i<vectorFraseSecreta.length; i++) { //comprobar si es así
						System.out.print(escondePalabra(vecCarac, vectorFraseSecreta[i]));
						}

					System.out.println("Las letras que has puesto son:");
					for (int i = 0; i < vecCarac.length; i++) {
						if(vecCarac[i]!=0) { //que no salgan vacias
						System.out.print("[" + vecCarac[i] + "] ");
						}
					}

					System.out.println("\n¿Qué quiere hacer?" + "\n1.Resolver" + "\n2.Pista obtener parte de la frase"
							+ "\n3.Pista comprobar si sé una parte de la frase" + "\n4.Seguir");
					menuJugando = Entrada.entero(); // utilizo la misma?
					switch (menuJugando) {
					case 1:
						System.out.println("La frase es:");
						if (resolver()) {
							acierto = true;
						}
						break;
					case 2:
						pista = pistaParteFrase(vectorFraseSecreta, cad); // estoy reutizando variable cad
						System.out.println("Forma parte de lal frase la cadena: " + pista);
						break;
					case 3:
						System.out.println("Introduce la parte que crees saber");
						cad = Entrada.cadena();
						if (esParteDeLaFrase(vectorFraseSecreta, cad)) {
							System.out.println("¡CORRECTO! Es parte de la frase");
						}
						break;
					case 4:
						break;
					default:
						System.out.println("Opción incorrecta. . .");
					}
				}
				if (acierto) {
					System.out.println("¡Enhorabuena has acertado! Has resuelto la frase");
				} else {
					System.out.println("La frase secreta era: ");
					for (int i = 0; i < vectorFraseSecreta.length; i++) {
						System.out.print(vectorFraseSecreta[i] + " ");
					}
				}
				break;
			case 6:
				System.out.println("Hasta la próxima partidita");
				fin = true;
				break;
			default:
				System.out.println("Opción incorrecta. . .");

			}
		}

	}

	public static String[][] creaMatrizConCadenas() { // que del do while y tengo que obligar a que escriba uno ?
		int i = 0;
		String[][] matrizJuego = new String[NUM_FILAS][NUM_COL];
		String cad = new String("");

		System.out.println("Introduce los artículos, escribe \"fin\" para indicar que has terminado:");
		do {
			cad = Entrada.cadena().replace(" ", "  ");
			if (!cad.equals("fin"))
				matrizJuego[i][0] = cad;
			i++;
		} while (i < matrizJuego.length && !cad.equals("fin"));
		i = 0;

		System.out.println("Introduce los sujetos, escribe \"fin\" para indicar que has terminado:");
		do {
			cad = Entrada.cadena().replace(" ", "  ");
			if (!cad.equals("fin"))
				matrizJuego[i][1] = cad;
			i++;
		} while (i < matrizJuego.length && !cad.equals("fin"));
		i = 0;

		System.out.println("Introduce los verbos, escribe \"fin\" para indicar que has terminado:");
		do {
			cad = Entrada.cadena().replace(" ", "  ");
			if (!cad.equals("fin"))
				matrizJuego[i][2] = cad;
			i++;
		} while (i < matrizJuego.length && !cad.equals("fin"));
		i = 0;

		System.out.println("Introduce los predicados, escribe \"fin\" para indicar que has terminado:");
		do {
			cad = Entrada.cadena().replace(" ", "  ");
			if (!cad.equals("fin"))
				matrizJuego[i][3] = cad;
			i++;
		} while (i < matrizJuego.length && !cad.equals("fin"));

		return matrizJuego;
	}

	public static void mostrarMatriz(String[][] matrizJuego) { // ver otros
		for (int i = 0; i <= NUM_FILAS; i++) {
			for (int j = 0; j <= NUM_COL; j++) {
				if (i == 0) {
					if (j == 0) {
						System.out.print("\t\tArtDet \t\tSuj \t\tVerb \t\tPred \n");
					}
				} else {
					if (j == 0) {
						System.out.print((i - 1) + "\t");
					} else {
						if (matrizJuego[i - 1][j - 1] != null) {
							System.out.print("\t" + matrizJuego[i - 1][j - 1] + "\t");
						} else {
							System.out.print("\t    \t");
						}
					}
				}
			}
			System.out.println("");
		}
	}

	public static void ordenarColumnaMatriz(String[][] matrizJuego, int numColumna) { // no la utilizo sola
		int j, tam = 0;
		String temp;

		for (int i = 0; i < NUM_FILAS; i++) {
			if (matrizJuego[i][numColumna] != null) {
				tam++;
			}
		}

		String[] vectorColum = new String[tam];

		for (int i = 0; i < vectorColum.length; i++) { // repeticion de bucles int i
			vectorColum[i] = matrizJuego[i][numColumna];
		}

		for (int i = 1; i < vectorColum.length; i++) { // utilizo inserción
			temp = vectorColum[i];
			j = i - 1;
			while ((j >= 0) && (vectorColum[j].compareTo(temp) > 0)) {
				vectorColum[j + 1] = vectorColum[j];
				j--;
			}
			vectorColum[j + 1] = temp;
		}

		for (int i = 0; i < vectorColum.length; i++) {
			matrizJuego[i][numColumna] = vectorColum[i];
		}

	}

	public static void ordenarMatrizPorColumnas(String[][] matrizJuego) {
		for (int x = 0; x < NUM_COL; x++) {
			ordenarColumnaMatriz(matrizJuego, x);
		}
	}

	public static boolean existeCadenaEnColumna(String[][] matrizJuego, String cad, int numColumna) {
		int centro, inf = 0, filasLlenas = 0;

		for (int i = 0; i < matrizJuego.length; i++) {
			if (matrizJuego[i][numColumna] != null) {
				filasLlenas++;
			}
		}

		int sup = filasLlenas - 1;

		if (!(cad.compareTo(matrizJuego[inf][numColumna]) < 0 && cad.compareTo(matrizJuego[sup][numColumna]) > 0)) {
			while (inf <= sup) {
				centro = (sup + inf) / 2;
				if (cad.compareTo(matrizJuego[centro][numColumna]) == 0) {
					return true;
				} else if (cad.compareTo(matrizJuego[centro][numColumna]) < 0) {
					sup = centro - 1;
				} else {
					inf = centro + 1;
				}
			}
		}
		return false;

	}

	public static boolean anyadeCadenaAMatriz(String[][] matrizJuego, String cad, String nombreColumna) {
		int columna = 0;
		if (nombreColumna.equals("articulodet")) {
			columna = 0;
		} else {
			if (nombreColumna.equals("sujeto")) {
				columna = 1;
			} else {
				if (nombreColumna.equals("verbo")) {
					columna = 2;
				} else {
					if (nombreColumna.equals("predicado")) {
						columna = 3;
					}
				}
			}
		}

		if (!existeCadenaEnColumna(matrizJuego, cad, columna)) {
			for (int i = 0; i < matrizJuego.length; i++) {
				if (matrizJuego[i][columna] == null) {
					matrizJuego[i][columna] = cad.replace(" ", "  ");
					return true; // no está dentro y la columna no está llena
				}
			}
			return false; // está llena
		} else {
			return false; // ya está dentro
		}

	}

	public static String[] generaVectorJuego(String[][] matrizJuego) {
		String[] vector = new String[NUM_COL];
		int numAleatorio;

		for (int i = 0; i < vector.length; i++) {
			do {
				numAleatorio = (int) Math.floor(Math.random() * (9 - 0 + 1));
			} while (matrizJuego[numAleatorio][i] == null);
			vector[i] = matrizJuego[numAleatorio][i];
		}
		return vector;
	}

	public static boolean contiene(char[] vector, char carac) { // no la utilizo sola
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == carac) {
				return true;
			}
		}
		return false;
	}

	public static boolean insertaLetraOrdenadaEnVector(char[] vector, char carac) {
		int j;
		char temp;

		if (!contiene(vector, carac)) {
			for (int x = 0; x < vector.length; x++) {
				if (vector[x] == (0)) { // '|'
					vector[x] = carac;
					for (int i = 1; i < vector.length; i++) { // utilizo inserción
						temp = vector[i];
						j = i - 1;
						while ((j >= 0) && (vector[j] == temp)) {
							vector[j + 1] = vector[j];
							j--;
						}
						vector[j + 1] = temp;
					}
					return true;
				}
			}
		}
		return false;
	}

	public static String escondePalabra(char[] vector, String cad) {
		String palabras = new String("");

		for (int i = 0; i < cad.length(); i++) {
			if (contiene(vector, cad.charAt(i))) {
				palabras += cad.charAt(i);
			} else {
				if (cad.charAt(i) == ' ') {
					palabras += " ";
				} else {
					palabras += "_ ";
				}
			}
			System.out.print(" ");
		}
		return palabras;
	}

	public static String pistaParteFrase(String[] vectorCad, String cad) {
		String cad4 = "";
		return cad4;
	}

	public static boolean esParteDeLaFrase(String[] vectorCad, String cad) {
		return false;
	}

	public static boolean resolver() {
		return false;
	}

}
