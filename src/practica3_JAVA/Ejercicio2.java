package practica3_JAVA;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pida al usuario dos números e imprima por pantalla cuantos pares de primos
		// gemelos hay entre esos dos números

		int num1=0, num2=0, posiblePrimo1 = 0, i = 2, posiblePrimo2 = 0;

		System.out.println("Introduce un número: ");
		num1 = Entrada.entero();
		System.out.println("Introduce otro número: ");
		num2 = Entrada.entero();

		System.out.println("Números primos gemelos entre " + num1 + " y " + num2 + " :");

		posiblePrimo1 = num1;
		while (posiblePrimo1 < num2) {
			while (posiblePrimo1 % i != 0 && i < posiblePrimo1 / 2) {
				i++;
			}
			if (i >= posiblePrimo1 / 2) { //cuando encuentra un primo, comprueba si tiene primo gemelo
				posiblePrimo2 = posiblePrimo1 + 2;
				i = 2;
				if (posiblePrimo2 <= num2) {
					while (posiblePrimo2 % i != 0 && i < posiblePrimo2 / 2) {
						i++;
					}
					if (i >= posiblePrimo2 / 2) {
						if (posiblePrimo2<num2) { //por si num2-1 y num2+1 son primos gemelos no los imprima (por pasarse de num2)
						System.out.println("(" + posiblePrimo1 + "," + posiblePrimo2 + ")");
						}
					}
					i = 2;
				}
			}
			posiblePrimo1++;
		}

	}
}
