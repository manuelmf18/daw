package ejerciciossecuenciales;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Muestra el �rea y el per�metro aproximados de un c�rculo en funci�n a un
		// radio introducido por el usuario
		final float PI = 3.1416f;
		float radio = 0f;
		System.out.println("Introduzca la medida de un radio, sin unidades: ");
		radio = Entrada.entero();
		System.out
				.println("Para una circunferencia de radio " + radio + " unidades, el per�metro es de " + 2 * PI * radio
						+ "unidades, mientras que el �rea es de " + PI * Math.pow(radio, 2) + " unidades cuadradas.");

	}

}
