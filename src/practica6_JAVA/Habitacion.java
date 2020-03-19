package practica6_JAVA;

class Habitacion {
	private static int totalHabitaciones;
	private int numHabitacion;
	private Reserva[] reservasHabitacion; //cuantas reservas puede tener una habitacion se le pasa ?
	private int posicionLibre; // apunta para posicion libre del vector ¿?

	// constructor con parámetros
	public Habitacion(int numHabitacion, int maxReservasHabitacion) { // falta, no tiene mucho sentido
		this.numHabitacion = numHabitacion;
		this.reservasHabitacion[maxReservasHabitacion] = reservasHabitacion[maxReservasHabitacion];
		totalHabitaciones++;
	}

	// getters
	public int getTotalHabitaciones() {
		return totalHabitaciones;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public int getReservasHabitacion(int numHabitacion) { // falta
		return  ;
	}
	
	public int posicionLibre() {
		return posicionLibre;
	}

	// setters
	public void setNumHabitacion() {
		this.numHabitacion = numHabitacion;
	}

	// métodos
	public boolean anyadeReserva(Reserva reserva) { //utilidad de las demas comparaciones
		if(posicionLibre<reservasHabitacion.length-1) { //hay 4 posibles casos de solapamiento
			if(reserva.getFechaEntrada().esMenorOIgual(reserva.getFechaSalida())) {
				for (int i=0; i<getReservasHabitacion(numHabitacion); i++) {
					if(!()) { //con las demas reservas de la habitacion // falta
						return false;
					}
				}
				return true;
			}
		}
	}

	public void imprimirReservas() {
		int i = 1;
		while (i <= posicionLibre) {
			System.out.println("Reserva nº:" + i);
			imprimirReservas();
		}
	}
}
