package practica3_JAVA;

public class Ejercicio2ismael {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int i = 0;
		int j = 2;
		int contdivisores = 0;
		System.out.println("Introduce el numero menor");
		num1 = Entrada.entero();
		System.out.println("Introduce el numero mayor");
		num2 = Entrada.entero();
		i = num1;
		System.out.println("Numeros primos gemelos entre " + num1 + "y" + num2 + ":");
		while (i <= num2) {
			j = 2;
			while (j < i) {
				if (i % j == 0 || ((i + 2) % j == 0)) {
					contdivisores++;
				}
				j++;
			}
			if (contdivisores == 0) {

				System.out.println(i + "," + (i + 2));
			}
			i = i + 1;
			contdivisores = 0;
		}
	}

}
