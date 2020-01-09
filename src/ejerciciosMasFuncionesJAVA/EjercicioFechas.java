package ejerciciosMasFuncionesJAVA;

public class EjercicioFechas {

	final static int MES_HOY = 12;
	final static int ANIO_HOY = 2019;
	final static int DIA_HOY = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesCad = new String("diciembre");
		int anyo = 0, dia = 0, mes = 0;

		System.out.println("Introduce una fecha ");
		System.out.println("Introduce un día ");
		dia = Entrada.entero();
		System.out.println("Introduce un mes ");
		mesCad = Entrada.cadena().toLowerCase();
		System.out.println("Introduce un año ");
		anyo = Entrada.entero();


		mes = pasaMesAEntero(mesCad);

		System.out.println("La fecha es " + fechaCorrecta(dia, mes, anyo));

		calculaEdad(dia,mes,anyo);

	}

	public static boolean esBisiesto(int anyo) {
	

		if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {
			return true;
		} else {
			return false;
		}
		
	}

	public static int diasMes(int mes, int anyo) {

		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		} else {
			if (mes == 2) {
				if (esBisiesto(anyo)) {
					return 29;
				} else {
					return 28;
				}
			} else {
				return 31;
			}
		}
	}

	public static int pasaMesAEntero(String mesCad) {
		int mesNum = 0;

		switch (mesCad) {
		case ("enero"):
			mesNum = 1;
			break;
		case ("febrero"):
			mesNum = 2;
			break;
		case ("marzo"):
			mesNum = 3;
			break;
		case ("abril"):
			mesNum = 4;
			break;
		case ("mayo"):
			mesNum = 5;
			break;
		case ("junio"):
			mesNum = 6;
			break;
		case ("julio"):
			mesNum = 7;
			break;
		case ("agosto"):
			mesNum = 8;
			break;
		case ("septiembre"):
			mesNum = 9;
			break;
		case ("octubre"):
			mesNum = 10;
			break;
		case ("noviembre"):
			mesNum = 11;
			break;
		case ("diciembre"):
			mesNum = 12;
			break;
		}
		return mesNum;
	}

	public static boolean fechaCorrecta(int dia, int mes, int anyo) {
		

		if (((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) || 
				(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes==8 || mes==10 || mes==12) && dia > 31
				|| mes == 2 && dia > 29 && (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0))
				|| mes == 2 && dia > 28 && !(anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esMayor(int dia, int mes) {

		if ((dia>=DIA_HOY && mes==MES_HOY) || mes>MES_HOY) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void calculaEdad(int dia, int mes, int anyo) {
	
		int edad = 0;

		edad = ANIO_HOY - anyo;

		if (mes > MES_HOY) {
			edad--;
		} else if (mes == MES_HOY && dia > DIA_HOY) {
			edad--;
		}

		System.out.println("Tienes " + edad + " años");
	}

}
