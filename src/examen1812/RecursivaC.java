package examen1812;

public class RecursivaC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		int numero=Entrada.entero();
		
		if(esPrimo(numero,2))
			System.out.println("El número "+numero+" es primo");
		else
			System.out.println("El número "+numero+" no es primo");
	}
	
	public static boolean esPrimo(int num, int cont)
	{
		if(cont>Math.sqrt(num))
			return true;
		else if(num%cont==0 || num==1)
			return false;
		else
			return esPrimo(num,cont+1);
	}
}
