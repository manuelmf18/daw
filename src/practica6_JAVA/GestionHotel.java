package practica6_JAVA;

public class GestionHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotel hotel1 = new Hotel("HOTEL BUDAPEST"); // rellenar
		int op = 0;

		System.out.println("\n\n-----Bienvenido al " + hotel1 + "------\n");

		while (op != 5) {
			System.out.println("\n\n�Qu� quieres hacer?\n1.A�adir habitaci�n" + "\n2.A�adir reserva a habitaci�n"
					+ "\n3.Ver habitaciones ordenadas por n�mero de habitaci�n"
					+ "\n4.Ver habitaciones ordenadas por cantidad de reservas actuales" + "\n5.Salir\n");
			op = Entrada.entero();

			switch (op) {
			case 1:
				System.out.println("Indica el n�mero de habitaci�n:");
				
				System.out.println("Indica la cantidad m�xima de reservas que se pueden realizar:");
				
				break;
			case 2:
				System.out.println("�Qu� habitaci�n desea reservar?");
				
				System.out.println("Indique apellidos de la reserva:");
				
				System.out.println("Indique nombre de la reserva:");
				
				System.out.println("Indique DNI de la reserva:");
				
				System.out.println("Indique dia fecha de entrada");
				
				System.out.println("Indique mes fecha de entrada");
				
				System.out.println("Indique a�o fecha de entrada");
				
				System.out.println("Indique dia fecha de salida");
				
				System.out.println("Indique mes fecha de salida");
				
				System.out.println("Indique a�o fecha de salida");
				
				
				if() {
					System.out.println("La reserva se ha podido realizar con �xito");
				}else {
					System.out.println("No se pudo realizar la reserva");
				}
				break;
			case 3:
				System.out.println("\nA�adir a matriz de juego...\n");
				
				break;
			case 4:
				System.out.println("\nBuscar cadena en matriz de juego...\n");
				
				break;
			case 5:
				System.out.println("Hasta luegor!");
				break;
			default:
				System.out.println("Opci�n incorrecta");
			}
		}
	}
}
