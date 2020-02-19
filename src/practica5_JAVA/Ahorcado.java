package practica5_JAVA;

public class Ahorcado {
	static final int NUM_FILAS = 10, NUM_COL = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[][] matrizJuego = { { "el", "perro", "tiende", "peras" }, { "su",
		 "niño", "coge", "curvas" },
		 { "tu", "algodon", "engaña", "a los pajaros" }, { "un", null, "come",
		 "hierba" },
		 { "mi", null, null, "aristas" }, { null, null, null, null }, { null, null,
		 null, null },
		 { null, null, null, null }, { null, null, null, null }, { null, null, null,
		 null } };

//		String[][] matrizJuego = new String[NUM_FILAS][NUM_COL];
		String[] vectorFraseSecreta = new String[4];
		char[] vecCarac = new char[5];

		for (int i = 0; i < vecCarac.length; i++) { // para luego ordenarlo
			vecCarac[i] = '|';
		}

		int menu = 0, menuJugando = 0, intentos = 5;
		String cad = new String("");
		String nombreColumna = new String("");
		String pista;
		char carac;
		boolean acierto = false, fin = false, existe = false;

		while (fin == false) {

			System.out.println("\n¿Qué quiere hacer?" + "\n1.Crear matriz de juego"
					+ "\n2.Mostrar matriz de juego ordenada" + "\n3.Añadir a matriz de juego"
					+ "\n4.Buscar cadena en matriz de juego" + "\n5.Jugar" + "\n6.Salir");
			menu = Entrada.entero();

			switch (menu) {
			case 1:
				matrizJuego = creaMatrizConCadenas();
				ordenarMatrizPorColumnas(matrizJuego);
				break;

			case 2:
				System.out.println("Mostrando matriz de juego. . . \n");
				ordenarMatrizPorColumnas(matrizJuego);
				mostrarMatriz(matrizJuego);
				break;

			case 3:
				System.out.println("Añadir matriz de juego. . . \n");
				System.out.println("¿Qué quieres añadir? articulodet/sujeto/verbo/predicado");
				nombreColumna = Entrada.cadena();

				System.out.println("Escriba la cadena a añadir:");
				cad = Entrada.cadena();

				if (anyadeCadenaAMatriz(matrizJuego, cad, nombreColumna)) {
					System.out.println("Cadena añadida con éxito");

					switch (nombreColumna) {
					case "articulodet":
						ordenarColumnaMatriz(matrizJuego, 0);
						break;
					case "sujeto":
						ordenarColumnaMatriz(matrizJuego, 1);
						break;
					case "verbo":
						ordenarColumnaMatriz(matrizJuego, 2);
						break;
					case "predicado":
						ordenarColumnaMatriz(matrizJuego, 3);
						break;
					}

				} else {
					System.out.println("La cadena no se ha podido añadir");
				}
				break;

			case 4:
				System.out.println("Buscar cadena en matriz de juego. . . \n");

				System.out.println("¿Qué cadena quieres buscar?");
				cad = Entrada.cadena();

				for (int i = 0; i < NUM_COL; i++) {
					if (existeCadenaEnColumna(matrizJuego, cad, i)) {
						existe = true;
					}
				}

				if (existe) {
					System.out.println("Existe " + cad + " en la matriz de juego");
					existe = false;
				} else {
					System.out.println("No existe " + cad + " en la matriz de juego");
				}
				break;

			case 5:
				System.out.println("-----A JUGAARRRRR----- \n");

				vectorFraseSecreta = generaVectorJuego(matrizJuego);
				System.out.println("¡Puede pedir hasta 5 letras para resolver la frase y puede usar pistas!");

				for (int i = 0; i < vectorFraseSecreta.length; i++) {
					System.out.print(escondePalabra(vecCarac, vectorFraseSecreta[i]));
				}

				while (acierto == false && intentos != 0) {
					System.out.println("Pide letra: ");
					carac = Entrada.caracter();

					while (!insertaLetraOrdenadaEnVector(vecCarac, carac)) { // para que no inserte una letra repetida
						System.out.println("Esa letra ya ha sido probada");
					}
					intentos--;

					for (int i = 0; i < vectorFraseSecreta.length; i++) {
						System.out.print(escondePalabra(vecCarac, vectorFraseSecreta[i]));
					}

					System.out.println("\n Las letras que has puesto son:");
					for (int i = 0; i < vecCarac.length - intentos; i++) {
						if (vecCarac[i] != 0) {
							System.out.print("[" + vecCarac[i] + "] ");
						}
					}

					System.out.println("\n¿Qué quiere hacer?" + "\n1.Resolver" + "\n2.Pista obtener parte de la frase"
							+ "\n3.Pista comprobar si sé una parte de la frase" + "\n4.Seguir");
					menuJugando = Entrada.entero();

					switch (menuJugando) {
					case 1:
						System.out.println("La frase es:");
						cad = Entrada.cadena();

						if (resolver(vectorFraseSecreta, cad)) {
							acierto = true;
						} else {
							System.out.println("Esa no es la frase secreta \n");
						}
						break;

					case 2:
						pista = pistaParteFrase(vectorFraseSecreta);
						System.out.println("Forma parte de la frase la cadena: " + pista);
						break;

					case 3:
						System.out.println("Escribe la parte de la frase que crees saber");
						cad = Entrada.cadena();

						if (esParteDeLaFrase(vectorFraseSecreta, cad)) {
							System.out.println("Pues sí, " + cad + " forma parte de la frase");
						} else {
							System.out.println("No, " + cad + " no forma parte de la frase \n");
						}
						break;

					case 4:
						break;
					default:
						System.out.println("Opción incorrecta. . . \n");
					}
				}

				if (acierto) {
					System.out.println("¡Enhorabuena! Has resuelto la frase");
					acierto = false;
				} else {
					System.out.println("La frase secreta era: ");
					for (int i = 0; i < vectorFraseSecreta.length; i++) {
						System.out.print(vectorFraseSecreta[i] + " ");
					}
				}

				System.out.println("\n \n");

				for (int i = 0; i < vecCarac.length; i++) { // para que no se queden las letras si se juega otra partida
					vecCarac[i] = '|';
				}
				intentos = 5;
				break;

			case 6:
				System.out.println("Hasta la próxima partidita");
				fin = true;
				break;
			default:
				System.out.println("Opción incorrecta. . .");

				System.out.println("");
			}
		}

	}

	public static String[][] creaMatrizConCadenas() {
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

	public static void mostrarMatriz(String[][] matrizJuego) {

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

	public static void ordenarColumnaMatriz(String[][] matrizJuego, int numColumna) {
		int j, tam = 0;
		String temp;

		for (int i = 0; i < NUM_FILAS; i++) {
			if (matrizJuego[i][numColumna] != null) {
				tam++;
			}
		}

		String[] vectorColum = new String[tam];

		for (int i = 0; i < vectorColum.length; i++) {
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

		for (int i = 0; i < matrizJuego.length; i++) { // veo cuantas posiciones va a comparar
			if (matrizJuego[i][numColumna] != null) {
				filasLlenas++;
			}
		}

		int sup = filasLlenas - 1;

		if (!(cad.compareTo(matrizJuego[inf][numColumna]) < 0 && cad.compareTo(matrizJuego[sup][numColumna]) > 0)) {
			// este if es una comprobación de si la cadena podría ser encontrada dentro o si
			// no está entre los valores
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
			return false; // ya estaba dentro
		}

	}

	public static String[] generaVectorJuego(String[][] matrizJuego) {
		String[] vector = new String[NUM_COL];
		int numAleatoria;

		for (int i = 0; i < vector.length; i++) {
			do {
				numAleatoria = (int) Math.floor(Math.random() * ((NUM_FILAS - 1) - 0 + 1));
			} while (matrizJuego[numAleatoria][i] == null);
			vector[i] = matrizJuego[numAleatoria][i];
		}
		return vector;
	}

	public static boolean contiene(char[] vector, char carac) {

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == carac) {
				return true;
			}
		}
		return false;
	}

	public static boolean insertaLetraOrdenadaEnVector(char[] vector, char carac) {
		int pos;
		char temp;

		if (!contiene(vector, carac)) {
			for (int x = 0; x < vector.length; x++) {
				if (vector[x] == '|') {
					vector[x] = carac;
					for (int i = 0; i <= (vector.length - 2); i++) { // utilizo selección
						pos = i;
						for (int j = i + 1; j <= (vector.length - 1); j++) {
							if (vector[j] < vector[pos])
								pos = j;
						}

						if (pos != i) {
							temp = vector[pos];
							vector[pos] = vector[i];
							vector[i] = temp;
						}
					}

					return true; // no estaba dentro y ha sido insertada y ordenada
				}

			}
		}
		return false; // ya estaba dentro
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

	public static String pistaParteFrase(String[] vectorCad) {
		String subCad = "";

		int columnaAleatoria = (int) Math.floor(Math.random() * (3 - 1 + 1));
		int inicioSubcad = (int) Math.floor(Math.random() * (vectorCad[columnaAleatoria].length() - 1));
		int finSubcad = (int) Math
				.floor(Math.random() * ((vectorCad[columnaAleatoria].length() - 1) - inicioSubcad + 1) + inicioSubcad);

		subCad = vectorCad[columnaAleatoria].substring(inicioSubcad, finSubcad + 1); // para que siempre muestre como
																						// mínimo una letra
		return subCad;
	}

	public static boolean esParteDeLaFrase(String[] vectorCad, String cad) {
		String fraseSecreta = new String("");

		for (int i = 0; i < vectorCad.length; i++) {
			fraseSecreta += vectorCad[i].replace("  ", " ") + " ";
		}

		if (fraseSecreta.contains(cad)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean resolver(String[] vectorCad, String cad) {
		String fraseSecreta = new String("");

		for (int i = 0; i < vectorCad.length; i++) {
			fraseSecreta += vectorCad[i].replace("  ", " ") + " ";
		}

		if (fraseSecreta.substring(0, fraseSecreta.length() - 1).equals(cad)) {
			return true;
		} else {
			return false;
		}
	}
}
