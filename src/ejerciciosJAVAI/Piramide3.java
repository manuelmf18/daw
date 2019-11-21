package ejerciciosJAVAI;

public class Piramide3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//da el doble del numero -1 de base 
		int base= 0;

		System.out.println("Escribe la base que tendrá la pirámide");
		base = Entrada.entero();
		
		for (int i = 0; i <= base; i++) {
			
				for (int j = 0; j < base-i; j++) { //si cambio -i por -1 me da media pirámide con base y a la mitad de base de espacios de distancia 
					System.out.print(" ");
				}
				for (int k = 0; k < (i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
