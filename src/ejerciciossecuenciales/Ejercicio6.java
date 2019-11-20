package ejerciciossecuenciales;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pide al usuario 5 caracteres y los imprime en orden inverso
		char carac1 = ' ', carac2 = ' ', carac3 = ' ', carac4 = ' ', carac5 = ' ';

		System.out.println("Introduzca el primer caracter");

		carac1 = Entrada.caracter();

		System.out.println("Introduzca el segundo caracter");

		carac2 = Entrada.caracter();

		System.out.println("Introduzca el tercer caracter");

		carac3 = Entrada.caracter();

		System.out.println("Introduzca el cuarto caracter");

		carac4 = Entrada.caracter();

		System.out.println("Introduzca el quinto caracter");

		carac5 = Entrada.caracter();

		System.out.println(
				"Tus caracteres al revés son" + carac5 + "," + carac4 + "," + carac3 + "," + carac2 + "," + carac1);

	}

}
