package ejerciciosJAVAI;

public class Ejercicio4base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0, i = 0, j = 0;
		System.out.println("Introduce un numero");
		num= Entrada.entero();
		
		while(i<num) {
			j=0;
			while(j<num) {
				if (j<=i) {
					System.out.printf("*");
					j++;
				}
			
				else {
					System.out.print("\n");
					i++;
				}
			}
		}
	}

}
