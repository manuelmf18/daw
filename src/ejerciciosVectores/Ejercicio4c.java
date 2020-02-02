package ejerciciosVectores;

public class Ejercicio4c {
	public static void main(String[] args) {
		int numerosPositivos[]= new int [10];
		int sumaPares=0, sumaImpares=0;
		
		for (int i=0; i<numerosPositivos.length; i++) {
			System.out.println("Introduzca valores entre el 1 y el 20:");
			numerosPositivos[i]=(int)Entrada.entero();
		}
		
		for(int i=0; i<numerosPositivos.length; i++) {
			if (numerosPositivos[i]%2==0) {
				sumaPares=sumaPares+numerosPositivos[i];
			} else {
				sumaImpares=sumaImpares+numerosPositivos[i];
			}
		}
		
		System.out.println("La suma de los pares es: "+sumaPares);
		System.out.println("la suma de los impares es: "+sumaImpares);
		
		for (int i=0; i<numerosPositivos.length; i++) {
			System.out.println(""+numerosPositivos[i]);
		}
	}
}
	