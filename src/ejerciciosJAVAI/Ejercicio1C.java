package ejerciciosJAVAI;

public class Ejercicio1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, num2 = 0, contadornum = 0, contadornum2 = 0, i = 0;

		System.out.println("Introduce un número entero:");
		num = Entrada.entero();
		System.out.println("Introduce otro número entero:");
		num2 = Entrada.entero();

		while (i<=num2 ) {
			i++;
			if (num % i == 0)
				contadornum++;
			if (num2 % i == 0)
				contadornum2++;
		}
		if (contadornum == 2 && contadornum2 == 2 && num2 == (num + 2))
			System.out.println("Los dos son primos gemelos");
		else
			System.out.println("No son números primos gemelos");

	}

}
