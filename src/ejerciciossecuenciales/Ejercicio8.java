package ejerciciossecuenciales;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		System.out.println("Introduce un numero");
		num = Entrada.entero();
		System.out.println("El numero introducido es: " + num);
		System.out.println("El numero elevado a 2 es: " + (int) Math.pow(num, 2));
		System.out.println("El numero elevado a 3 es: " + (int) Math.pow(num, 3));
	}

}
