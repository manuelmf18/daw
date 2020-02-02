package ejerciciosVectores;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		System.out.println("¿De cuántas posiciones quieres que sea el vector?");
		num = Entrada.entero();
		
		int[] vectorDelDerecho = new int[num];

		for (int i = 0; i < vectorDelDerecho.length; i++) {
			System.out.println("Dame un valor para la posición " + i);
			vectorDelDerecho[i] = Entrada.entero();
		}
		
		int[] vectorDelReves = new int[num];
		int j=num;
		
		for (int i = 0; i < vectorDelDerecho.length; i++) {
			vectorDelReves[j] = vectorDelDerecho[i];
			j--;
		}
	}

}
