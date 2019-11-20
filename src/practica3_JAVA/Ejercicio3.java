package practica3_JAVA;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pide al usuario dos fechas e imprime por pantalla cuantos años, meses y días
		// hay entre una fecha y otra

		int dia1 = 0, mes1 = 0, anyo1 = 0, dia2 = 0, mes2 = 0, anyo2 = 0, mesDif = 0, diaDif = 0, anyoDif = 0;
		String mesInt1 = " ", mesInt2 = " ";

		System.out.println("Introduce un día");
		dia1 = Entrada.entero();
		System.out.println("Introduce un mes");
		mesInt1 = Entrada.cadena();
		System.out.println("Introduce un año");
		anyo1 = Entrada.entero();

		System.out.println("Introduce un día para la otra fecha");
		dia2 = Entrada.entero();
		System.out.println("Introduce un mes");
		mesInt2 = Entrada.cadena();
		System.out.println("Introduce un año");
		anyo2 = Entrada.entero();

		String mesCadena1 = mesInt1.toLowerCase();
		String mesCadena2 = mesInt2.toLowerCase();

		switch (mesCadena1) {
		case "enero":
			mes1 = 1;
			break;
		case "febrero":
			mes1 = 2;
			break;
		case "marzo":
			mes1 = 3;
			break;
		case "abril":
			mes1 = 4;
			break;
		case "mayo":
			mes1 = 5;
			break;
		case "junio":
			mes1 = 6;
			break;
		case "julio":
			mes1 = 7;
			break;
		case "agosto":
			mes1 = 8;
			break;
		case "septiembre":
			mes1 = 9;
			break;
		case "octubre":
			mes1 = 10;
			break;
		case "noviembre":
			mes1 = 11;
			break;
		case "diciembre":
			mes1 = 12;
			break;
		}

		switch (mesCadena2) {
		case "enero":
			mes2 = 1;
			break;
		case "febrero":
			mes2 = 2;
			break;
		case "marzo":
			mes2 = 3;
			break;
		case "abril":
			mes2 = 4;
			break;
		case "mayo":
			mes2 = 5;
			break;
		case "junio":
			mes2 = 6;
			break;
		case "julio":
			mes2 = 7;
			break;
		case "agosto":
			mes2 = 8;
			break;
		case "septiembre":
			mes2 = 9;
			break;
		case "octubre":
			mes2 = 10;
			break;
		case "noviembre":
			mes2 = 11;
			break;
		case "diciembre":
			mes2 = 12;
			break;
		}
		anyoDif = anyo2 - anyo1;
		if (dia1 == dia2 && mes1 == mes2) {
			mesDif = 0;
			diaDif = 0;
		} else {
			if (mes2 < mes1) {
				anyoDif--;
				mesDif = (12 - (mes1+1))+mes2;
			} else {
				mesDif = mes2 - (mes1 + 1);
			}
			if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
				diaDif = (31 - dia1) + dia2;
			} else {
				if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
					diaDif = (30 - dia1) + dia2;
				} else {
					if (mes1 == 2 && !(anyo1 % 4 == 0 && (!(anyo1 % 100 == 0) || anyo1 % 400 == 0))) {
						diaDif = (28 - dia1) + dia2;
					} else {
						diaDif = (29 - dia1) + dia2;
					}
				}
			}
			if (mesDif>12) {
				mesDif=mesDif-12;
				anyoDif++;
			}
			if (diaDif >= 31) { // doy por supuesto que en los meses totales al mostrar la diferencia de fechas
								// un mes son 31 días
				mesDif++;
				diaDif = diaDif - 31;
			}
		}
		if (anyo1 == anyo2 && (mes1 == 1 && mes2 == 12) && (dia1 == 1 && dia2 == 31)) {
			anyoDif = 1;
			mesDif = 0;
			diaDif = 0;
		}
		System.out.println("Entre las dos fechas hay: " + anyoDif + " años, " + mesDif + " meses, " + diaDif + " días");

	}

}