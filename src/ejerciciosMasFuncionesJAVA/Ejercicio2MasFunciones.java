package ejerciciosMasFuncionesJAVA;

public class Ejercicio2MasFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, numero=0, tupla = 0;
		System.out.println("Introduce un número");
		num = Entrada.entero();

		System.out.println(esPrimo(num));
		numerosPrimosGemelos(tupla);

	}

	public static void numerosPrimosGemelos(int tupla) {
		int gemelo1 = 0, gemelo2 = 0, cuentaTupla=0, siguientenumero=0;

		System.out.println("Las 5 primeras tuplas de números primos gemelos son:");
		while (cuentaTupla<=tupla) {
			//if()
			
			System.out.println("( " + gemelo1 + " ),( " + gemelo2 + " )");

		}
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
	//}

	//public static int siguientePrimo(int numero) {
	//	while (cont < num) {
		//	if (num % cont == 0) {
			//	return false;
			//}
			//cont++;
	//	}
	//	return true;
	
	}
}
