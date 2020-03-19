package ejerciciosCadenas;

public class MasEjerciciosCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char carac;
		String cad = new String("");
		int[] posicion;

		System.out.println("Introduce la cadena");
		cad = Entrada.cadena();
		// System.out.println("Introduce el caracter que quieras bsucar");
		// carac = Entrada.caracter();
		//
		// posicion=buscaCaracter(carac, cad);
		// muestraValoresVector(posicion);

		rotaCaracteres(cad);

		 if (cadenaPalindroma(cad)) {
		 System.out.println("La cadena es palindroma");
		 } else {
		 System.out.println("La cadena no es palindroma");
		 }

	}

	public static int[] buscaCaracter(int carac, String cad) {
		int cont = 0;

		for (int i = 0; i < cad.length(); i++) {
			if (carac == cad.charAt(i)) {
				cont++;
			}
		}

		int[] posiciones = new int[cont];
		cont = 0;

		for (int i = 0; i < cad.length(); i++) {
			if (carac == cad.charAt(i)) {
				posiciones[cont] = i;
				cont++;
			}
		}
		return posiciones;
	}

	public static void muestraValoresVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("El caracter está en la posición " + vector[i]);
		}
	}

	public static void frecuencia() {
		String cad = new String("");
		int[][] matrix;

		System.out.println("Introduce la cadena");
		cad = Entrada.cadena().toLowerCase();

		// tablero
		
	}

	public static void rotaCaracteres(String cadena) {
		System.out.println(cadena);
		char[] rota = cadena.toCharArray();
		char tem=0;
	
		for(int i=0; i<cadena.length(); i++) {
			for(int j=cadena.length()-1; j>0; j--) {
				tem=rota[j];
				rota[j]=rota[j-1];
				rota[j-1]=tem;
				}
			System.out.println(rota);
			}
		
	}

	public static boolean cadenaPalindroma(String cadena) {

		boolean esPalindromo = true;
		String nuevaCadena = new String(" ");
		int desc = 0;

		nuevaCadena = cadena.toLowerCase().trim().replaceAll(" ", "").replace("á", "a").replace("é", "e")
				.replace("í", "i").replace("ó", "o").replace("ú", "u");

		desc = nuevaCadena.length() - 1;

		for (int i = 0; i < nuevaCadena.length()/2; i++) {
			if (nuevaCadena.charAt(i) != nuevaCadena.charAt(desc)) {
				esPalindromo = false;
			}
			desc--;
		}
		return esPalindromo;
	}
}
