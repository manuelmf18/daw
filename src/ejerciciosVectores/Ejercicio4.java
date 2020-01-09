package ejerciciosVectores;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosPositivos = new int[10];
		int sumaPares=0, sumaImpares=0;
		
		
		for (int i = 0; i < numerosPositivos.length; i++) {
			System.out.println("Dame un valor entre 1 y 20 para la posición "+i);
			numerosPositivos[i]=Entrada.entero();
		}
		
		for (int i = 0; i < numerosPositivos.length; i++) {
			if (numerosPositivos[i] % 2 == 0) {
				sumaPares=sumaPares+numerosPositivos[i];
			} else {
				sumaImpares=sumaImpares+numerosPositivos[i];
			}
		}
		System.out.println("La suma de los números pares es " + sumaPares + " y la de los números impares es " + sumaImpares);
		
	}

}
