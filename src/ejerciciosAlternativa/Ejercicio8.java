package ejerciciosAlternativa;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double PI = 3.14;

		double areaTriangulo = 0;
		double base = 0;
		double altura = 0;
		double areaCirculo = 0;
		double radio = 0;

		System.out.println("VAMOS A CALCULAR EL AREA DE UN TRIANGULO");

		System.out.println(" ");

		System.out.println("Introduce la base: ");
		base = Entrada.real();

		System.out.println("Introduce la altura: ");
		altura = Entrada.real();

		areaTriangulo = ((base * altura) / 2);

		System.out.println("VAMOS A CALCULAR EL AREA DE UN CIRCULO");

		System.out.println(" ");

		System.out.println("Introduce el radio: ");
		radio = Entrada.real();

		areaCirculo = PI * (Math.pow(radio, 2));

		if (areaTriangulo > areaCirculo) {
			System.out.println("La figura mayor es el TRIANGULO: " + areaTriangulo + " unidades cuadradas");
		} else {
			if (areaTriangulo < areaCirculo) {
				System.out.println("La figura mayor es el CIRCULO: " + areaCirculo + " unidades cuadradas");
			} else {
				System.out.println("Amabas areas son iguales");
			}
		}

	}

}
