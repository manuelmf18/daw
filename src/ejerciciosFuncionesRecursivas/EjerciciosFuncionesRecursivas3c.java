package ejerciciosFuncionesRecursivas;

public class EjerciciosFuncionesRecursivas3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		System.out.println("Introduce un número");
		num = Entrada.entero();
		imprimeCifrasNumero(num);
	}

	public static void imprimeCifrasNumero(int num) {
		// caso base
		if (num == 0)
			System.out.println();
		// caso recursivo
		if (num > 0) {
			imprimeCifrasNumero(num / 10);
			System.out.print(num % 10 + ",");
		}
	}
}
