package ejerciciosRepetitiva;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// algoritmo que muestre por pantalla la suma de los números pares desde el 1
		// hasta el 20 y también la multiplicación de los números impares desde el 1
		// hasta el 20
		int cont = 1, multiplicacion = 1, suma = 0;

		while (cont <= 6) {
			if (cont % 2 == 0) {
				suma = suma + cont;
			} else {
				multiplicacion = multiplicacion * cont;
			}
			cont++;
		}
		System.out.println("La suma de pares es: " + suma + " y la multiplicación de los impares:  " + multiplicacion);

	}

}
