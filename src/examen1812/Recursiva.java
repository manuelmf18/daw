package examen1812;

public class Recursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;

		System.out.println("Introduce un número");
		num = Entrada.entero();
		if (esPrimo(num)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		if (esPrimoi(num)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
	}

	public static boolean esPrimo(int num) {
		int cont = 1;
		
		if (num % cont == 0) {
			return false;
		}
		if (cont < num) {
			num--;
			return esPrimo(num);

		} else {
			return true;
		}
	}

	public static boolean esPrimoi(int num) {
		int cont = 2;

		while (cont < num) {
			if (num % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;

	}
}
