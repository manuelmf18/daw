package ejerciciosJAVAI;

public class Ejercicio4CCUADRADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		System.out.println("Introduce un numero");
		num = Entrada.entero();

		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
