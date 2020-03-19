package practica6_JAVA;

public class Reserva {
	private Persona personaResponsable;
	private Fecha fechaEntrada;
	private Fecha fechaSalida;

	// constructor con parámetros
	public Reserva(Persona personaResponsable, Fecha fechaEntrada, Fecha fechaSalida) {
		this.personaResponsable = personaResponsable;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
	}

	// getters
	public Persona getPersonaResponsable() {
		return personaResponsable;
	}

	public Fecha getFechaEntrada() {
		return fechaEntrada;
	}

	public Fecha getFechaSalida() {
		return fechaSalida;
	}

	// setters
	public void setFechaEntrada(int dia, String mes, int anyo) { 
		this.fechaEntrada.setDia(dia);
		this.fechaEntrada.setMes(mes);
		this.fechaEntrada.setAnyo(anyo);
	}

	public void setFechaSalida(int dia, String mes, int anyo) {
		this.fechaSalida.setDia(dia);
		this.fechaSalida.setMes(mes);
		this.fechaSalida.setAnyo(anyo);
	}

	// método
	public void imprimeReserva() { 
		System.out.println(
				"\n__________________________________________________________________________________________________\n");
		System.out.println("Fecha de entrada: " + fechaEntrada.getDia() + " de " + fechaEntrada.getMes() + " del "
				+ fechaEntrada.getAnyo());
		System.out.println("Fecha de salida: " + fechaSalida.getDia() + " de " + fechaSalida.getMes() + " del "
				+ fechaSalida.getAnyo());
		System.out.println("Reserva a nombre de: " + personaResponsable + " con DNI: " + personaResponsable.getDni());
		System.out.println(
				"\n__________________________________________________________________________________________________\n");
	}
}
