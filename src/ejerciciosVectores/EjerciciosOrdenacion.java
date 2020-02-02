package ejerciciosVectores;

public class EjerciciosOrdenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2
		int[] vector = new int[100];
		int[] vector1 = new int[100];
		
		rellenaVector(vector);
		insercionOtroVector(vector, vector1);

		// 3
		int[] vector2 = new int[100];
		int[] vectoresJuntos;
		
		vectoresJuntos = ordenaDosVectoresInserc(vector, vector2);

		// 4
		int[] vector3 = new int[1000];
		int numMayores;
		
		System.out.println("Cuantos números quieres mostrar");
		numMayores=Entrada.entero();
		rellenaVector(vector3);
		seleccionMayores(vector3, numMayores);
		muestraVector(vector3,numMayores);

		// 5
		int[] vector4 = new int[100];

		rellenaVector(vector4);
		seleccionMayores(vector4, 1);
		muestraVector(vector3,1);
		
		
		
		// 7

		// 8

	}

	public static void rellenaVector(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = (int) Math.floor(Math.random() * (80 - 10 + 1) + 10);
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

	static int[] ordenaDosVectoresInserc(int[] arr1, int[] arr2) {
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
		
		or.quicksort(vec,0,vec.length-1);
		
		System.out.println("El mayor es: "+vec[vec.length-1]);
		System.out.println("El menor es: "+vec[0]);
		
		int rep=0,numRep=vec[0],contRep=1,cont=1,suma=vec[0];
		
		for(int i=1; i<vec.length; i++) {
			suma=suma+vec[i];
			cont++;
			
			if(vec[i]==vec[i-1])
				contRep++;
			else{
				if(contRep>rep)
				{
					rep=contRep;
					numRep=vec[i-1];					
				}
			contRep=1;
			}
		}
		
		if(contRep>rep)
		{
			rep=contRep;
			numRep=vec[vec.length-1];					
		}
		
		System.out.println("El número que más se repite es "+numRep+" que se repite "+rep+" veces");
		System.out.println("La media es "+(double)suma/cont);
		
	}


	static void muestraVector(int[] vec, int numMayores) {
		System.out.print("\n" + vec[0]);
		for (int i = 1; i < numMayores; i++)
			System.out.print("," + vec[i]);
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
		return -1;
	}
}
