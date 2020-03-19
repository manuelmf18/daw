package ejerciciosCadenas;

public class EjerciciosInicialesCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1 = new String("hola");
		String direccion = new String("hola");
		
		direccion=pideDatos();
		
		System.out.println("Su cuenta de correo es " + direccion);
		muestraletras(cad1);
		
	}

	public static String pideDatos() {
		String nombre = new String("");
		String dominio = new String("");
		String tld = new String("");
		String direccion = new String("");

		System.out.println("Introduzca un nombre ");
		nombre = Entrada.cadena().toLowerCase().replace(" ", "");
		System.out.println("Introduzca un dominio ");
		dominio = Entrada.cadena().toLowerCase().replace(" ", "");
		System.out.println("Introduzca un tld ");
		tld = Entrada.cadena().toLowerCase().replace(" ", "");

		direccion = nombre + "@" + dominio + "." + tld;
		
		return direccion;
	}

	public static int cuentaVocales(String cad1) {
		int numeroVocales = 0;
		char vectorCaracteres;
		cad1=cad1.toLowerCase();
		
		for (int i = 0; i < cad1.length(); i++) {
			vectorCaracteres = cad1.charAt(i);
			if (vectorCaracteres == 'a' || vectorCaracteres == 'e' || vectorCaracteres == 'i' || vectorCaracteres == 'o'
					|| vectorCaracteres == 'u') {
				numeroVocales++;
			}
		}

		return numeroVocales;
	}

	public static void muestraletras(String cad1) {
		char[] vectorCaracteres = cad1.toCharArray();

		for (int i = 0; i < vectorCaracteres.length - 1; i++) {
			System.out.print(vectorCaracteres[i] + "-");
		}
		System.out.print(vectorCaracteres[vectorCaracteres.length - 1]);
	}

	public static void cambiaVocales(String cadena) {
		String nuevaCadena = new String("");
		int googleDiceQueExisten5Vocales=5;
		
		for (int i = 0; i < googleDiceQueExisten5Vocales; i++) {

			switch (i) {
			case 0:
				nuevaCadena = cadena.replace('e', 'a').replace('i', 'a').replace('o', 'a').replace('u', 'a')
						.replace("qa", "qu").replace("gaa", "gua");
				break;

			case 1:
				nuevaCadena = cadena.replace('a', 'e').replace('i', 'e').replace('o', 'e').replace('u', 'e')
						.replace("qe", "qu").replace("gee", "gue");
				break;

			case 2:
				nuevaCadena = cadena.replace('a', 'i').replace('e', 'i').replace('o', 'i').replace('u', 'i')
						.replace("qi", "qu").replace("gii", "gui");
				break;

			case 3:
				nuevaCadena = cadena.replace('a', 'o').replace('e', 'o').replace('i', 'o').replace('u', 'o')
						.replace("qo", "qu").replace("goo", "guo");
				break;

			case 4:
				nuevaCadena = cadena.replace('a', 'u').replace('e', 'u').replace('i', 'u').replace('o', 'u');
				break;
			}
			System.out.println(nuevaCadena);
		}
	}

	
}