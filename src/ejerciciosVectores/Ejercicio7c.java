package ejerciciosVectores;

public class Ejercicio7c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerosOrdenados[]= new int [7];
		int i=0;
		int j=0;
		int numAleatorio=0;

		while(i<numerosOrdenados.length) {
			numAleatorio=(int) (Math.random()*50)+1;
			
			if(i==0 || numAleatorio>=numerosOrdenados[i-1]) { 
				numerosOrdenados[i]=numAleatorio;
				i++;
			}			
		}
		
		for(i=0;i<numerosOrdenados.length;i++)
			System.out.println("numAleatorio["+i+"]: "+numerosOrdenados[i]);
	}

}