package ejerciciosMatrices;

public class EjercicioInicialMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas = 0, columnas = 0;

		filas = filasMatriz(filas);
		columnas = columnasMatriz(columnas);
		int[][] matrix = new int[filas][columnas];
		int[][] clonMatrix;

		filas = filasMatriz(filas);
		columnas = columnasMatriz(columnas);
		double[][] matrix1 = new double[filas][4];

		filas = filasMatriz(filas);
		columnas = columnasMatriz(columnas);
		double[][] matrix2 = new double[4][columnas];
		double[][] matrix3 = new double[filas][columnas];
		int num = 0, suma = 0, fila1 = 0, fila2 = 0, columna1 = 0, columna2 = 0;
		int[] posicionv;

		rellenaMatriz(matrix);
		muestraMatriz(matrix);

		suma = sumaMatriz(matrix);
		System.out.println("La suma de los valores de la matriz es " + suma);

		System.out.println("Introduce el número que quieres buscar");
		num = Entrada.entero();

		buscaElemento(matrix, num);

		posicionv = buscayDevuelvePosicionesElemento(matrix, num);
		System.out.println("La primera ocurrencia del " + num + " se encuentra en la fila " + posicionv[0]
				+ " y en la columna " + posicionv[1]);

		if (esMatrizCuadrada(matrix)) {
			System.out.println("La matriz es Cuadrada");
		} else {
			System.out.println("La matriz no es Cuadrada");
		}

		if (esMatrizEscalar(matrix)) {
			System.out.println("La matriz es Escalar");
		} else {
			System.out.println("La matriz no es Escalar");
		}

		if (esMatrizIdentidad(matrix)) {
			System.out.println("La matriz es Identidad");
		} else {
			System.out.println("La matriz no es Identidad");
		}

		System.out.println("La matriz " + esMatrizTriangular(matrix));

		rellenaMatriz(matrix1);
		muestraMatriz(matrix1);
		rellenaMatriz(matrix2);
		muestraMatriz(matrix2);
		// matrix3 = sumaMatrices(matrix2, matrix1); mal
		// muestraMatriz(matrix3);

		matrix3 = multiplicaMatrices(matrix2, matrix1);
		muestraMatriz(matrix3);

		clonMatrix = clonaMatriz(matrix);
		muestraMatriz(clonMatrix);

		muestraMatriz(matrix);
		System.out.println("Introduce un numero de fila entre 0 y " + (matrix.length - 1));
		fila1 = Entrada.entero();
		System.out.println("Introduce otro numero de fila entre 0 y " + (matrix.length - 1));
		fila2 = Entrada.entero();
		if (transponerFilas(matrix, fila1, fila2)) {
			muestraMatriz(matrix);
			System.out.println("Las filas se han transpuesto");
		} else {
			System.out.println("No se ha podido transponer las filas");
		}

		muestraMatriz(matrix);
		System.out.println("Introduce un numero de columna entre 0 y " + (matrix.length - 1));
		columna1 = Entrada.entero();
		System.out.println("Introduce otro numero de columna entre 0  y " + (matrix.length - 1));
		columna2 = Entrada.entero();
		if (transponerColumnas(matrix, columna1, columna2)) {
			muestraMatriz(matrix);
			System.out.println("Las columnas se han transpuesto");
		} else {
			System.out.println("No se ha podido transponer las columnas");
		}
	}

	public static int columnasMatriz(int tam) {
		tam = (int) ((Math.random() * 10) + 1);

		return tam;
	}

	public static int filasMatriz(int tam) {
		tam = (int) ((Math.random() * 10) + 1);

		return tam;
	}

	public static void rellenaMatriz(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
			}
		}
	}

	public static void rellenaMatriz(double[][] matrix1) {

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = Math.floor(Math.random() * (9 - 1 + 1) + 1);
			}
		}
	}

	public static void muestraMatriz(int[][] matrix) {
		System.out.println("\n\nMostrando matriz...\n\n");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("  " + matrix[i][j] + "  ");
			}
		}
		System.out.println("");
	}

	public static void muestraMatriz(double[][] matrix1) {
		System.out.println("\n\nMostrando matriz...\n\n");
		for (int i = 0; i < matrix1.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print("  " + matrix1[i][j] + "  ");
			}
		}
		System.out.println("");
	}

	public static int sumaMatriz(int[][] matrix) {
		int suma = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				suma = suma + matrix[i][j];
			}
		}
		return suma;
	}

	public static void buscaElemento(int[][] matrix, int num) {
		int apariciones = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == num) {
					System.out.println("El " + num + " aparece en la fila " + i + " de la columna " + j);
					apariciones++;
				}
			}
		}
		System.out.println("El " + num + " ha aparecido " + apariciones + " veces");
	}

	public static int[] buscayDevuelvePosicionesElemento(int[][] matrix, int num) {

		int[] posicionesnum = new int[2];
		int[] noesta = { -1, -1 };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == num) {
					posicionesnum[0] = i;
					posicionesnum[1] = j;
					return posicionesnum;
				}
			}
		}

		return noesta;
	}

	public static boolean esMatrizCuadrada(int[][] matrix) {

		boolean esCuadrada = true;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix.length != matrix[i].length) {
				return false;
			}
		}
		return esCuadrada;
	}

	public static boolean esMatrizEscalar(int[][] matrix) {

		boolean esEscalar = true;
		int num = 0, cont = 0;

		if (!esMatrizCuadrada(matrix)) {
			return false;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					if (cont == 0) {
						num = matrix[i][j];
						cont++;
					} else {
						if (num != matrix[i][j]) {
							return false;
						}
					}
				} else {
					if (num != 0) {
						return false;
					}
				}
			}
		}
		return esEscalar;
	}

	public static boolean esMatrizIdentidad(int[][] matrix) {

		boolean esIdentidad = true;

		if (!esMatrizEscalar(matrix) || (matrix[0][0] != 1)) {
			return false;
		}

		return esIdentidad;
	}

	public static String esMatrizTriangular(int[][] matrix) {
		boolean esSuperior = esMatrizTriangularSuperior(matrix);
		boolean esInferior = esMatrizTriangularInferior(matrix);

		if (esSuperior && esInferior)
			return "es diagonal";
		else if (esSuperior && !esInferior)
			return "es triangular superior";
		else if (!esSuperior && esInferior)
			return "es triangular inferior";
		else
			return "no es triangular";
	}

	public static boolean esMatrizTriangularSuperior(int[][] matrix) {

		boolean esTriangularSuperior = true;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return esTriangularSuperior;
	}

	public static boolean esMatrizTriangularInferior(int[][] matrix) {

		boolean esTriangularInferior = true;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return esTriangularInferior;
	}

	public static double[][] sumaMatrices(double[][] matrix2, double[][] matrix1) {
		double[][] vsuma = clonaMatriz(matrix2);
		double[][] vnulo = matrix2.clone();
		boolean puedensumarse = true;

		for (int i = 0; i < matrix1.length; i++) {
			if (!(matrix1.length != matrix2.length) && (matrix1[i].length != matrix2[i].length)) {
				puedensumarse = false;
			}
		}
		if (puedensumarse) {
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[i].length; j++) {
					vsuma[i][j] += matrix1[i][j] ;
				}
			}
			return vsuma;
		} else {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					vnulo[i][j] = 0;
				}
			}
			return vnulo;
		}
	}

	public static double[][] multiplicaMatrices(double[][] matrix2, double[][] matrix1) {//1
		double[][] vmultiplicacion = matrix1.clone();
		double[][] vnulo = matrix1.clone();
		double multiplicacion = 0;//
		boolean puedenmultiplicarse = false;
		int cont=0;

		for (int i = 0; i < matrix1.length; i++) {
			if (matrix1[i].length != matrix2.length) {
				puedenmultiplicarse = false;
			}
		}

		if (puedenmultiplicarse) {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					multiplicacion = multiplicacion + (matrix1[i][j] * matrix2[j][i]);
					if (j == matrix1[i].length - 1) {
						vmultiplicacion[i][cont] = multiplicacion;
						cont++;
						if(cont==matrix1[i].length - 1) { //
							cont=0;
						}
					}
				}
			}
			return vmultiplicacion;
		} else {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					vnulo[i][j] = 0;
				}
			}
			return vnulo;
		}
	}

	public static int[][] clonaMatriz(int[][] matrix) { 
		int[][] matrixclon = new int[matrix.length][];

		for (int i = 0; i < matrix.length; i++) {
			matrixclon[i] = matrix[i].clone();
		}
		return matrixclon;
	}
	
	public static double[][] clonaMatriz(double[][] matrix1) { 
		double[][] matrixclon = new double[matrix1.length][];

		for (int i = 0; i < matrix1.length; i++) {
			matrixclon[i] = matrix1[i].clone();
		}
		return matrixclon;
	}


	public static boolean transponerFilas(int[][] matrix, int fila1, int fila2) {
		boolean transpuesta = true;
		int[] transportor = matrix[fila1];

		if (!(matrix[fila1].length == matrix[fila2].length)) {
			return false;
		}

		matrix[fila1] = matrix[fila2];
		matrix[fila2] = transportor;
		return transpuesta;
	}

	public static boolean transponerColumnas(int[][] matrix, int columna1, int columna2) {
		int[][] transportor = new int[matrix.length][matrix[columna1].length];

		for (int i = 0; i < matrix.length; i++) {
			transportor[i][columna1] = matrix[i][columna1];
		}

		for (int i = 0; i < matrix.length; i++) {
			if (!(matrix[i].length > columna1 && matrix[i].length > columna2)) {
				return false;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][columna1] = matrix[i][columna2];
			matrix[i][columna2] = transportor[i][columna1];
		}
		return true;
	}
}
