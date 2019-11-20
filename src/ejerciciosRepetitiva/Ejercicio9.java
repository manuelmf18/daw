package ejerciciosRepetitiva;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El algoritmo pide números enteros positivos y te da la media de todos.
		// Finaliza cuando se mete un numero negativo
		double num = 0, totalNumeros = 0, suma = 0;

		while (num >= 0) {
			System.out.println("Escribe un numero: ");
			num = Entrada.real();
			if (num >= 0) {
				totalNumeros++;
				suma = suma + num;
			}
		}
		System.out.println("La media de los numeros es: " + suma / totalNumeros);

	}

}
