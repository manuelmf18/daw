package practica6_JAVA;

public class GestionHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotel hotel1 = new Hotel("HOTEL BUDAPEST"); // rellenar
		int op = 0;

		System.out.println("\n\n-----Bienvenido al " + hotel1 + "------\n");

		while (op != 5) {
			System.out.println("\n\n¿Qué quieres hacer?\n1.Añadir habitación" + "\n2.Añadir reserva a habitación"
					+ "\n3.Ver habitaciones ordenadas por número de habitación"
					+ "\n4.Ver habitaciones ordenadas por cantidad de reservas actuales" + "\n5.Salir\n");
			op = Entrada.entero();

			switch (op) {
			case 1:
				System.out.println("Indica el número de habitación:");
				
				System.out.println("Indica la cantidad máxima de reservas que se pueden realizar:");
				
				break;
			case 2:
				System.out.println("¿Qué habitación desea reservar?");
				
				System.out.println("Indique apellidos de la reserva:");
				
				System.out.println("Indique nombre de la reserva:");
				
				System.out.println("Indique DNI de la reserva:");
				
				System.out.println("Indique dia fecha de entrada");
				
				System.out.println("Indique mes fecha de entrada");
				
				System.out.println("Indique año fecha de entrada");
				
				System.out.println("Indique dia fecha de salida");
				
				System.out.println("Indique mes fecha de salida");
				
				System.out.println("Indique año fecha de salida");
				
				
				if() {
					System.out.println("La reserva se ha podido realizar con éxito");
				}else {
					System.out.println("No se pudo realizar la reserva");
				}
				break;
			case 3:
				System.out.println("\nAñadir a matriz de juego...\n");
				
				break;
			case 4:
				System.out.println("\nBuscar cadena en matriz de juego...\n");
				
				break;
			case 5:
				System.out.println("Hasta luegor!");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}
	}
}
