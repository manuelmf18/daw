package ejerciciosFuncionesRecursivas;

public class EjerciciosFuncionesRecursivas1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.println("Meta número:");
		num = Entrada.entero();

		System.out.println("La tabla del " + num + " es: ");
		tablaDeMultiplicar(num, 10);
	}

	public static void tablaDeMultiplicar(int num, int i) {

		// caso base 
		if (i == 1)
			System.out.println("" + num + " x " + i + " es: " + num * i);
		else { // caso recursivo
			tablaDeMultiplicar(num, i - 1);
			System.out.println("" + num + " x " + i + " es: " + num * i);

		}
	}

}
