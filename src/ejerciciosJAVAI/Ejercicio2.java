package ejerciciosJAVAI;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pide una fecha de nacimiento al usuario y dice cuantos años tiene hoy
		int dia = 0, dia_actual = 13, anyo = 0, anyo_actual = 2019, mes_num = 0, mes_actual = 11, anyos_tiene = 0;
		String mes = new String("enero");
		boolean fecha_correcta= true;
		
		System.out.println("Introduce día");
		dia = Entrada.entero();
		System.out.println("Introduce mes");
		mes = Entrada.cadena();
		System.out.println("Introduce año");
		anyo = Entrada.entero();

		switch (mes) {
		case "enero":
			mes_num = 1;
			break;
		case "febrero":
			mes_num = 2;
			break;
		case "marzo":
			mes_num = 3;
			break;
		case "abril":
			mes_num = 4;
			break;
		case "mayo":
			mes_num = 5;
			break;
		case "junio":
			mes_num = 6;
			break;
		case "julio":
			mes_num = 7;
			break;
		case "agosto":
			mes_num = 8;
			break;
		case "septiembre":
			mes_num = 9;
			break;
		case "octubre":
			mes_num = 10;
			break;
		case "noviembre":
			mes_num = 11;
			break;
		case "diciembre":
			mes_num = 12;
			break;
		default:
			System.out.println("No has introducido un mes");
		}
		if ((mes_num == 1 || mes_num == 3 || mes_num == 5 || mes_num == 7 || mes_num == 8 || mes_num == 10
				|| mes_num == 12) && (dia < 1 || dia > 31)) {
			System.out.println("Fecha no correcta");
			fecha_correcta= false;
		}
		if ((mes_num == 4 || mes_num == 6 || mes_num == 9 || mes_num == 11) && (dia < 1 || dia > 30)) {
			System.out.println("Fecha no correcta");
			fecha_correcta= false;
		}
		if (mes_num == 2 && ((dia>28 && !(anyo % 4 == 0 && (!(anyo % 100 == 0) || anyo % 400 == 0)))) || dia>29 && (anyo % 4 == 0 && (!(anyo % 100 == 0) || anyo % 400 == 0))) {
			System.out.println("Fecha no correcta");
			fecha_correcta= false;
		}
		if (fecha_correcta== true) {
			anyos_tiene = anyo_actual - anyo;
			if (mes_num == mes_actual) {
				if (dia_actual < dia) {
					anyos_tiene--;
				}
			}
			System.out.println("Tiene " + anyos_tiene + " años");
		}
	}
}
