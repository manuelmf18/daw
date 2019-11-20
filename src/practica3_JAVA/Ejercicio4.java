package practica3_JAVA;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pide un número impar mayor de 6 al usuario (hasta que el usuario inserte un
		// valor correcto) e imprime por pantalla la figura.
		int num=0;

		System.out.println("Introduce un numero impar mayor que 6");
		num = Entrada.entero();

		while (num < 7 || num % 2 == 0) {
			System.out.println("Introduce un numero impar mayor que 6");
			num = Entrada.entero();
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <num ; j++) { //ver la relación de j e i con num 
				if (j == num/2 || i==num/2 || j+i==num/2 || j-i==num/2 || i-j==num/2 || i+j==num/2*3) {
					System.out.print(" *"); 
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(""); //salto de línea
		}
		
	}
}