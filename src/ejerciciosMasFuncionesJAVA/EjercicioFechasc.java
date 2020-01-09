package ejerciciosMasFuncionesJAVA;

public class EjercicioFechasc {

	final static int DIA_HOY = 3;
	final static int MES_HOY = 11;
	final static int ANYO_HOY = 2019;
	
	//Ismael Pozo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = 0;
		String mes = new String(" ");
		int anyo = 0;
		int mesEntero = 0;

		System.out.println("Introduce la fecha de nacimiento");
		System.out.println("Introduce el dia");
		dia = Entrada.entero();
		System.out.println("Introduce el mes");
		mes = Entrada.cadena();
		System.out.println("Introduce el año");
		anyo = Entrada.entero();
		
		mesEntero = pasaMesAEntero(mes);

		while (!fechaCorrecta(dia, mesEntero, anyo)) {
			System.err.println("fecha introducida incorrecta vuelve a introducirla");
			System.out.println("Introduce la fecha de nacimiento");
			System.out.println("Introduce el dia");
			dia = Entrada.entero();
			System.out.println("Introduce el mes");
			mes = Entrada.cadena();
			System.out.println("Introduce el año");
			anyo = Entrada.entero();
			
			mesEntero = pasaMesAEntero(mes);
		}
		
		calculaEdad(dia,mesEntero,anyo);
	}

	//Fran Domínguez
	public static boolean esBisiesto(int anyo) {
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0)))
			return true;
		else
			return false;
	}
	
	//Jose Miguel Ferreira
	public static int diasMes(int mes, int anyo) {
		
		int dia=0;
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			dia=31;
		}
		
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			dia=30;
		}
		
		if (mes==2 && esBisiesto(anyo)==true) {
			dia=29;
		}		
		else {
			dia=28;
		}
		
		return dia;
	}
	
	//Enrique Hurtado
	public static boolean fechaCorrecta(int dia, int mes, int anyo)
	{
		if (dia>diasMes(mes,anyo) || dia<1 || mes<1 
				|| anyo>ANYO_HOY || (anyo==ANYO_HOY && esMayor(dia,mes)) ){
			return false;
		}
		else {
			return true;
		}
	}
	
	//Daniel Gómez
	public static int pasaMesAEntero(String mesCad) {
		switch (mesCad) {
		case "enero":
			return 1;

		case "febrero":
			return 2;

		case "marzo":
			return 3;

		case "abril":
			return 4;

		case "mayo":
			return 5;

		case "junio":
			return 6;

		case "julio":
			return 7;

		case "agosto":
			return 8;

		case "septiembre":
			return 9;
		case "octubre":
			return 10;
		case "noviembre":
			return 11;
		case "diciembre":
			return 12;
		default:
			return -1;
		}
	}
	
	//Antonio Gómez Rodríguez
	public static boolean esMayor(int dia, int mes) {

		if ((dia>=DIA_HOY && mes==MES_HOY) || mes>MES_HOY) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Cristian
	public static void calculaEdad (int dia, int mes, int anyo) {
		int edad = 0;
		edad = ANYO_HOY-anyo;
		
		if(esMayor(dia,mes)) 
			edad--;
		
		System.out.println("Tu edad es: "+edad);
	}
}