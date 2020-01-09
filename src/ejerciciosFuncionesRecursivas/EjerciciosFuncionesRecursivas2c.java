package ejerciciosFuncionesRecursivas;

public class EjerciciosFuncionesRecursivas2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 0, exp = 0;

		System.out.println("Introduzca un número base");
		base = Entrada.entero();
		System.out.println("Introduzca un número exponente");
		exp = Entrada.entero();

		System.out.println(base + " elevado a " + exp + " es igual a " + potencia(base, exp));

	}

	public static int potencia(int base, int exp) {
		if (exp == 0)
			return 1;
		else
			return potencia(base, exp - 1) * base;
	}

}
