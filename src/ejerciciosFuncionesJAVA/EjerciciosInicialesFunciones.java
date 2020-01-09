package ejerciciosFuncionesJAVA;

public class EjerciciosInicialesFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num1 = 0, num2 = 0, max = 0;
		int num3 = 0;
		double radio = 0, altura = 0;

		// Prueba Ejercicio 1
		/*
		 * System.out.println("Escribe un número: "); num=Entrada.entero();
		 * ejecucionModulo(num);
		 */

		// Prueba Ejercicio 2
		/*
		 * System.out.println("Introduzca un numero"); num1=Entrada.entero();
		 * System.out.println("Introduzca otro numero"); num2=Entrada.entero();
		 * max=maximo(num1,num2);
		 * System.out.println("El máximo entre "+num1+" y "+num2+" es: "+max);
		 */

		// Prueba Ejercicio 3
		/*
		 * System.out.println("Introduzca un numero"); num1 = Entrada.entero();
		 * System.out.println("Introduzca otro numero"); num2 = Entrada.entero();
		 * System.out.println("Introduzca el último numero"); num3 = Entrada.entero();
		 * max = maximode3(num1, num2, num3); System.out.println("El máximo entre " +
		 * num1 + ", " + num2 + " y " + num3 + " es: "+max);
		 */

		// Prueba Ejercicio 4
		/*
		 * System.out.println("Introduzca un numero"); num1 = Entrada.entero();
		 * System.out.println("Introduzca otro numero"); num2 = Entrada.entero();
		 */

		// Prueba Ejercicio 5
		/*
		 * System.out.println("Introduzca un numero"); num1 = Entrada.entero();
		 * num1=doble(num1); System.out.println(num1);
		 */

		// Prueba Ejercicio 6
		//cilindro();
		
		
		// Prueba Ejercicio 7
		
		
		
		// Prueba Ejercicio 8
		
		
		
		// Prueba Ejercicio 9
		
		
		
		// Prueba Ejercicio 10
		
		
		
	}

	public static void ejecucionModulo(int n) {

		while (n > 0) {
			System.out.println("Módulo Ejecutándose");
			n--;
		}
	}

	public static int maximo(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int maximode3(int num1, int num2, int num3) {
		int mayor = maximo(num1, num2);
		mayor = maximo(mayor, num3);

		return mayor;
	}

	public static void numerosentre(int num1, int num2) {
		int muestra = 0;
		while (num1 <= num2) {
			muestra = num1;
			System.out.println(muestra);
			muestra++;
		}
	}

	public static int doble(int num1) {
		num1 = num1 * 2;
		return num1;
	}

	//public static  double cilindro(double radio) {
		// 2pi*radio*altura a
		// pi*radio^2*altura v
		
		//return a;
		
		//return v;
	}

//}