package ejerciciosVectores;

public class Ejercicio9Primosc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vectorAleatorio[]=new int[9];
		int i=0;	
		
		while(i<vectorAleatorio.length) {
			vectorAleatorio[i]=(int)(Math.random()*(15-2+1))+2;
			i++;
		}
		
		for(i=0;i<vectorAleatorio.length;i++) {
			if(esPrimo(i))
				System.out.println("En la posición prima "+i+" hay un "+vectorAleatorio[i]);
		}				
	}
	

	public static boolean esPrimo(int num) {
		int cont = 2;	
		
		if(num==0)
			return false;
		
		while (cont < num) {
			if (num % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;
	}
}
