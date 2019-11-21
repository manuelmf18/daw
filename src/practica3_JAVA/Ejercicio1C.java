package practica3_JAVA;

public class Ejercicio1C {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String NOMBRE_SECRETO=new String("rosalia"), 
				     APELLIDO1_SECRETO=new String("vila"),
				     APELLIDO2_SECRETO=new String("tobella");
		
		final int NUM_INTENTOS=4;
		
		String nom=new String(""), ape1=new String(""), ape2=new String("");
		int intentos=0;
		
		
		System.out.println("-----------------¡ACIERTA EL PERSONAJE SECRETO!-----------------");
		
		while(intentos<NUM_INTENTOS && !(nom.equals(NOMBRE_SECRETO) 
				                         && ape1.equals(APELLIDO1_SECRETO)
				                         && ape2.equals(APELLIDO2_SECRETO)))
		{
			System.out.println("\n\nIntroduce un nombre:");
			nom=Entrada.cadena().toLowerCase();
			
			System.out.println("Introduce el primer apellido:");
			ape1=Entrada.cadena().toLowerCase();
			
			System.out.println("Introduce el segundo apellido:");
			ape2=Entrada.cadena().toLowerCase();
			
			if(nom.compareTo(NOMBRE_SECRETO)==0)
				System.out.println("¡Nombre acertado!");
			else if(nom.compareTo(NOMBRE_SECRETO)<0)
				System.out.println("El nombre que has escrito es alfabéticamente menor que el nombre secreto");
			else //el nombre es mayor que el nombre secreto
				System.out.println("El nombre que has escrito es alfabéticamente mayor que el nombre secreto");
			
			if(ape1.compareTo(APELLIDO1_SECRETO)==0)
				System.out.println("¡Primer apellido acertado!");
			else if(ape1.compareTo(APELLIDO1_SECRETO)<0)
				System.out.println("El primer apellido que has escrito es alfabéticamente menor que el primer apellido secreto");
			else //el primer apellido escrito es mayor que el primer apellido secreto
				System.out.println("El primer apellido que has escrito es alfabéticamente mayor que el primer apellido secreto");
			
			if(ape2.compareTo(APELLIDO2_SECRETO)==0)
				System.out.println("¡Segundo apellido acertado!");
			else if(ape2.compareTo(APELLIDO2_SECRETO)<0)
				System.out.println("El segundo apellido que has escrito es alfabéticamente menor que el segundo apellido secreto");
			else //el segundo apellido escrito es mayor que el segundo apellido secreto
				System.out.println("El segundo apellido que has escrito es alfabéticamente mayor que el segundo apellido secreto");
			
			intentos++;
		}
		
		if((nom.equals(NOMBRE_SECRETO) && ape1.equals(APELLIDO1_SECRETO) && ape2.equals(APELLIDO2_SECRETO)))
			System.out.println("\n¡MUY BIEN! ACERTASTE AL PERSONAJE SECRETO en "+intentos+" intentos");
		else
			System.out.println("\n¡OOOOH! HAS FALLADO\nEL PERSONAJE SECRETO ERA: "+NOMBRE_SECRETO+" "+APELLIDO1_SECRETO+" "+APELLIDO2_SECRETO);
		
	}


}
