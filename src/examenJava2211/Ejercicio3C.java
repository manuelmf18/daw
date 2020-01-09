package examenJava2211;

public class Ejercicio3C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, i = 0, j = 0;
		System.out.println("Introduce un numero");
		num = Entrada.entero();

		while (i <num) {
			j = 0;
			while (j <=num*2) {
				if(j<i)	
					System.out.printf(" ");
				else if(j==num)
					System.out.printf(" ");
				else if(j>=i && j<=num*2-i)
					System.out.printf("*");
				j++;
			}
			
			System.out.printf("\n");
			i++;
		}
	}

}
