package ejerciciosVectores;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosPositivos = new int[10];
		int posicionesPares=0, posicionesImpares=0;
		
		
		for (int i = 0; i < numerosPositivos.length; i++) {
			System.out.println("Dame un valor entre 1 y 20 para la posici�n "+i);
			numerosPositivos[i]=Entrada.entero();
		}
		
		for (int i = 0; i < numerosPositivos.length; i++) {
			if (i % 2 == 0) {
				posicionesPares=posicionesPares+numerosPositivos[i];
			} else {
				posicionesImpares=posicionesImpares+numerosPositivos[i];
			}
		}
		System.out.println("La suma de los n�meros pares es " + posicionesPares + " y la de los n�meros impares es " + posicionesImpares);
		
	}

}
