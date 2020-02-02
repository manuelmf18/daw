package ejerciciosVectores;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorAleatorio = new int[20];
		for (int i = 0; i < vectorAleatorio.length; i++) {
			vectorAleatorio[i] =  (int) Math.round(Math.random());
			if(esPrimo(i)) {
				System.out.println("En la posición " + i + " está el " + vectorAleatorio[i]);
			}
		}
	}
	
	public static boolean esPrimo(int num) { //estoy considerando el 1 primo
		int cont = 2;	
		
		if(num==0) { //cero no es primo
			return false;
		}
			
		while (cont < num) {
			if (num % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;
	}
}
