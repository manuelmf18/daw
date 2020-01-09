package ejerciciosVectores;

public class EjercicioInicialVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1º
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		// 2º
		float[] vectorF1 = new float[10];

		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println("Dame un valor para la posición " + i);
			vectorF1[i] = (float) Entrada.real();
		}

		// 3º
		float[] vectorF2 = vectorF1.clone();

		// 4º
		final int NUM = 15;
		int[] vectorI = new int[NUM];

		// 5º
		for (int i = 0; i < vectorI.length; i++) {
			System.out.println("En la posición " + i + " hay " + vectorI[i]);
		}

		for (int i = 0; i < vectorI.length; i++) {
			vectorI[i]=(i+1)+5;
		}

		for (int i = 0; i < vectorI.length; i++) {
			System.out.println("En la posición " + i + " hay " + vectorI[i]);
		}
		
		// 6º
		if(vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		// 7º
		for(int i=0;i<vectorF2.length;i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorF2[i]=(float) Entrada.real();
		}
		
		// 8º
		if(vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		// 9º
		float []  vectorFsuma= new float[10];
		for (int i = 0; i < vectorFsuma.length; i++) {
			vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		}
		
		// 10º
		for (int i = 0; i < vectorFsuma.length; i++) {
			System.out.println("En la posición " + i + " hay " + vectorFsuma[i]);
		}

		// 11º
		for(int i=0;i<vocales.length;i++) {
			vocales[i]=Character.toUpperCase(vocales[i]);
		}
	
		// 12º
		for (int i = 0; i < vocales.length; i++) {
			System.out.println("En la posición " + i + " hay " + vocales[i]);
		}
	}
}
