package ejerciciosVectores;

public class VectoresYFuncionesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]vec= {4,5,-3,52,1,26,12};
		int[]vec2= {1,1,1,1,1,1,1};
		int[]otroVec;
		int posNumero=0;
		int numeroBuscado=-13;
		
		/*System.out.println("Probando la función muestraValoresVector: ");
		muestraValoresVector(vec);
		
		System.out.println("\nProbando devuelve posicion valor");
		posNumero=devuelvePosicion(vec,numeroBuscado);
		
		if(posNumero==-1)
			System.out.println("Ese número no está en el vector");
		else
			System.out.println("El número "+numeroBuscado+" está en la posición "+posNumero);
		
		//System.out.println("\nMultiplicando el vector por 3 y mostrando");
		//multiplicaPropioVector(vec,3);
		//muestraValoresVector(vec);
		
		System.out.println("\nMultiplicando el vector en otro por 3 y mostrando los dos vectores");
		otroVec=multiplicaVectorEnOtro2(vec,3);
		System.out.println("Mostrando vec: ");
		muestraValoresVector(vec);
		System.out.println("\nMostrando otroVec: ");
		muestraValoresVector(otroVec);	
		
		System.out.println("Sumando vec y vec2");
		int [] vecSum=sumaVectores(vec,vec2);
		System.out.println("Mostrando vec\n");
		muestraValoresVector(vec);
		System.out.println("\nMostrando vec2\n");
		muestraValoresVector(vec2);
		System.out.println("\nMostrando vecSum\n");
		muestraValoresVector(vecSum);	*/	
		
		System.out.println("Buscando en qué posiciones está el número 2");
		int []vPos=devuelvePosiciones(vec,2);
		System.out.println("El número 2 está en las posiciones: ");
		muestraValoresVector(vPos);
		
		for(int i=0;i<vPos.length;i++) {
			System.out.println("En la posición "+vPos[i]+
					" de vec se encuentra el valor "+vec[vPos[i]]);
		}
		
	}

	//Manuel Martín
	public static void muestraValoresVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("En la posición " + i + " está el " + vector[i]);
		}
	}
	
	//Álvaro Álvarez
	public static int devuelvePosicion (int [] vector, int num) 
	{
		int i=0;
		
		while(i<vector.length && vector[i]!=num) {
			i++;
		}
		
		if(i==vector.length)
			return -1;
		else 
			return i;			
	}
	
	
	public static int devuelvePosicionConFor(int [] vector, int num) 
	{
		
		for(int i=0; i<vector.length;i++) {
			if(vector[i]==num)
				return i;		
		}
		
		return -1;
	}
	
	//Ismael Pozo
	public static void multiplicaPropioVector(int []vec,int num) 
	{
		for (int i = 0; i < vec.length; i++) {
			vec[i]=vec[i]*num;
		}
	}
	
	//Miguel Angel Martín
	public static int[] multiplicaVectorEnOtro(int[] vector, int num) {

		int[] array = new int[vector.length];

		for (int i = 0; i < vector.length; i++) {
			array[i] = vector[i] * num;
		}

		return array;
	}
	
	public static int[] multiplicaVectorEnOtro2(int[] vector, int num) {

		int[] array = vector.clone();

		for (int i = 0; i < vector.length; i++) {
			array[i] = array[i] * num;
		}

		return array;
	}

	//Daniel Gómez Díaz
	public static int [] sumaVectores(int []vec1,int []vec2) {
		int vecSuma[] = vec1.clone();
		for(int i=0;i<vecSuma.length;i++) {
			vecSuma[i]+=vec2[i];
		}
		return vecSuma;
	}

	//Eugenio Paredes Gutiérrez
	public static int[] valoresPares(int[] vector) {
			int contPar = 0;
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % 2 == 0) {
					contPar++;
				}
			}
			int[] vectorPar = new int[contPar];
			int j=0;
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % 2 == 0) {
					vectorPar[j] = vector[i];
					j++;
				}
			}
			return vectorPar;
		}

	
	//Amador Muñoz Berzosa
		public static int[] devuelvePosiciones(int[] vector, int numero) {
			int[] vectorPosiciones;
			int contPosiciones = 0;
			int j = 0;

			for (int i = 0; i < vector.length; i++)
				if (vector[i] == numero)
					contPosiciones++;

			vectorPosiciones = new int[contPosiciones];

			for (int i = 0; i < vector.length; i++)
				if (vector[i] == numero) {
					vectorPosiciones[j] = i;
					j++;
				}

			return vectorPosiciones;
		}

		//Angela Jimenez
		public static int[] generaVectorAleatorio (int tam, int min, int max) {
			int[] vectorAleatorio=new int[tam];
			for (int i = 0; i < vectorAleatorio.length; i++) 
				vectorAleatorio[i]=(int)(Math.random()*(max-min+1))+min;
			
			return vectorAleatorio;
		}

}