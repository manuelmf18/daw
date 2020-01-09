package examenJava2211;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no me ha dado tiempo a arreglar el fallo que tengo con coger el primer primo
		int num1, num2, div = 2, posiblePrimo1 = 0, posiblePrimo2 = 0, primo = 0, primoSiguiente = 0, contPrimos = 0, acumulaDistancias = 0;
		float  media=0;
		boolean esPrimo1 = false, esPrimo2 = false;

		System.out.println("Introduce el número inicial del rango: ");
		num1 = Entrada.entero();

		System.out.println("Introduce el número final de rango: ");
		num2 = Entrada.entero();

		for (int i = num1; i < num2; i++) {
			posiblePrimo1 = i;
			esPrimo1 = false;
			esPrimo2 = false;

			while (posiblePrimo1 % div != 0 && div < posiblePrimo1) {
				div++;
			}
			if (div >= posiblePrimo1) {
				esPrimo1 = true;
				contPrimos++;
				div = 2;
				posiblePrimo2 = posiblePrimo1 + 1;
				
				while (esPrimo2 == false && posiblePrimo2 <= num2) {
					while (posiblePrimo2 % div != 0 && div < posiblePrimo2) {
						div++;
					}
					if (div >= posiblePrimo2) {
						esPrimo2 = true;
						contPrimos++;
					} else {
						posiblePrimo2++;
					}
				}

				if (esPrimo1 == true && esPrimo2 == true) {
					primo=posiblePrimo1;
					primoSiguiente=posiblePrimo2;
					acumulaDistancias = acumulaDistancias + (primoSiguiente - primo);
					System.out.println("Distancia entre " + primo + " y " + primoSiguiente + " es :"+acumulaDistancias);
				} else {
					
					i = num2;
				}
			} else {
				posiblePrimo1++;
			}
		}
		media=acumulaDistancias/(contPrimos-1); 
		System.out.println("Cuenta primos vale : "+media);
	}

}
