package examenJava2211;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lados = 2, tam = 0, cont=0;

		System.out.println("Introduce un número");
		tam = Entrada.entero();
		
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam*lados ; j++) {
				
				
				if(i>j || j>= (tam*2-cont) ) {
					System.out.print("  ");
					
				} else {
					System.out.print(" *");
				
					if (j+1==tam) {
					System.out.print("  ");
					}
				
				}
				
			}
			System.out.println("");
		
			cont++;
		}
	}

}
