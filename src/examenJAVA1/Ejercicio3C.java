package examenJAVA1;

public class Ejercicio3C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primo_secreto=0,i=2,avanza=0;
		char letra=' ',letraEncriptada=' ';
		boolean esPrimo=false;
		
		while(!esPrimo) {
			primo_secreto=(int)Math.floor(Math.random()*25+1); //numero aleatorio
			
			while(i<=(primo_secreto/2+1) && primo_secreto%i!=0) //comprobación primo
				i++;
				
			if(i>(primo_secreto/2+1))
				esPrimo=true;
			
			i=2;
		}
		
		System.out.println("El número primo secreto es: "+primo_secreto);
		
		System.out.println("Escribe una letra: ");
		letra=Entrada.caracter();
		
		System.out.println("Se irá al número: "+((int)letra+primo_secreto));
		
		avanza=(((int)letra+primo_secreto));
		if(avanza<=122)
			letraEncriptada=(char)avanza;
		else
			letraEncriptada=(char)(96+avanza%122);
		System.out.println("La letra "+letra+" encriptada pasará a ser la letra "+letraEncriptada);
	}

}
