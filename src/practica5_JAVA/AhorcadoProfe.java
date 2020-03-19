package practica5_JAVA;

public class AhorcadoProfe {

	static final int NUM_FILAS=10, NUM_COL=4;
	
	public static void main(String[] args) {
		
		int op=0, i=0,j=0, intentos=0;
		boolean enc=false, resolv=false;
		String opCad=new String(""), cad=new String("");
		String []vecJuego;
		char [] vecCarac= {'|','|','|','|','|'};
		char letra;
		//String[][] matrizJuego=creaMatrizConPalabras();
		String[][] matrizJuego= {{"el","perro","tiende","peras"},
				 					{"su","niño","coge","curvas"},
				 					{"tu","algodon","engaña","a  los  pajaros"},
				 					{"un",null,"come","hierba"},
				 					{"mi",null,null,"aristas"},
				 					{null,null,null,null},
				 					{null,null,null,null},
				 					{null,null,null,null},
				 					{null,null,null,null},
				 					{null,null,null,null}};
		
		ordenarMatrizPorColumnas(matrizJuego);
		
		while(op!=6) {
			System.out.println("\n\n¿Qué quieres hacer?\n1.Crear matriz de juego"
													+ "\n2.Mostrar matriz de juego ordenada"
													+ "\n3.Añadir a matriz de juego"
													+ "\n4.Buscar cadena en matriz de juego"
													+ "\n5.Jugar"
													+ "\n6.Salir");
			op = Entrada.entero();

			switch (op) {
				case 1:
					System.out.println("\nCreando matriz de juego...\n");
					matrizJuego = creaMatrizConCadenas();
					ordenarMatrizPorColumnas(matrizJuego);
					break;
				case 2:
					System.out.println("\nMostrando matriz de juego...\n");
					mostrarMatriz(matrizJuego);
					break;
				case 3:
					System.out.println("\nAñadir a matriz de juego...\n");
					System.out.println("¿Qué quiere añadir? articulodet/sujeto/verbo/predicado");
					opCad = Entrada.cadena();
	
					System.out.println("Escriba la cadena a añadir:");
					cad = Entrada.cadena();
	
					if (anyadeCadenaAMatriz(matrizJuego, cad, opCad)) {
						System.out.println("\nCadena añadida con éxito");
						ordenarMatrizPorColumnas(matrizJuego);
					} else
						System.out.println("\nNo se pudo añadir");
					break;
				case 4:
					System.out.println("\nBuscar cadena en matriz de juego...\n");
					System.out.println("¿Qué cadena quiere buscar?");
					cad = Entrada.cadena();
	
					while (!enc && i < NUM_COL) {
						if (existeCadenaEnColumna(matrizJuego, cad, i))
							enc = true;						
						i++;
					}
	
					if (enc)
						System.out.println("\nExiste " + cad + " en la matriz de juego");
					else
						System.out.println("\nNo existe " + cad + " en la matriz de juego");
					break;
				case 5:
					System.out.println("\n\n-----A JUGAARRRRR------\n");
					intentos=0;
					vecJuego=generaVectorJuego(matrizJuego);
					
					for(int pos=0;pos<vecCarac.length;pos++)
						vecCarac[pos]='|';
					
					System.out.println("\n¡Puede pedir hasta 5 letras para resolver la frase y puede usar pistas!\n");
					for(j=0;j<vecJuego.length;j++)
						System.out.print(escondePalabra(vecCarac,vecJuego[j])+"  ");
					
					while(intentos<5 && !resolv) {						
						System.out.println("Pide letra: ");
						letra=Entrada.caracter();
						
						if(!insertaLetraOrdenadaVector(vecCarac,letra))
							System.out.println("La letra ya la habías insertado antes");
							
						
						for(j=0;j<vecJuego.length;j++)
							System.out.print(escondePalabra(vecCarac,vecJuego[j])+"  ");
						
						j=0;
						System.out.println("\nLas letras que has puesto son:\n");
						while(j<vecCarac.length && vecCarac[j]!='|') {
							System.out.print("["+vecCarac[j]+"]");
							j++;
						}
						
						System.out.println("\n");
						
						System.out.println("\n\n¿Qué quieres? \n1.Resolver"
														  +"\n2.Pista obtener parte de la frase"
														  + "\n3.Pista comprobar si sé una parte de la frase"
														  + "\n4.Seguir");
						op=Entrada.entero();
						
						switch(op)
						{
							case 1:
								System.out.println("\nLa frase es: ");
								cad=Entrada.cadena();
								resolv=resolver(vecJuego,cad);
								if(!resolv)
									System.out.println("\n¡Nop! ¡No has acertado!\n\n");
								break;
							case 2:
								System.out.println("\nForma parte de la fase la cadena: "+pistaParteFrase(vecJuego));
								break;
							case 3:
								System.out.println("\nEscribe la parte de la frase que crees que sabes: ");
								cad=Entrada.cadena();
								if(esParteDeLaFrase(vecJuego,cad))
									System.out.println("\nPues sí, "+cad+" forma parte de la frase");
								else
									System.out.println("\nNo, "+cad+" no forma parte de la frase");
								break;
							case 4:
								System.out.println("\nSeguimos...");
								break;
							default:
								System.out.println("Opción incorrecta");								
						}
						
						intentos++;					
					}
					
					if(resolv)
						System.out.println("\n¡Enhorabuena! Has resuelto la frase");
					else {
						System.out.println("\nOOOH! La frase era: ");
						for(j=0;j<vecJuego.length;j++)
							System.out.print(vecJuego[j]+"  ");
					}
					break;
				case 6:
					System.out.println("Hasta luegor!");
					break;
				default:
					System.out.println("Opción incorrecta");
			}	
		}
	}
	
	public static String [][]  creaMatrizConCadenas()
	{
		String [][] mat=new String[NUM_FILAS][NUM_COL];
		int cont=0;
		String pal=new String("");
		
		System.out.println("Introduce los artículos, escribe \"fin\" para indicar que has terminado: ");
		pal=Entrada.cadena().toLowerCase();
		while(pal.compareTo("fin")!=0 && cont<NUM_FILAS)
		{
			mat[cont][0]=pal.replaceAll(" ","  ");
			cont++;
			pal=Entrada.cadena().toLowerCase();
		}
		
		cont=0;
		System.out.println("Introduce los sujetos, escribe \"fin\" para indicar que has terminado: ");
		pal=Entrada.cadena().toLowerCase();
		while(pal.compareTo("fin")!=0 && cont<NUM_FILAS)
		{
			mat[cont][1]=pal.replaceAll(" ","  ");
			cont++;
			pal=Entrada.cadena().toLowerCase();
		}
		
		cont=0;
		System.out.println("Introduce los verbos, escribe \"fin\" para indicar que has terminado: ");
		pal=Entrada.cadena().toLowerCase();
		while(pal.compareTo("fin")!=0 && cont<NUM_FILAS)
		{
			mat[cont][2]=pal.replaceAll(" ","  ");
			cont++;
			pal=Entrada.cadena().toLowerCase();
		}
		
		cont=0;
		System.out.println("Introduce los predicados, escribe \"fin\" para indicar que has terminado: ");
		pal=Entrada.cadena();
		while(pal.compareTo("fin")!=0 && cont<NUM_FILAS)
		{
			mat[cont][3]=pal.replaceAll(" ","  ");
			cont++;
			pal=Entrada.cadena().toLowerCase();
		}		
		return mat;
	}
	
	public static void mostrarMatriz(String[][]mat)
	{
		System.out.println("\t\tArtDet\t\tSuj\t\tVerb\t\tPred\n");
		
		for(int i=0;i<mat.length;i++)
		{
			System.out.print(i);
			for(int j=0;j<mat[i].length;j++)
				if(mat[i][j]!=null)
					System.out.print("\t\t"+mat[i][j]);
				else
					System.out.print("\t\t");
			System.out.println();
		}		
	}
	
	public static void ordenarColumnaMatriz(String [][]mat, int columnaAOrdenar)
	{
		int i=0, j=0;
		String temp;
		while(i<mat.length && mat[i][columnaAOrdenar]!=null) {
			temp = mat[i][columnaAOrdenar];
			j = i - 1;
			while ((j >= 0) && (mat[j][columnaAOrdenar].compareTo(temp)>0)) {
				mat[j + 1][columnaAOrdenar] = mat[j][columnaAOrdenar];
				j--;
			}
			mat[j + 1][columnaAOrdenar] = temp;
			i++;
		}
	}
	
	public static void ordenarMatrizPorColumnas(String[][] mat)
	{
		for(int i=0;i<NUM_COL;i++)
			ordenarColumnaMatriz(mat,i);
	}
	
	
	public static boolean existeCadenaEnColumna(String[][]matriz,String pal,int col)
	{
		int centro,inf=0,sup=0;
		
		while(sup<matriz.length && matriz[sup][col]!=null)
			sup++;
				
		sup=sup-1;
		
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			if (matriz[centro][col].equals(pal))
				return true;
			else if ((pal).compareTo(matriz[centro][col]) < 0)
				sup = centro - 1;
			else
				inf = centro + 1;
		}

		   return false;
	 }
	
	public static boolean anyadeCadenaAMatriz(String [][] mat, String nuevaCad, String tipo)
	{
		int col=0;
		switch(tipo)
		{
			case "articulodet": col=0;break;
			case "sujeto": col=1;break;
			case "verbo": col=2;break;
			case "predicado": col=3;break;
			default: col=-1;
		}
		
		if(col<0 || existeCadenaEnColumna(mat,nuevaCad,col))
			return false;
		
		for(int i=0;i<NUM_FILAS;i++)
			if(mat[i][col]==null)
			{
				mat[i][col]=nuevaCad.replaceAll(" ","  ");
				return true;
			}		
		return false;
	}	
	
	public static String[] generaVectorJuego(String[][] mat)
	{
		String[] vectorJuego=new String[NUM_COL];
		int i=0,pos=0;
		while(i<NUM_COL)
		{
			pos=(int)(Math.random()*NUM_FILAS);
			if(mat[pos][i]!=null)
			{
				vectorJuego[i]=mat[pos][i];
				i++;
			}
		}
		
		return vectorJuego;			
	}
	
	public static boolean contiene(char[] vecLetras,char letra)
	{
		int i=0;
		while(i<vecLetras.length && vecLetras[i]!='|' )
		{
			if(vecLetras[i]==letra)
				return true;
			else
				i++;
		}
		return false;			
	}
	
	public static boolean insertaLetraOrdenadaVector(char[] vecLetras, char letra)
	{
		int j;
		
		if(vecLetras[vecLetras.length-1]!='|' || contiene(vecLetras,letra))
			return false;
		else {
			j = vecLetras.length - 2;
			while ((j >= 0) && (vecLetras[j] > letra)) {
				vecLetras[j + 1] = vecLetras[j];
				j--;
			}
			vecLetras[j + 1] = letra;			
			}
			return true;
		}
	
	public static String escondePalabra(char[]vecLetras,String parte)
	{
		String nuevaPalabra=new String("");
		for(int i=0;i<parte.length();i++)
			if(contiene(vecLetras,parte.charAt(i)) || parte.charAt(i)==' ')
				nuevaPalabra+=parte.charAt(i);
			else
				nuevaPalabra+="_ ";				
		
		return nuevaPalabra;
	}
	
	public static String pistaParteFrase(String[]vecJuego)
	{
		int pos=(int)(Math.random()*vecJuego.length);
		
		int numCaracteresIni=(int)(Math.random()*(vecJuego[pos].length()-1));
		int numCaracteresFin=(int)((Math.random()*(vecJuego[pos].length()-numCaracteresIni))+numCaracteresIni+1);
		return vecJuego[pos].substring(numCaracteresIni,numCaracteresFin);
	}
	
	public static boolean esParteDeLaFrase(String[]vecJuego,String subseq)
	{
		String concatenada=new String("");
		for(int i=0;i<vecJuego.length;i++)
			concatenada+=vecJuego[i]+" ";
				
		if(concatenada.trim().replaceAll("  "," ").indexOf(subseq)!=-1)
			return true;
		else
			return false;
	}	
	
	public static boolean resolver(String[]vecJuego,String respuesta)
	{
		String concatenada=new String("");
		for(int i=0;i<vecJuego.length;i++)
			concatenada+=vecJuego[i]+" ";
		
		concatenada=concatenada.trim().replaceAll("  "," ");
				
		if(concatenada.equals(respuesta))
			return true;
		else
			return false;
	}

}