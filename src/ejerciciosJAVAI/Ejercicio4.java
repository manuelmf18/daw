package ejerciciosJAVAI;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pide un n�mero al usuario y muestre la figura anterior hasta que llegue al n�mero de * dado por el usuario
		int num=0;
		
		System.out.println("Introduce un n�mero");
		num=Entrada.entero();
		
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
			System.out.print("*");
			}
		System.out.println("");
		}
	}

}