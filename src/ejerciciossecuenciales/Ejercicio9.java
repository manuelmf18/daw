package ejerciciossecuenciales;

public class Ejercicio9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, incremento1 = 0, incremento2 = 0;

		System.out.println("Introduzca un número entero:");
		num = Entrada.entero();

		incremento1 = num + 1;
		incremento2 = num + 2;

		System.out.println("El numero es " + num);
		System.out.println("El numero incrementado en 1 es " + incremento1);
		System.out.println("El numero incrementado en 2 es " + incremento2);
	}
}