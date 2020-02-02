package ejerciciosVectores;

public class Ejercicio2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vectorInicial= new int [10];
		
		int contPares=0, contImpares=0;
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorInicial[i]= Entrada.entero();
			
			if (vectorInicial[i]%2==0) {
				contPares++;
			}
			else {
				contImpares++;
			}
		}
		
		int [] vectorPares= new int [contPares];
		int j=0, y=0;
		int [] vectorImpares= new int [contImpares];
		
		for(int i=0;i<vectorInicial.length;i++) {
			
			if (vectorInicial[i]%2==0) {
				vectorPares[j]=vectorInicial[i];
				j++;
			}
			else {
				vectorImpares[y]=vectorInicial[i];
				y++;
			}
		}
		
		System.out.println("VECTOR INICIAL");
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorInicial[i]);
		}
		
		System.out.println("VECTOR PARES");
		j=0;
		while (j<vectorPares.length) {
			System.out.println("En la posición "+j+" está el valor "+vectorPares[j]);
			j++;
		}
		
		System.out.println("VECTOR IMPARES");
		y=0;
		while (y<vectorImpares.length) {
			System.out.println("En la posición "+y+" está el valor "+vectorImpares[y]);
			y++;
		}
	}

}