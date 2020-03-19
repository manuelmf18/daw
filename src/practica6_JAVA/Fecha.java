package practica6_JAVA;

public class Fecha {
	private int dia;
	private String mes;
	private int anyo;

	// constructor con parámetros
	public Fecha(int dia, String mes, int anyo) {
		if (esFechaCorrecta()) {
			this.dia = dia;
			this.mes = mes;
			this.anyo = anyo;

		} else {
			this.dia = 1;
			this.mes = "enero";
			this.anyo = 2020;
		}
	}

	// constructor copia
	public Fecha(Fecha fechaCopia) {
		this.dia = fechaCopia.dia;
		this.mes = fechaCopia.mes;
		this.anyo = fechaCopia.anyo;
	}

	// getters
	public int getDia() {
		return dia;
	}

	public String getMes() {
		return mes;
	}

	public int getAnyo() {
		return anyo;
	}

	// setters
	public void setDia(int dia) {
		int temp = this.dia;
		this.dia = dia;
		if (!esFechaCorrecta()) {
			this.dia = temp;
		}
	}

	public void setMes(String mes) {
		String temp = this.mes;
		this.mes = mes;
		if (!esFechaCorrecta()) {
			this.mes = temp;
		}
	}

	public void setAnyo(int anyo) {
		int temp = this.anyo;
		this.anyo = anyo;
		if (!esFechaCorrecta()) {
			this.anyo = temp;
		}
	}

	// métodos
	public boolean esBisiesto() {
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0)))
			return true;
		else
			return false;
	}

	public int devuelveMesNumerico() {
		switch (mes) {
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

	public int devuelveDiasTotalesDelMes() {
		switch (mes) {
		case "enero":
			return 31;

		case "febrero":
			if (esBisiesto()) {
				return 29;
			} else {
				return 28;
			}

		case "marzo":
			return 31;

		case "abril":
			return 30;

		case "mayo":
			return 31;

		case "junio":
			return 30;

		case "julio":
			return 31;

		case "agosto":
			return 31;

		case "septiembre":
			return 30;
		case "octubre":
			return 31;
		case "noviembre":
			return 30;
		case "diciembre":
			return 31;
		default:
			return -1;
		}
	}

	public boolean esFechaCorrecta() {
		if ((devuelveDiasTotalesDelMes() != -1) && (devuelveMesNumerico() != -1)) { // && (this.anyo < 2020)
			return true;
		} else {
			return false;
		}
	}

	public boolean esIgual(Fecha fecha) {
		if ((this.dia == fecha.getDia()) && (this.mes.equals(fecha.getMes())) && (this.anyo == fecha.getAnyo())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esMenor(Fecha fecha) {
		if (this.anyo > fecha.getAnyo()) {
			return true;
		} else {
			if (this.anyo == fecha.getAnyo()) {
				if (this.mes.compareTo(fecha.getMes()) > 0) {
					return true;
				} else {
					if (this.mes.compareTo(fecha.getMes()) == 0) {
						if (this.dia > fecha.getDia()) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean esMayor(Fecha fecha) { // misma variable¿?
		if (this.anyo < fecha.getAnyo()) {
			return true;
		} else {
			if (this.anyo == fecha.getAnyo()) {
				if (this.mes.compareTo(fecha.getMes()) < 0) {
					return true;
				} else {
					if (this.mes.compareTo(fecha.getMes()) == 0) {
						if (this.dia < fecha.getDia()) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean esMayorOIgual(Fecha fecha) {
		if (esIgual(fecha) || esMayor(fecha)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esMenorOIgual(Fecha fecha) {
		if (esIgual(fecha) || esMenor(fecha)) {
			return true;
		} else {
			return false;
		}
	}

}