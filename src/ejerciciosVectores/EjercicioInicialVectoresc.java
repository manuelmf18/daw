package ejerciciosVectores;

public class EjercicioInicialVectoresc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM=15;
		
		//declaración del vector vocales
		 char[] vocales={'a','e','i','o','u'};
		 //declaración del vector pero sin crearlo
		 float[] vectorF1;
		 //crear el vector reservando espacio de memoria para el mismo	 
		 vectorF1=new float [10];
		 
		 
		 //rellenando vectorF1
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println("Introduce un numero");
			vectorF1[i]=(float)Entrada.real();
		}
		 
		//clonando vectorF2
		 float[] vectorF2=vectorF1.clone();
		
		 //declarando y creando vectorI
		 int [] vectorI=new int[NUM];
		 
		 //mostrando datos vectorI, tendrá todas las posiciones con contenido 0
		 for (int i = 0; i < NUM; i++) {
				System.out.println("Posicion "+i+ ": "+vectorI[i]);
			}
		 
		 //rellena con múltiplos de 5, empezando por 5!
		 for (int i = 0; i < NUM; i++)			
			vectorI[i]=5*(i+1);
			
		 //ahora si mostramos vectorI, nos mostrará 5,10,15...
		 for (int i = 0; i < NUM; i++) {
			System.out.println("Posicion "+i+ ": "+vectorI[i]);
		}
		 
		 //comparando vectores F1 Y F2
		 if (vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales los vectores: F1 y F2");
		}
		 else {
			System.out.println("No son iguales los vectores: F1 y F2");
		}
		
		 //cambiando valores para vectorF2
		 for (int i = 0; i < vectorF2.length; i++) {
			System.out.println("Introduce valores reales: ");
			vectorF2[i]=(float)Entrada.real();
		}
		 
		 //comparando otra vez vectores F1 y F2
		 if (vectorF1.equals(vectorF2)) {
				System.out.println("Son iguales los vectores: F1 y F2");
		}
		 else {
				System.out.println("No son iguales los vectores: F1 y F2");
		}
		 
		 //declarando y creando vector Fsuma
		 float [] vectorFsuma=new float[vectorF1.length];
		 
		 //guardando la suma de los contenidos de los vectores F1 y F2 en su correspondiente posición
		for (int i = 0; i < vectorFsuma.length; i++) 
			vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		
		//mostrando los valores de vectorFsuma
		for (int i = 0; i < vectorFsuma.length; i++) 
			System.out.println(vectorFsuma[i]);
		
		//poner a mayúsculas las vocales
		for (int i = 0; i < vocales.length; i++)
			vocales[i]=Character.toUpperCase(vocales[i]);

		//mostrar por pantalla las vocales ya pasadas a mayúsculas
		for (int i = 0; i < vocales.length; i++)
			System.out.println(vocales[i]);

	}
}