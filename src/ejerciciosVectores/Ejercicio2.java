package ejerciciosVectores;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorInicial = new int[10];
		int contPares=0, contImpares=0;
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("Dame un valor entre 1 y 20 para la posición "+i);
			vectorInicial[i]=Entrada.entero();
		}
		
		for(int i=0;i<vectorInicial.length;i++) {
			if (vectorInicial[i] % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}
		}
		int[] vectorPares = new int[contPares];
		int[] vectorImpares = new int[contImpares];
		
		for (int i = 0; i < vectorInicial.length; i++) {
			int j=0, k=0;
			if (vectorInicial[i] % 2 == 0) {
				vectorPares[j]=vectorInicial[i];
				j++;
			}else {
				vectorImpares[k]=vectorInicial[i];
				k++;
			}
		}
		
		for (int i = 0; i < vectorPares.length; i++) {
			System.out.println("En la posición " + i + " hay " + vectorPares[i]);
		}
		
		for (int i = 0; i < vectorImpares.length; i++) {
			System.out.println("En la posición " + i + " hay " + vectorImpares[i]);
		}
	}

}
