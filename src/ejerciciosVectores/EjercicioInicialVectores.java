package ejerciciosVectores;

public class EjercicioInicialVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1�
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		// 2�
		float[] vectorF1 = new float[10];

		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println("Dame un valor para la posici�n " + i);
			vectorF1[i] = (float) Entrada.real();
		}

		// 3�
		float[] vectorF2 = vectorF1.clone();

		// 4�
		final int NUM = 15;
		int[] vectorI = new int[NUM];

		// 5�
		for (int i = 0; i < vectorI.length; i++) {
			System.out.println("En la posici�n " + i + " hay " + vectorI[i]);
		}

		for (int i = 0; i < vectorI.length; i++) {
			vectorI[i]=(i+1)+5;
		}

		for (int i = 0; i < vectorI.length; i++) {
			System.out.println("En la posici�n " + i + " hay " + vectorI[i]);
		}
		
		// 6�
		if(vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		// 7�
		for(int i=0;i<vectorF2.length;i++) {
			System.out.println("Dame un valor para la posici�n "+i);
			vectorF2[i]=(float) Entrada.real();
		}
		
		// 8�
		if(vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		// 9�
		float []  vectorFsuma= new float[10];
		for (int i = 0; i < vectorFsuma.length; i++) {
			vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		}
		
		// 10�
		for (int i = 0; i < vectorFsuma.length; i++) {
			System.out.println("En la posici�n " + i + " hay " + vectorFsuma[i]);
		}

		// 11�
		for(int i=0;i<vocales.length;i++) {
			vocales[i]=Character.toUpperCase(vocales[i]);
		}
	
		// 12�
		for (int i = 0; i < vocales.length; i++) {
			System.out.println("En la posici�n " + i + " hay " + vocales[i]);
		}
	}
}
