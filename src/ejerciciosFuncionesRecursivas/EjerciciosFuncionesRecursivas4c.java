package ejerciciosFuncionesRecursivas;

public class EjerciciosFuncionesRecursivas4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;

		System.out.println("Introduce un número");
		num = Entrada.entero();
	}

	public static void imprimeImparesNoPrimos(int num) {
		int cont = 1;
		// base
		//if (num/2!=0 && esPrimo) {

		}
		// recursivo
		//else {

		//}
	//}

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
