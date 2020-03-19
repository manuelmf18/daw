package ejerciciosCadenas;

public class EjerciciosIncialesCadenasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Ejercicio 1 Carlos Fernandez
	public static String pideDatos() {

		String nombre = new String(" ");
		String dominio = new String(" ");
		String TLD = new String(" ");

		System.out.println("Introduzca un nombre");
		nombre = Entrada.cadena().toLowerCase().replace(" ", "");

		System.out.println("Introduzca un nombre de dominio");
		dominio = Entrada.cadena().toLowerCase().replace(" ", "");

		System.out.println("Introduzca un TLD");
		TLD = Entrada.cadena().toLowerCase();

		nombre = nombre + "@".concat(dominio) + ".".concat(TLD);

		return nombre;
	}

	// Ejercicio 2 Francisco Dominguez

	public static int numeroVocales(String cadena) {

		int cont = 0;

		cadena = cadena.toLowerCase();

		for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {
				cont++;
			}
		}
		return cont;
	}

	// Ejercicio 3 Miguel Ángel Martín Martín

	public static void imprimeCadena(String cadena) {

		char[] array = cadena.toCharArray();

		for (int i = 0; i < cadena.length() - 1; i++) {

			System.out.print(array[i] + "-");
		}
		System.out.print(array[array.length - 1]);
	}

	// Ejercicio 3 devolviendo String Eugenio
	public static String devuelveCadenaGuionEu(String cadena) {
		int i = 0, j = 0;
		char[] nueva = new char[(cadena.length() * 2) - 1];
		for (i = 0; i < nueva.length; i++) {
			if (i % 2 == 0) {
				nueva[i] = cadena.charAt(j);
				j++;
			} else {
				nueva[i] = '-';
			}
		}
		String resultado = String.valueOf(nueva);

		return resultado;
	}

	// Ejercicio 3 devolviendo cadena Amador
	// Amador Muñoz Berzosa
	public static String devuelveCaracteresGuionAmador(String cadena) {
		String cadenaSeparada = new String("");

		for (int i = 0; i < cadena.length(); i++) {
			cadenaSeparada += cadena.charAt(i);

			if (i != cadena.length() - 1)
				cadenaSeparada += "-";
		}

		return cadenaSeparada;
	}

	// Ejercicio 3 devolviendo String Profe
	public static String devuelveCadenaGuion(String cad) {
		String cadGuion = new String("");
		for (int i = 0; i < cad.length(); i++)
			cadGuion += cad.charAt(i) + "-";

		return cadGuion.substring(0, cadGuion.length() - 1);
	}

	// Ejercicio 4 Angela Jimenez
	public static void combinacionVocales(String combinacion) {

		combinacion = combinacion.toLowerCase().replace("e", "a").replace("i", "a").replace("o", "a").replace("u", "a");
		System.out.println(combinacion);
		combinacion = combinacion.replace("a", "e");
		System.out.println(combinacion);
		combinacion = combinacion.replace("e", "i");
		System.out.println(combinacion);
		combinacion = combinacion.replace("i", "o");
		System.out.println(combinacion);
		combinacion = combinacion.replace("o", "u");
		System.out.println(combinacion);
	}

	// Ejercicio 5. Profe
	public static void muestraVectorOrden(String[] vector) {
		int pos;
		String cadMenor = new String();
		int[] posicionesProhibidas = new int[vector.length];

		for (int i = 0; i < vector.length; i++) {
			pos = 0;
			cadMenor = "||||||||||";
			for (int j = 0; j < vector.length; j++)
				if (vector[j].compareTo(cadMenor) < 0 && posicionesProhibidas[j] != -1) {
					pos = j;
					cadMenor = vector[j];
				}

			System.out.println(vector[pos]);
			posicionesProhibidas[pos] = -1;
		}
	}
}