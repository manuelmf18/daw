package ejerciciosJAVAI;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pide un número al usuario e imprime la cantidad de cada uno de esos dígitos
		// que hay en el número
		int num = 0, cifras = 1, resto = 0, cont_cifra = 0, num_cifra = 0;

		System.out.println("Introduce un número");
		num = Entrada.entero();
		cifras = num;
		while (num_cifra < 10) {
			if (cifras == 0) {
				cifras = num;
				System.out.println("Cifra " + num_cifra + " : hay " + cont_cifra + "en su número");
				num_cifra++;
				cont_cifra = 0;
			}
			resto = cifras % 10;
			cifras = num / 10;
			if (resto == num_cifra) {
				cont_cifra++;
			}

		}
	}

}