package examenJAVA1;

public class Ejercicio2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DIA_SECRETO=23, MES_SECRETO=11, ANYO_SECRETO=2005;
		
		int dia=0,mes=0,anyo=0, intentos=1, oportunidades=0;
		boolean acertada=false, fechaCorrecta=true;
		
		System.out.println("¡BIENVENIDO A ADIVINA LA FECHA SECRETA!");
		System.out.println("¿En cuantos intentos quieres adivinar la fecha?");
		oportunidades=Entrada.entero();
		
		while(!acertada && intentos<=oportunidades)
		{
			System.out.println("\nIntroduzca el día: ");
			dia=Entrada.entero();
			
			System.out.println("\nIntroduzca el mes: ");
			mes=Entrada.entero();
			
			System.out.println("\nIntroduzca el año: ");
			anyo=Entrada.entero();
			
			//fecha correcta
			if(mes<1 || mes>12)
				fechaCorrecta=false;
			else
				if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31))
					fechaCorrecta=false;
				else
					if((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 ||  dia>30))
						fechaCorrecta=false;
					else
						if(mes==2 && ((anyo%4==0) && ((anyo%100!=0) || (anyo%400==0)) && (dia<1 || dia>29)))
							fechaCorrecta=false;
						else
							if(mes==2 && !((anyo%4==0) && ((anyo%100!=0) || (anyo%400==0)) && (dia<1 || dia>28)))
								fechaCorrecta=false;
				
			if(fechaCorrecta) {
				if(anyo<ANYO_SECRETO)
					System.out.println("El año secreto es mayor que el año que has escrito");
				else
					if(anyo>ANYO_SECRETO)
						System.out.println("El año secreto es menor que el año que has escrito");
					else
						if(mes<MES_SECRETO)
							System.out.println("AÑO ACERTADO!\n\nPero el mes secreto es mayor que el mes que has escrito");
						else
							if(mes>MES_SECRETO)
								System.out.println("AÑO ACERTADO!\n\nPero el mes secreto es menor que el mes que has escrito");
							else
								if(dia<DIA_SECRETO)
									System.out.println("AÑO ACERTADO!\nMES ACERTADO!\n\nPero el día secreto es mayor que el día que has escrito");
								else
									if(dia>DIA_SECRETO)
										System.out.println("AÑO ACERTADO!\nMES ACERTADO!\n\nPero el día secreto es menor que el día que has escrito");
									else								
										acertada=true;
									
									
				if(!acertada)									
					intentos++;				
			}
			else
				System.out.println("Fecha incorrecta, este intento no cuenta...");
			
			fechaCorrecta=true;			
		}
		
		if(acertada)
			System.out.println("\n¡¡ACERTASTE LA FECHA EN "+intentos+" INTENTOS!!");
		else
			System.out.println("\n¡¡OOH!! AGOTASTE TUS INTENTOS, LA FECHA ERA "+DIA_SECRETO+"/"+MES_SECRETO+"/"+ANYO_SECRETO);
		
		
	}

}
