package ejerciciosAlternativa;

public class Ejercicio10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String usuario1 = "", usuario2 = "";
		System.out.println("¿Qué saca el primer usuario?");
		usuario1 = Entrada.cadena();
		System.out.println("¿Que saca el segundo usuario?");
		usuario2 = Entrada.cadena();

		if (usuario1 == usuario2) {
			System.out.println("Hay empate");
		} else {
			if (((usuario1 == "tijera") && (usuario2 == "papel")) || ((usuario1 == "papel") && (usuario2 == "piedra"))
					|| ((usuario1 == "piedra") && (usuario2 == "tijera"))) {

				System.out.println("Ganador usuario 1");

			} else {
				System.out.println("Gana el usuario 2");
			}

		}

	}

}
