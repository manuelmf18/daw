package ejerciciosJAVAI;


public class Ejercicio3C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, c1 = 0, c2 = 0, c3 = 0, cont = 0, resul1 = 1, resul2 = 1, resul3 = 1;
		System.out.println("introduzca un numero de maximo tres cifras ");
		num = Entrada.entero();
		c1 = num % 10;
		c2 = (num / 10) % 10;
		c3 = num / 100;
		while (cont < 3) {
			resul1 = resul1 * c1;
			resul2 = resul2 * c2;
			resul3 = resul3 * c3;
			cont++;
		}
		if (num == resul1 + resul2 + resul3) {
			System.out.println(" es un numero armstrong ");
		} else {
			System.out.println(" no es un numero armstrong ");
		}
	}

}
