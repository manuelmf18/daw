package ejerciciosAlternativa;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// este algoritmo sirve para leer tres caracteres y que este te los escriba de
		// mayor a menor
		// Algoritmo mal
		char c1 = ' ', c2 = ' ', c3 = ' ';
		System.out.println("Este algoritmo te escribirá los caracteres que pongas por orden de mayor a menor");
		System.out.println("Escribe un caracter y luego pulsa intro.");
		c1 = Entrada.caracter();
		System.out.println("Escribe otro carácter y luego pulsa intro.");
		c2 = Entrada.caracter();
		System.out.println("Vámonos campeón, el último y ya acabamos.");
		c3 = Entrada.caracter();
		if ((c1 > c2) && (c2 > c3)) {
			System.out.println(c1 + ">" + c2 + ">" + c3);
		}
		if ((c3 > c2) && (c2 > c1)) {
			System.out.println(c3 + ">" + c2 + ">" + c1);
		}
		if ((c2 > c3) && (c3 > c1)) {
			System.out.println(c2 + ">" + c3 + ">" + c1);
		}
		if ((c1 > c3) && (c3 > c2)) {
			System.out.println(c1 + ">" + c3 + ">" + c2);
		}
		if ((c2 > c3) && (c3 > c1)) {
			System.out.println(c2 + ">" + c3 + ">" + c1);
		}
		if ((c1 > c2) && (c3 > c1)) {
			System.out.println(c3 + ">" + c1 + ">" + c2);
		}

	}

}
