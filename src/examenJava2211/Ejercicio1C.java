package examenJava2211;

public class Ejercicio1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String PALABRA_CLAVE1A=new String("alfa"), PALABRA_CLAVE2A=new String("beta"), PALABRA_CLAVE3A=new String("omega");
		final String PALABRA_CLAVE1B=new String("trueno"), PALABRA_CLAVE2B=new String("rayo"), PALABRA_CLAVE3B=new String("nube");
		
		boolean disparo=false, puertaAbierta=false;
		String palabraActual=new String("");
		int numPalabraClave=1;
		String mostrarPal1=new String(""), mostrarPal2=new String("");
				
		
		while(!disparo && !puertaAbierta)
		{
			System.out.println("Introduzca una de las palabras claves para la posición "+numPalabraClave);
			palabraActual=Entrada.cadena().toLowerCase();
			
			if((numPalabraClave==1 && (palabraActual.equals(PALABRA_CLAVE1A) || palabraActual.equals(PALABRA_CLAVE1B))) ||
			   (numPalabraClave==2 && (palabraActual.equals(PALABRA_CLAVE2A) || palabraActual.equals(PALABRA_CLAVE2B))) ||
			   (numPalabraClave==3 && (palabraActual.equals(PALABRA_CLAVE3A) || palabraActual.equals(PALABRA_CLAVE3B))))
			{
				System.out.println("¡Palabra clave "+numPalabraClave+" ACERTADA!");
				numPalabraClave++;
				
				if(numPalabraClave==4)
					puertaAbierta=true;
			}
			else
			{
				if(numPalabraClave==1) {
					mostrarPal1=PALABRA_CLAVE1A;
					mostrarPal2=PALABRA_CLAVE1B;
				}
				else if(numPalabraClave==2){
					mostrarPal1=PALABRA_CLAVE2A;
					mostrarPal2=PALABRA_CLAVE2B;
				}
				else if(numPalabraClave==3){
					mostrarPal1=PALABRA_CLAVE3A;
					mostrarPal2=PALABRA_CLAVE3B;
				}
				
				System.out.println("¡Fallaste la palabra clave "+numPalabraClave+". Las posibilidades eran: "+mostrarPal1+" o "+mostrarPal2);
				disparo=true;
			}			
		}
		
		if(disparo)
			System.out.println("Has fallado una palabra clave...empezaremos a disparar en 5 segundos");
		else
			System.out.println("La puerta se ha abierto...puedes entrar");
	}

}
