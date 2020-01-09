package examenJava2211;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String PALABRA_SECRETA_1A = new String("alfa"), PALABRA_SECRETA_1B = new String("trueno"),
				PALABRA_SECRETA_2A = new String("beta"), PALABRA_SECRETA_2B = new String("rayo"),
				PALABRA_SECRETA_3A = new String("omega"), PALABRA_SECRETA_3B = new String("nube");

		String palabra1 = new String(""), palabra2 = new String(""), palabra3 = new String("");
		int posicion = 1;
		boolean palabraSecreta1 = false, palabraSecreta2 = false, palabraSecreta3 = false;

		System.out.println("Introduzca una de las palabras claves para la posición 1");
		palabra1 = Entrada.cadena().toLowerCase();

		if (palabra1.equals(PALABRA_SECRETA_1A) || palabra1.equals(PALABRA_SECRETA_1B)) {
			System.out.println("¡Palabra clave 1 ACERTADA!");
			palabraSecreta1 = true;

			System.out.println("Introduzca una de las palabras claves para la posición 2");
			palabra2 = Entrada.cadena().toLowerCase();

			if (palabra2.equals(PALABRA_SECRETA_2A) || palabra2.equals(PALABRA_SECRETA_2B)) {
				System.out.println("¡Palabra clave 2 ACERTADA!");
				palabraSecreta2 = true;

				System.out.println("Introduzca una de las palabras claves para la posición 3");
				palabra3 = Entrada.cadena().toLowerCase();

				if (palabra3.equals(PALABRA_SECRETA_3A) || palabra3.equals(PALABRA_SECRETA_3B)) {
					System.out.println("¡Palabra clave 3 ACERTADA!");
					palabraSecreta3 = true;
				} else {
					System.out.println("Fallaste la palabra clave 3. Las posibilidades eran : " + PALABRA_SECRETA_3A+ " o " + PALABRA_SECRETA_3B);
					System.out.println("Has fallado una palabra clave...empezaremos a disparar en 5 segundos");
				}
			} else {
				System.out.println("Fallaste la palabra clave 2. Las posibilidades eran : " + PALABRA_SECRETA_2A + " o "+ PALABRA_SECRETA_2B);
				System.out.println("Has fallado una palabra clave...empezaremos a disparar en 5 segundos");
			}

		} else {
			System.out.println("Fallaste la palabra clave 1. Las posibilidades eran : " + PALABRA_SECRETA_1A + " o "+ PALABRA_SECRETA_1B);
			System.out.println("Has fallado una palabra clave...empezaremos a disparar en 5 segundos");
		}
		if (palabraSecreta1 == true && palabraSecreta2 == true && palabraSecreta3 == true) {
			System.out.println("La puerta se ha abierto... puedes entrar");
		}
	}
}
