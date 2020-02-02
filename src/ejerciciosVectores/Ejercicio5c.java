package ejerciciosVectores;

public class Ejercicio5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumaPares = 0, sumaImpares = 0;
		int[] numerosPositivos = new int[10];

		System.out.println("Dame valores para el vector entre 1 y 20");
		
		for (int i = 0; i < numerosPositivos.length; i++) {
			System.out.println("Valor para la posición " + i + ":");
			numerosPositivos[i] = Entrada.entero();
		}
		
		for (int i = 0; i < numerosPositivos.length; i++) {
			if (i % 2 == 0) {
				sumaPares = sumaPares + numerosPositivos[i];
			} else {
				sumaImpares = sumaImpares + numerosPositivos[i];
			}
		}
		System.out.println("La suma de los números en las posiciones sumaPares es " + sumaPares
				+ ", y la suma de los números en las posiciones sumaImpares " + sumaImpares);
	}

}