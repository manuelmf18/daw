package ejerciciossecuenciales;

public class Ejercicio3 {
	public static void main(String[] args) {

		//Pide nombre y dos apellidos y los imprime
		String nombre="", apellido1="", apellido2="";
		
		System.out.println("Introduzca un nombre");
		nombre=Entrada.cadena();
		System.out.println("Introduzca su primer apellido");
		apellido1=Entrada.cadena();
		System.out.println("Introduzca su segundo apellido");
		apellido2=Entrada.cadena();
		System.out.println("Su nombre es "+nombre+" y sus apellidos son "+apellido1+" y "+apellido2);

	}
}
