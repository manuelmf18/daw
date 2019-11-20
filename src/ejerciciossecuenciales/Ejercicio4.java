package ejerciciossecuenciales;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Muestra el área y el perímetro aproximados de un círculo en función a un
		// radio introducido por el usuario
		final float PI = 3.1416f;
		float radio = 0f;
		System.out.println("Introduzca la medida de un radio, sin unidades: ");
		radio = Entrada.entero();
		System.out
				.println("Para una circunferencia de radio " + radio + " unidades, el perímetro es de " + 2 * PI * radio
						+ "unidades, mientras que el área es de " + PI * Math.pow(radio, 2) + " unidades cuadradas.");

	}

}
