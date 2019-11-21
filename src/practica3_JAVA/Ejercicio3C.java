package practica3_JAVA;

public class Ejercicio3C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesMenorCad=new String(""),mesMayorCad=new String("");
		int anyoMenor=0,anyoMayor=0,diaMenor=0,diaMayor=0,mesMenor=0,mesMayor=0;
		
		int numA=0,numM=0,numD=0;
		int diasTotalesMesMenor=0;
		
		System.out.println("Introduce un día: ");
		diaMenor=Entrada.entero();
		System.out.println("Introduce un mes: ");
		mesMenorCad=Entrada.cadena();
		System.out.println("Introduce año: ");
		anyoMenor=Entrada.entero();
		
		System.out.println("Introduce otro día: ");
		diaMayor=Entrada.entero();
		System.out.println("Introduce otro mes: ");
		mesMayorCad=Entrada.cadena();
		System.out.println("Introduce otro año: ");
		anyoMayor=Entrada.entero();
		
		mesMenorCad=mesMenorCad.toLowerCase();
		mesMayorCad=mesMayorCad.toLowerCase();
		
		switch(mesMenorCad)
		{
		case "enero":
			mesMenor=1;
			break;
		case "febrero":
			mesMenor=2;
			break;
		case "marzo":
			mesMenor=3;
			break;
		case "abril":
			mesMenor=4;
			break;
		case "mayo":
			mesMenor=5;
			break;
		case "junio":
			mesMenor=6;
			break;
		case "julio":
			mesMenor=7;
			break;
		case "agosto":
			mesMenor=8;
			break;
		case "septiembre":
			mesMenor=9;
			break;
		case "octubre":
			mesMenor=10;
			break;
		case "noviembre":
			mesMenor=11;
			break;
		case "diciembre":
			mesMenor=12;
			break;
		default:
			System.out.println("Fecha incorrecta");
			mesMenor=-900;				
		}
		
		switch(mesMayorCad)
		{
		case "enero":
			mesMayor=1;
			break;
		case "febrero":
			mesMayor=2;
			break;
		case "marzo":
			mesMayor=3;
			break;
		case "abril":
			mesMayor=4;
			break;
		case "mayo":
			mesMayor=5;
			break;
		case "junio":
			mesMayor=6;
			break;
		case "julio":
			mesMayor=7;
			break;
		case "agosto":
			mesMayor=8;
			break;
		case "septiembre":
			mesMayor=9;
			break;
		case "octubre":
			mesMayor=10;
			break;
		case "noviembre":
			mesMayor=11;
			break;
		case "diciembre":
			mesMayor=12;
			break;
		default:
			System.out.println("Fecha incorrecta");
			mesMayor=-900;				
		}
		
		numA=anyoMayor-anyoMenor;
		
		if(mesMayor<mesMenor) {
			numM=12-mesMenor+mesMayor;
			numA--;
		}
		else
			numM=mesMayor-mesMenor;
	
		if(diaMenor>diaMayor) {
			if (mesMenor == 1 || mesMenor == 3 || mesMenor == 5 || mesMenor == 7 || mesMenor == 8 || mesMenor == 10
					|| mesMenor == 12)
				diasTotalesMesMenor = 31;

			if (mesMenor == 4 || mesMenor == 6 || mesMenor == 9 || mesMenor == 11)
				diasTotalesMesMenor = 30;

			if (mesMenor == 2) {
				if ((anyoMenor % 4 == 0) && ((anyoMenor % 100 != 0) || (anyoMenor % 400 == 0)))
					diasTotalesMesMenor = 29;
				else
					diasTotalesMesMenor = 28;
			}

				numD = diasTotalesMesMenor - diaMenor + diaMayor;
				numM--;
		}
		else
			numD=diaMayor-diaMenor;
		
		System.out.println("Entre las dos fechas hay: "+numA+" años, "+numM+" meses y "+numD+" días");
		
	}

}