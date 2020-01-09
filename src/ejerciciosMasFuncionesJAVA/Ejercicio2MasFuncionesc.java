package ejerciciosMasFuncionesJAVA;

public class Ejercicio2MasFuncionesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero: ");
		int n=Entrada.entero();
		numerosprimosgemelos(n);
	}
	
	public static void numerosprimosgemelos(int n){
		int cuentaTuplas=0, primo1=3, primo2=siguientePrimo(primo1);
		
		while (cuentaTuplas<n){
			if ((primo2-primo1)==2){
				cuentaTuplas++;
				System.out.println("("+primo1+","+primo2+")");
			}
				primo1=primo2;
				primo2=siguientePrimo(primo1);
		}
	}
	public static int siguientePrimo(int p){

		int posibleSiguientePrimo=p+1;
		
		while (!esPrimo(posibleSiguientePrimo)){
			posibleSiguientePrimo++;			
		}
		
		return posibleSiguientePrimo;
	}
	
	public static boolean esPrimo(int num) {
		int cont = 2;	
		
		while (cont < num) {
			if (num % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;
	}

}
