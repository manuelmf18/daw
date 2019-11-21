package ejerciciosJAVAI;

public class Ejercicio2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia = 0, anio = 0, edad = 0, mesnum = 0;
		String mes = new String("");
		final int DIAF = 13, ANIOF = 2019, MESF = 11;
		boolean fecha=false;

		System.out.println("¿En qué día naciste?");
		dia = Entrada.entero();
		System.out.println("¿En qué mes naciste?");
		mes = Entrada.cadena();
		System.out.println("En qué año naciste");
		anio = Entrada.entero();


		
		//comprobar si la fecha es correcta
		while (fecha == false) {
			System.out.println("Inserta el día (número)");
			dia = Entrada.entero();

			System.out.println("Inserta el mes (letras)");
			mes = Entrada.cadena();

			System.out.println("Inserta el año (número)");
			anio = Entrada.entero();

			switch (mes) {
			case ("Enero"):
				mesnum = 1;
				break;
			case ("Febrero"):
				mesnum = 2;
				break;
			case ("Marzo"):
				mesnum = 3;
				break;
			case ("Abril"):
				mesnum = 4;
				break;
			case ("Mayo"):
				mesnum = 5;
				break;
			case ("Junio"):
				mesnum = 6;
				break;
			case ("Julio"):
				mesnum = 7;
				break;
			case ("Agosto"):
				mesnum = 8;
				break;
			case ("Septiembre"):
				mesnum = 9;
				break;
			case ("Octubre"):
				mesnum = 10;
				break;
			case ("Noviembre"):
				mesnum = 11;
				break;
			case ("Diciembre"):
				mesnum = 12;
				break;
			}
			if (((mesnum == 4 || mesnum == 6 || mesnum == 9 || mesnum == 11) && dia > 30) || (dia > 31)
					|| (mesnum == 2 && dia > 29 && (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)))
					|| (mesnum == 2 && dia > 28 && !(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0))
					|| (anio > ANIOF || (anio == ANIOF && mesnum > MESF)
							|| (anio == ANIOF && mesnum == MESF && dia > DIAF)))) {
				System.out.println("Debes dar una fecha correcta");
			} else {
				fecha = true;
			}
		}
		
		edad = ANIOF - anio;
		
		if (mesnum>MESF) {
			edad--;
		} else if (mesnum == MESF && dia > DIAF) {
			edad--;
		}
		
		System.out.println("Tienes " + edad + " años");
	}

}
