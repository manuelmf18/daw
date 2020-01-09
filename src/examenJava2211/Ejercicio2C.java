package examenJava2211;

public class Ejercicio2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,div=2,posiblePrimo1=-1, posiblePrimo2=0, sumaDistancia=0,cuentaPrimos=0;
		
		System.out.println("Introduce el número inicial del rango: ");
		num1=Entrada.entero();
		
		System.out.println("Introduce el número final del rango: ");
		num2=Entrada.entero();
		
		for (int i = num1; i <= num2; i++) {
			posiblePrimo2=i;
			div = 2;
			
			while (posiblePrimo2 % div != 0 && div < posiblePrimo2 / 2+1)
				div++;

			if (div >= posiblePrimo2 / 2+1)
			{
				if(posiblePrimo1!=-1) {
					sumaDistancia+=posiblePrimo2-posiblePrimo1-1;
					System.out.println("\nDistancia entre "+posiblePrimo1+" y "+posiblePrimo2+" es: "+(posiblePrimo2-posiblePrimo1-1));
				}
				
				cuentaPrimos++;
				posiblePrimo1=posiblePrimo2;
			}			
		}		
		System.out.println("\n\nCuenta primos vale: "+cuentaPrimos);
		System.out.println("\nLa media de la distancia entre dos primos del rango es: "+(double)sumaDistancia/(double)(cuentaPrimos-1));
	}
}
