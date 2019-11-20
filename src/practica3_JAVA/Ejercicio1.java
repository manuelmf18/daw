package practica3_JAVA;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// programa tiene un nombre y dos apellidos secretos y va pidiendo al usuario un
		// nombre y dos apellidos hasta que el usuario acierte o gaste el número de
		// intentos

		final String NOMBRE_S = "manuel", APELLIDO1_S = "martin", APELLIDO2_S = "fernandez";
		String nombre = " ", apellido1 = " ", apellido2 = " ";
		boolean esnombre = false, esapellido1 = false, esapellido2 = false;
		int intentos = 4;

		while ( intentos > 0 && !(esnombre == true && esapellido1 == true && esapellido2 == true)) {
			
			System.out.println("Introduce un nombre");
			nombre = Entrada.cadena();
			System.out.println("Introduce un primer apellido");
			apellido1 = Entrada.cadena();
			System.out.println("Introduce un segundo apellido");
			apellido2 = Entrada.cadena();

			if (nombre.compareTo(NOMBRE_S) == 0) {
				System.out.println("Es el nombre secreto");
				esnombre = true;
			} else {
				if (nombre.compareTo(NOMBRE_S) > 0) {
					System.out.println("Ese nombre es mayor que el secreto");
					esnombre = false; //por si después de acertar alguno introduce otra cadena diferente en esa entrada
				} else {
					System.out.println("Ese nombre es menor que el secreto");
					esnombre = false;
				}
			}
			if (apellido1.compareTo(APELLIDO1_S) == 0) {
				System.out.println("Es el primer apellido secreto");
				esapellido1 = true;
			} else {
				if (apellido1.compareTo(APELLIDO1_S) > 0) {
					System.out.println("Ese apellido es mayor que el secreto");
					esapellido1 = false;
				} else {
					System.out.println("Ese apellido es menor que el secreto");
					esapellido1 = false;
				}
			}
			if (apellido2.compareTo(APELLIDO2_S) == 0) {
				System.out.println("Es el segundo apellido secreto");
				esapellido2 = true;

			} else {
				if (apellido2.compareTo(APELLIDO2_S) > 0) {
					System.out.println("Ese apellido es mayor que el secreto");
					esapellido2 = false;
				} else {
					System.out.println("Ese apellido es menor que el secreto");
					esapellido2 = false;
				}
			}
			intentos--;
		}
		if (esnombre == true && esapellido1 == true && esapellido2 == true) {
			System.out.println("Has acertado");
		} else {
			System.out.println("El nombre secreto era : " + NOMBRE_S + " " + APELLIDO1_S + " " + APELLIDO2_S);

		}
	}
}