package ejerciciossecuenciales;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pide al usuario su nombre y su edad

		String nombre = "";
		int edad = 0;

		System.out.println("Introduzca su nombre");
		nombre = Entrada.cadena();
		System.out.println("Introduzca su edad");
		edad = Entrada.entero();
		System.out.println("Hola " + nombre + " tienes " + edad + " años,¡que mayor eres!");
	}

}
