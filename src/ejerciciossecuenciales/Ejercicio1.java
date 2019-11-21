package ejerciciossecuenciales;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Multiplica un número por dos y después el resultado por tres.
		int num = 0, doble = 0, triple = 0;

		System.out.println("Escribe un número entero");
		num = Entrada.entero();
		doble = 2 * num;
		triple = 3 * num;
		System.out.println("El doble de " + num + " es " + doble + " y el triple es " + triple);

	}

}
