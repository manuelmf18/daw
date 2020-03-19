package practica5_JAVA;

public class pruebaSopaDeLetras {

	static final int NUM_FILAS = 12, NUM_COL = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// habra palabras que son de abajo hacia arriba , supongo que se seleccionaran
		// con posiciones matrizpalabras[i] [j] y cada caracter entre las posiciones
		// formará una palabra que se comparará con equal mediante un for de un vector
		// palabrasSecretas[i] (al reves supongo que también podrán estar)
	
//		String cad1 = ("MARIA AMPARO");
//		System.out.println(cad1.endsWith("paro"));
//		System.out.println(cad1.endsWith("PARO"));
//		System.out.println(cad1.endsWith("ARIA"));
//		String cad12 = ("MARIA AMPARO");
//		char cad2 [] = cad12.toCharArray( );
//		System.out.println(cad2 [0]);
//		System.out.println(cad2 [1]);
		
		char[][] matrizJuego = new char[NUM_FILAS][NUM_COL];
		String palabra;
		//matrizJuego = rellenarMatiz();
		matrizJuego =llenarSopa();
		//imprimirSopa(matrizJuego);
		mostrarTamblero(matrizJuego);
		System.out.println("introduce palabra");
		palabra=Entrada.cadena();
		introducePalabra(matrizJuego, palabra);
		mostrarTamblero(matrizJuego);
		
		//PROBAR ORDENACIÓN 
		// EDITAR CADENAS Y CARACTERES
		
		
		
		
	}

	public static char[][] rellenarMatiz() { //con ascii
		char[][] matrizJuego = new char[NUM_FILAS][NUM_COL];
		// String cad = new String("");

		for (int i = 0; i < matrizJuego.length; i++) {
			for (int j = 0; j < matrizJuego.length; j++) {
				matrizJuego[i][j] = (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);
			}
		}

		return matrizJuego;
	}
	
	public static char[][] llenarSopa() { //con abecedario en una cadena
		char[][] matrizJuego = new char[NUM_FILAS][NUM_COL];
		String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean [][] criba=new boolean[NUM_FILAS][NUM_COL];
		for(int i=0;i<matrizJuego.length;i++) {
			for(int j=0;j<matrizJuego[0].length;j++) {
				matrizJuego[i][j]=letras.charAt((int) Math.floor(Math.random() * ((letras.length()-1)+1)));
				criba[i][j]=true; //crea una matriz boolean para que no se pisen las palabras
			}
		}
		return matrizJuego;
	}

	public static void mostrarTamblero(char[][] matrizJuego) { //con numeros

		for (int i = 0; i < NUM_FILAS; i++) {
			for (int j = 0; j < NUM_COL; j++) {
				if(i==0) {
					if(j==0) {
						System.out.print("\t");
						System.out.print("  "+j+"  ");
					} else {
							if(j==NUM_COL-1) {
							System.out.println(" "+j+" ");
							} else {
								if(j>9) {
									System.out.print(" "+j+"  ");
								}else {
								System.out.print("  "+j+"  ");
								}
							}
					}
				}else  if(j==0) {
					System.out.print(i+"\t");
					System.out.print("  "+matrizJuego[i-1][j]+"  ");
				} else {
					System.out.print("  "+matrizJuego[i-1][j]+"  ");
					if (i == NUM_FILAS - 1) {
						System.out.print("  "+matrizJuego[i][j]+"  ");
					}
				}

			}
			System.out.println("\n");
		}
	}
	public static void imprimirSopa(char[][] matrizJuego) { //sin números
		for(int i=0;i<NUM_FILAS;i++) {
			for(int j=0;j<NUM_COL;j++) {
				System.out.print(matrizJuego[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void introducePalabra(char[][] matrizJuego, String palabra) {
		int aleatorio= (int) (Math.random()* (2-1+1)+1);
		int inic=0, fil=0, col=0;
		
		System.out.println(aleatorio);
		
		if(aleatorio==1) { //vertical
			inic= (int) (Math.random()* (matrizJuego.length-1)+1);
			col= (int) (Math.random()* (matrizJuego.length-palabra.length())+1);
			
			System.out.println("vertical , columna "+inic+" empieza en "+col+"\n");
			
			
			for(int i=0;i<palabra.length();i++) {
				matrizJuego[inic][col]=palabra.charAt(i);
				col++;
			}
		} else {
			inic= (int) (Math.random()* (matrizJuego.length-palabra.length())+1);
			fil= (int) (Math.random()* (matrizJuego.length-1)+1);
			
			System.out.println("horizontal , fila "+inic+" empieza en "+fil+"\n");
			
			for(int i=0;i<palabra.length();i++) {
				matrizJuego[fil][inic]=palabra.charAt(i);
				fil++;
			}
		}
		
		
		for(int i=0;i<NUM_FILAS;i++) {
			for(int j=0;j<NUM_COL;j++) {
				System.out.print(matrizJuego[i][j]+" ");
			}
			System.out.println();
		}
	}
	
//	public int[][] posiblesSolucionesDe(String palabra) { 
//	  	char letra;
//	  
//		for(int i=palabra.length()-1; i > 0; i--){ RECORRERLO 
//			
//		}
//
//	  	for(int i=0; i < matriz.length; i++){
//	  	  for(int j=0; j < matriz[i].length; j++){
//	    		if(matriz[i][j] == primeraLetra){
//	    		  indiceInvertido.add(new int[]{i, j}); // Guardar la posicion de la letra en la matriz.
//	    		}
//	  	  }
//	  	}
//	  	return toArrayInt(indiceInvertido);
//	  }
	
//	public void meterEnTablero() { EN SOPA ESTAN SEPARADOS EN METODOS
//		char[][] tablero = sp.getTablero();
//		
//		for(int i=0; i<palabra.length(); i++) {
//			char letra = palabra.charAt(i);
//			switch (orientacion) {
//			case Orientacion.HORIZONTAL:				
//				tablero[linea][col+i] = letra;
//				break;
//			case Orientacion.VERTICAL:
//				tablero[linea+i][col] = letra;
//				break;
//			case Orientacion.DIAGONAL_DRC:
//				tablero[linea+i][col+i] = letra;
//				break;
//			case Orientacion.DIAGONAL_IZQ:
//				tablero[linea+i][col-i] = letra;
//				break;
//			case Orientacion.INV_HORIZONTAL:				
//				tablero[linea][col-i] = letra;
//				break;
//			case Orientacion.INV_VERTICAL:
//				tablero[linea-i][col] = letra;
//				break;
//			case Orientacion.INV_DIAGONAL_DRC:
//				tablero[linea-i][col+i] = letra;
//				break;
//			case Orientacion.INV_DIAGONAL_IZQ:
//				tablero[linea-i][col-i] = letra;
//				break;
//			}
//		}
//	}
}
