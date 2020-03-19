package examen2102;

public class SopaDeLetras {

	static final int NUM_PAL_HOR = 3, NUM_PAL_VER = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] sopaLetras = new char[9][9];

		for (int i = 0; i < sopaLetras.length; i++) { // lo relleno de *
			for (int j = 0; j < sopaLetras[i].length; j++) {
				sopaLetras[i][j] = '*';
			}
		}

		String[] vecPal = { "pera", "trueno", "casaca", "edificio", "ropa", "dato", "sospechoso", "lluvia", "ahorcado",
				"roble", "cogorza" };

		String[] vecDef = { "fruto del peral", "estruendo del cielo", "chaqueta militar",
				"construcción de varias plantas", "lo que te pones para no ir desnudo", "ojo al..",
				"posible culpable de delito", "agua que cae del cielo", "juego de la práctica anterior",
				"árbol robusto", "borrachera" };

		int[] vecPosDefinicionesHorizontal = new int[vecDef.length]; // le doy el tamaño de los vectores
		int[] vecPosDefinicionVertical = new int[vecDef.length];

		boolean completado = false;
		int fila = 0, columna = 0, palabrasEncontradas = 0;
		char opcion;
		String palabra;

		ordenaVectoresPorLongitudPalabra(vecPal, vecDef);

		System.out.println("Mostrando las palabras con sus definiciones ordenadas:");
		for (int i = 0; i < vecPal.length; i++) {
			System.out.println("Palabra: " + vecPal[i]);
			System.out.println("Definición: " + vecDef[i] + "\n");
		}

		insertaPalabrasHorizontal(sopaLetras, vecPal, vecPosDefinicionesHorizontal);
		insertaPalabrasVertical(sopaLetras, vecPal, vecPosDefinicionVertical);
		rellenaSopaDeLetras(sopaLetras);

		System.out.println("----¡COMPLETA LA SOPA DE LETRAS!----");

		while (completado == false) {

			System.out.println("\nDefiniciones palabras horizontal:");
			for (int i = 0; i < vecPal.length; i++) {
				if (vecPosDefinicionesHorizontal[i] == 1) { // si ha sido imtroducido en la sopa muestra su definición
					System.out.println(vecDef[i]);
				}
			}

			System.out.println("\nDefiniciones palabras Verticales:");
			for (int i = 0; i < vecPal.length; i++) {
				if (vecPosDefinicionVertical[i] == 1) {
					System.out.println(vecDef[i]);
				}
			}

			System.out.println("\n");
			muestraSopaDeLetras(sopaLetras);

			System.out.println("\nDime la fila donde ves la palabra: ");
			fila = Entrada.entero();
			System.out.println("Dime la columna donde ves la palabra: ");
			columna = Entrada.entero();
			System.out.println("Está en horizontal o en vertical? (h/v)");
			opcion = Entrada.caracter();
			System.out.println("Y la palabra es...");
			palabra = Entrada.cadena();

			if (aciertoPalabra(sopaLetras, palabra, fila, columna, opcion)) {
				System.out.println("¡Bravo!");
				pasaAMayusculas(sopaLetras, palabra, fila, columna, opcion);
				palabrasEncontradas++;
			} else {
				System.out.println("¡Fallaste! \n");
			}
			if (palabrasEncontradas == NUM_PAL_HOR + NUM_PAL_VER) { // las 6 palabras
				System.out.println("----¡COMPLETADO!----");
				completado = true;
				muestraSopaDeLetras(sopaLetras);
			}

		}
	}

	public static void ordenaVectoresPorLongitudPalabra(String[] vecPal, String[] vecDef) {
		int j;
		String temp, temp1;

		for (int i = 1; i < vecPal.length; i++) { // utilizo inserción
			temp = vecPal[i];
			temp1 = vecDef[i]; // para ir moviendolos de posición a la vez
			j = i - 1;
			while ((j >= 0) && (vecPal[j].length() < temp.length())) { // en función del tamaño de las palabras de
																		// vecPal
				vecPal[j + 1] = vecPal[j];
				vecDef[j + 1] = vecDef[j];
				j--;
			}
			vecPal[j + 1] = temp;
			vecDef[j + 1] = temp1;
		}
	}

	public static void muestraSopaDeLetras(char[][] sopaLetras) {
		System.out.print("   ");
		for (int j = 0; j < sopaLetras.length; j++) {
			System.out.print(" " + j + " ");
		}
		System.out.println();
		for (int i = 0; i < sopaLetras.length; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < sopaLetras[i].length; j++) {
				System.out.print(" " + sopaLetras[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean entraPalabraHorizontal(char[][] sopaLetras, String palabra, int fila, int columna) {

		if (columna + palabra.length() <= sopaLetras[fila].length) { // ver si cabe desde la posición dada
			for (int i = columna; i < palabra.length() + columna; i++) {
				if (sopaLetras[fila][i] != '*') { // comprobar desde esa posición si coincide con otra palabra
					return false; // coincide
				}
			}
			return true;// no solapa
		}

		return false;// no cabe
	}

	public static boolean entraPalabraVertical(char[][] sopaLetras, String palabra, int fila, int columna) {

		if (fila + palabra.length() <= sopaLetras.length) {
			for (int i = fila; i < palabra.length() + fila; i++) {
				if (sopaLetras[i][columna] != '*' && sopaLetras[i][columna] != palabra.charAt(i - fila)) {
					// i-fila es 0 inicialmente; compruebo si al coincidir con otra palabra la letra
					// es la misma
					return false;
				}
			}
			return true; // no solapa
		} else {
			return false; // no cabe
		}

	}

	public static void insertaPalabrasHorizontal(char[][] sopaLetras, String[] vecPal,
			int[] vecPosDefinicionesHorizontal) {

		int posicionPalabra = 0, fila = 0, columna = 0, palabrasMetidas = 0;

		while (palabrasMetidas < NUM_PAL_HOR) {
			posicionPalabra = (int) (Math.random() * (vecPal.length - 1) + 1);
			fila = (int) (Math.random() * (sopaLetras.length - 1) + 1);
			columna = (int) (Math.random() * (sopaLetras[fila].length - 1) + 1);

			if (vecPal[posicionPalabra] != ""
					&& entraPalabraHorizontal(sopaLetras, vecPal[posicionPalabra], fila, columna)) {
				for (int i = columna; i < vecPal[posicionPalabra].length() + columna; i++) {
					sopaLetras[fila][i] = vecPal[posicionPalabra].charAt(i - columna);
					// i-columna es 0 inicialmente;voy introduciendo cada letra en su lugar
				}
				vecPal[posicionPalabra] = "";
				vecPosDefinicionesHorizontal[posicionPalabra] = 1;
				palabrasMetidas++;
			}
		}
	}

	public static void insertaPalabrasVertical(char[][] sopaLetras, String[] vecPal, int[] vecPosDefinicionesVertical) {

		int posicionPalabra = 0, fila = 0, columna = 0, palabrasMetidas = 0;

		while (palabrasMetidas < NUM_PAL_VER) {
			posicionPalabra = (int) (Math.random() * (vecPal.length - 1) + 1);
			fila = (int) (Math.random() * (sopaLetras.length - 1) + 1);
			columna = (int) (Math.random() * (sopaLetras[fila].length - 1) + 1);

			if (vecPal[posicionPalabra] != ""
					&& entraPalabraVertical(sopaLetras, vecPal[posicionPalabra], fila, columna)) {
				for (int i = fila; i < vecPal[posicionPalabra].length() + fila; i++) {
					sopaLetras[i][columna] = vecPal[posicionPalabra].charAt(i - fila);
				}
				vecPal[posicionPalabra] = "";
				vecPosDefinicionesVertical[posicionPalabra] = 1;
				palabrasMetidas++;
			}
		}
	}

	public static void rellenaSopaDeLetras(char[][] sopaLetras) {

		for (int i = 0; i < sopaLetras.length; i++) {
			for (int j = 0; j < sopaLetras[i].length; j++) {
				if (sopaLetras[i][j] == '*') {
					sopaLetras[i][j] = (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);
				}
			}
		}
	}

	public static boolean aciertoPalabra(char[][] sopaLetras, String palabra, int fila, int columna, char opcion) {

		if (opcion == 'v') {
			for (int i = fila; i < palabra.length() + fila; i++) {
				if (palabra.charAt(i - fila) != sopaLetras[i][columna]) {
					return false;
				}
			}
			return true;
		} else {
			if (opcion == 'h') {
				for (int i = columna; i < palabra.length() + columna; i++) {
					if (palabra.charAt(i - columna) != sopaLetras[fila][i]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;

	}

	public static void pasaAMayusculas(char[][] sopaLetras, String palabra, int fila, int columna, char opcion) {

		if (opcion == 'v') {
			for (int i = fila; i < palabra.length() + fila; i++) {
				sopaLetras[i][columna] = Character.toUpperCase(sopaLetras[i][columna]);
			}
		} else {
			if (opcion == 'h') {
				for (int i = columna; i < palabra.length() + columna; i++) {
					sopaLetras[fila][i] = Character.toUpperCase(sopaLetras[fila][i]);
				}
			}
		}
	}
}
