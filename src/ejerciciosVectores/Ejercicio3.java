package ejerciciosVectores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorNumeros = new int[10];
		int num=0, posicion=0;
		
		for (int i = 0; i < vectorNumeros.length; i++) {
			vectorNumeros[i] =  (int) Math.round(Math.random()*100);
		}
		
		for (int i = 0; i < vectorNumeros.length; i++) {
			if(vectorNumeros[i]>num) {
				num=vectorNumeros[i];
				posicion=i;
			}
		}

		System.out.println("El n�mero m�s grande es el "+num+" y est� en la posici�n "+posicion+" del vector");
		
	}

}
