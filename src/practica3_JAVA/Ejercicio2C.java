package practica3_JAVA;

public class Ejercicio2C {

	public static void main(String[] args) {
		int num1,num2,div=2,posiblePrimo1=0, posiblePrimo2=0;
		boolean esPrimo1=false, esPrimo2=false;
		
		System.out.println("Introduce el número a partir del cual quiere imprimir los primos gemelos: ");
		num1=Entrada.entero();
		
		System.out.println("Introduce el número hasta el que quiere imprimir los primos gemelos: ");
		num2=Entrada.entero();
		
		System.out.println("\nLOS PRIMOS GEMELOS ENTRE LOS NÚMEROS "+num1+" y "+num2+" son:\n");
		
		for (int i = num1; i < num2-1; i++) {
			posiblePrimo1=i;
			posiblePrimo2=i+2;
			esPrimo1=false;
			esPrimo2=false;
			
			while (posiblePrimo1 % div != 0 && div < Math.sqrt(posiblePrimo1)+1)
				div++;

			if (div >= Math.sqrt(posiblePrimo1)+1)
				esPrimo1 = true;

			div = 2;

			while (posiblePrimo2 % div != 0 && div < Math.sqrt(posiblePrimo2)+1)
				div++;

			if (div >= Math.sqrt(posiblePrimo2)+1)
				esPrimo2 = true;

			if (esPrimo1 && esPrimo2)
				System.out.println("("+posiblePrimo1+","+posiblePrimo2+")");			
		}
	}

}




