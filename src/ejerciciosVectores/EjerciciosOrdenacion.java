package ejerciciosVectores;

public class EjerciciosOrdenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// // 2
		// int[] vector = new int[100];
		// int[] vector1 = new int[100];
		//
		// rellenaVector2(vector);
		// insercionOtroVector(vector, vector1);
		//
		// // 3
		// int[] vector2 = new int[100];
		// int[] vectoresJuntos;
		//
		// vectoresJuntos = ordenaDosVectoresInserc(vector, vector2); // probar
		//
		// // 4
		// int[] vector3 = new int[1000];
		// int numMayores;
		//
		// System.out.println("Cuantos números quieres mostrar");
		// numMayores = Entrada.entero();
		//
		// rellenaVector(vector3);
		// seleccionMayores(vector3, numMayores);
		// muestraVector(vector3, numMayores);
		//
		// // 5
		// int[] vector4 = new int[100];
		//
		// rellenaVector(vector4);
		// seleccionMayores(vector4, 1);
		// muestraVector(vector3, 1);
		//
		// // 6
		// int dato, posicion;
		// int[] vector5 = new int[100];
		//
		// rellenaVector(vector5);
		// System.out.println("¿Qué números quieres buscar?");
		// dato = Entrada.entero();
		//
		// seleccion(vector5);
		// posicion = busquedaBinaria(vector, dato);
		// System.out.println(posicion);

		// 7
		int[] vector6 = new int[100];

		rellenaVector3(vector6);
		seleccion(vector6);
		muestraNumeros(vector6);
		muestraVector2(vector6);

		// 8

	}

	public static void rellenaVector(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = (int) Math.floor(Math.random() * (80 - 10 + 1) + 10);
		}
	}

	public static void rellenaVector2(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = (int) Math.floor(Math.random() * 10);
		}
	}

	public static void rellenaVector3(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = (int) Math.floor(Math.random() * 100);
		}
	}

	static void insercionOtroVector(int vector[], int[] vector1) {
		int i, j;

		for (i = 0; i < vector.length; i++) {
			j = i - 1;
			while ((j >= 0) && (vector1[j] > vector[i])) {
				vector1[j + 1] = vector1[j];
				j--;
			}
			vector1[j + 1] = vector[i];
		}
	}

	static int[] ordenaDosVectoresInserc(int[] arr1, int[] arr2) { // ver si funciona
		int[] arrOrd = new int[arr1.length + arr2.length];
		int k1 = 0, k2 = 0, temp = 0, j = 0;

		for (int k = 0; k < (arr1.length + arr2.length); k = k + 2) // recorro el vector desordenado
		{
			if (k1 < arr1.length) {
				j = k - 1;
				temp = arr1[k1];

				while ((j >= 0) && (arrOrd[j] > temp)) { // uso método de inserción
					arrOrd[j + 1] = arrOrd[j];
					j--;
				}
				arrOrd[j + 1] = temp;
				k1++;
			}

			if (k2 < arr2.length) {
				j = k;
				temp = arr2[k2];

				while ((j >= 0) && (arrOrd[j] > temp)) { // uso método de inserción
					arrOrd[j + 1] = arrOrd[j];
					j--;
				}
				arrOrd[j + 1] = temp;
				k2++;
			}
		}

		return arrOrd;
	}

	static void seleccionMayores(int[] vector, int numMayores) {
		int pos, temp;
		for (int i = 0; i < numMayores; i++) {
			pos = i;
			for (int j = i + 1; j <= (vector.length - 1); j++)
				if (vector[j] > vector[pos])
					pos = j;

			if (pos != i) {
				temp = vector[pos];
				vector[pos] = vector[i];
				vector[i] = temp;
			}
		}
	}

	public static void menorMayorMediaRepite(int[] vec) {
		Ordenacion or = new Ordenacion();

		or.quicksort(vec, 0, vec.length - 1);

		System.out.println("El mayor es: " + vec[vec.length - 1]);
		System.out.println("El menor es: " + vec[0]);

		int rep = 0, numRep = vec[0], contRep = 1, cont = 1, suma = vec[0];

		for (int i = 1; i < vec.length; i++) {
			suma = suma + vec[i];
			cont++;

			if (vec[i] == vec[i - 1])
				contRep++;
			else {
				if (contRep > rep) {
					rep = contRep;
					numRep = vec[i - 1];
				}
				contRep = 1;
			}
		}

		if (contRep > rep) {
			rep = contRep;
			numRep = vec[vec.length - 1];
		}

		System.out.println("El número que más se repite es " + numRep + " que se repite " + rep + " veces");
		System.out.println("La media es " + (double) suma / cont);

	}

	static void muestraVector(int[] vec, int numMayores) {
		System.out.print("\n" + vec[0]);
		for (int i = 1; i < numMayores; i++)
			System.out.print("," + vec[i]);
	}

	static void muestraVector2(int[] vec) {
		System.out.println("No han sido almacenados :");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}

	public static void numeros(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {

		}
	}

	static void seleccion(int[] vector) {
		int pos, temp;
		for (int i = 0; i <= (vector.length - 2); i++) {
			pos = i;
			for (int j = i + 1; j <= (vector.length - 1); j++)
				if (vector[j] < vector[pos])
					pos = j;

			if (pos != i) {
				temp = vector[pos];
				vector[pos] = vector[i];
				vector[i] = temp;
			}
		}
	}

	public static int busquedaBinaria(int vector[], int dato) {
		int centro, inf = 0, sup = vector.length - 1;
		if (dato > vector[inf] && dato < vector[sup]) {
			while (inf <= sup) {
				System.out.println("Buscando entre las posiciones " + inf + " y " + sup);
				System.out.println("Con valores menor: " + vector[inf] + " y mayor: " + vector[sup]);
				centro = (sup + inf) / 2;
				System.out.println("Posición central: " + centro + " y su valor es: " + vector[centro]);
				if (vector[centro] == dato) {
					System.out.println("El valor ha sido encontrado: " + dato);
					return centro;
				} else if (dato < vector[centro]) {
					sup = centro - 1;
				} else {
					inf = centro + 1;
				}
			}
		}
		return -1;
	}

	static void muestraNumeros(int[] vec) {
		int cont = 0;

		for (int i = 0; i <= 100; i++) {
			if (busquedaBinaria(vec, i) == -1) {
				cont++;
			}
		}

		int[] numeros = new int[cont];
		cont = 0;
		for (int i = 0; i <= 100; i++) {
			if (busquedaBinaria(vec, i) == -1) {
				numeros[cont] = i;
				cont++;
			}
		}
	}
}
